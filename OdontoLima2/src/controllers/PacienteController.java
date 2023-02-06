package controllers;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import models.Paciente;
import services.Db;

public class PacienteController {
	
	//INSERT
	public static void addPaciente(Paciente p) {
		Connection conn = Db.Connect();
		
		try {
			String sql = "INSERT INTO paciente"
						+ "(nome,nascimento,cpf,rg,telefone,endereco,email,sexo,responsavel)"
						+ " VALUES(?,?,?,?,?,?,?,?,?)";
			
			PreparedStatement st = conn.prepareStatement(sql);
			
			st.setString(1, p.getNome());
			st.setDate(2, 	Date.valueOf(p.getNascimento()));//conversão de Date to localDate
			st.setString(3, p.getCpf());
			st.setString(4, p.getRg());
			st.setString(5, p.getTelefone());
			st.setString(6, p.getEndereco());
			st.setString(7, p.getEmail());
			st.setString(8, p.getSexo());
			st.setString(9, p.getResponsavel());


			
			int rows = st.executeUpdate();
			if(rows != 0) {
				System.out.println("Paciente cadastrado com sucesso!");
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
		
	
	//SELECT ALL
	public static ArrayList<Paciente>findAll(){
	
		ArrayList<Paciente>list = new ArrayList<Paciente>();
		Connection conn = Db.Connect();
		
		if(conn == null) {
			System.out.println("Falha na conexão");
		}else {
			try {
				String sql = "SELECT * FROM paciente";
				Statement st = conn.createStatement();
				ResultSet result = st.executeQuery(sql);
			
				while(result.next()) {
					list.add(new Paciente(result.getInt("id"),
										  result.getString("nome"),
										  result.getDate("nascimento").toLocalDate(),
										  result.getString("cpf"),
										  result.getString("rg"),
										  result.getString("telefone"),
										  result.getString("endereco"),
										  result.getString("email"),
										  result.getString("sexo"),
										  result.getString("responsavel")
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


