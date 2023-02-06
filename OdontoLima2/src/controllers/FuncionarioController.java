package controllers;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import models.Funcionario;
import services.Db;

public class FuncionarioController {
	
	//INSERT
	public static void addFuncionario(Funcionario f) {
		Connection conn = Db.Connect();
		
		try {
			String sql = "INSERT INTO funcionario "
						+ "(nome,nascimento,cpf,rg,telefone,endereco,email,sexo,funcao)"
						+ " VALUES(?,?,?,?,?,?,?,?,?)";
			
			PreparedStatement st = conn.prepareStatement(sql);
			
			st.setString(1, f.getNome());
			st.setDate(2, Date.valueOf(f.getNascimento()));//conversão de Date to localDate
			st.setString(3, f.getCpf());
			st.setString(4, f.getRg());
			st.setString(5, f.getTelefone());
			st.setString(6, f.getEndereco());
			st.setString(7, f.getEmail());
			st.setString(8, f.getSexo());
			st.setString(9, f.getFuncao());

			
			int rows = st.executeUpdate();
			if(rows != 0) {
				System.out.println("Funcionário cadastrado com sucesso!");
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
	public static ArrayList<Funcionario>findAll(){
	
		ArrayList<Funcionario>list = new ArrayList<Funcionario>();
		Connection conn = Db.Connect();
		
		if(conn == null) {
			System.out.println("Falha na conexão");
		}else {
			try {
				String sql = "SELECT * FROM funcionario";
				Statement st = conn.createStatement();
				ResultSet result = st.executeQuery(sql);
			
				while(result.next()) {
					list.add(new Funcionario(result.getInt("id"),
										  result.getString("nome"),
										  result.getDate("nascimento").toLocalDate(),
										  result.getString("cpf"),
										  result.getString("rg"),
										  result.getString("telefone"),
										  result.getString("endereco"),
										  result.getString("email"),
										  result.getString("sexo"),
										  result.getString("funcao")
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


