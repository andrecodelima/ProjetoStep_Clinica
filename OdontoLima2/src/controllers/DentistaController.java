package controllers;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

import models.Dentista;
import services.Db;
import services.ReadService;

public class DentistaController {
	
	public static void addDentista(Dentista d) {
		Connection conn = Db.Connect();
		
		try {
			String sql = "INSERT INTO dentista "
						+ "(nome,nascimento,cpf,rg,cro,telefone,endereco,email,sexo)"
						+ " VALUES(?,?,?,?,?,?,?,?,?)";
			
			PreparedStatement st = conn.prepareStatement(sql);
			
			st.setString(1, d.getNome());
			st.setDate(2, Date.valueOf(d.getNascimento()));//conversão de Date to localDate
			st.setString(3, d.getCpf());
			st.setString(4, d.getRg());
			st.setString(5, d.getCro());
			st.setString(6, d.getTelefone());
			st.setString(7, d.getEndereco());
			st.setString(8, d.getEmail());
			st.setString(9, d.getSexo());

			
			int rows = st.executeUpdate();
			if(rows != 0) {
				System.out.println("Dentista cadastrado com sucesso!");
			}else {
				System.err.println("Falha no cadastro...");
			}
			
			st.close();
			conn.close();
		}
		
		catch(SQLException execpt) {
			System.out.println(execpt);
		}
		
	}
	
		
	public static ArrayList<Dentista>findAll(){
	
		ArrayList<Dentista>list = new ArrayList<Dentista>();
		Connection conn = Db.Connect();
		
		if(conn == null) {
			System.out.println("Falha na conexão");
		}else {
			try {
				String sql = "SELECT * FROM dentista";
				Statement st = conn.createStatement();
				ResultSet result = st.executeQuery(sql);
			
				while(result.next()) {
					list.add(new Dentista(result.getInt("id"),
										  result.getString("nome"),
										  result.getDate("nascimento").toLocalDate(),
										  result.getString("cpf"),
										  result.getString("rg"),
										  result.getString("cro"),
										  result.getString("telefone"),
										  result.getString("endereco"),
										  result.getString("email"),
										  result.getString("sexo"),
										  result.getString("especialidade")
										  )
								);
				}
				
				st.close();
				conn.close();			
			}catch(SQLException except){
				System.out.println(except);
			}
			
		}
		
		return list;	
	}
	
	
	
	
	
	
	
	
}


