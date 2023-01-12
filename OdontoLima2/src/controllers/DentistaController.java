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
import services.Entrada;

public class DentistaController {
	
	public static void addDentista(Dentista d) {
		Connection conn = Db.Connect();
		
		try {
			String sql = "INSERT INTO dentista "
						+ "(nome,nascimmento,cpf,rg,cro,telefone,endereco,email,sexo)"
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
	
	
	public static void cadastrar() {
		Dentista d = new Dentista();
		
		 int ano;
		 int mes;
		 int dia;
		
		
		 System.out.println("Cadastro de Dentista");
		 System.out.println("--------------------");
		 
		 System.out.print("Nome: ");
		 d.setNome(Entrada.entTexto());
		 
		 //Nascimento
		 System.out.print("Ano: ");
		 ano = Entrada.entInt();
		 
		 System.out.print("Mês: ");
		 mes = Entrada.entInt();
		 
		 System.out.print("Dia: ");
		 dia = Entrada.entInt();
		 
		 LocalDate nascimento = LocalDate.of(ano,mes,dia);
		 d.setNascimento(nascimento);
		 //
		 
		 System.out.print("CPF: ");
		 d.setCpf(Entrada.entTexto());
		 
		 System.out.print("RG: ");
		 d.setRg(Entrada.entTexto());
		 
		 System.out.print("CRO: ");
		 d.setCro(Entrada.entTexto());
		 
		 System.out.print("Telefone: ");
		 d.setTelefone(Entrada.entTexto());
		 
		 System.out.print("Endereço: ");
		 d.setEndereco(Entrada.entTexto());
		 
		 System.out.print("E-mail: ");
		 d.setEmail(Entrada.entTexto());
		 
		 System.out.print("Gênero: ");
		 d.setSexo(Entrada.entTexto());
		 
		 System.out.print("Especialidade: ");
		 d.setEspecialidade(Entrada.entTexto());
		 
		 DentistaController.addDentista(d);
	}
	
//	public static void exibirDentista(Dentista d) {
//		
//		System.out.println("ID: " 				+ d.getId());
//		System.out.println("Nome: "  			+ d.getNome());
//		System.out.println("CPF: "  			+ d.getCpf());
//		System.out.println("RG: "  				+ d.getRg());
//		System.out.println("CRO: "  			+ d.getCro());
//		System.out.println("Telefone: "  		+ d.getTelefone());
//		System.out.println("Endereço: "  		+ d.getEndereco());
//		System.out.println("E-mail: "  			+ d.getEmail());
//		System.out.println("Gênero: "  			+ d.getSexo());
//		System.out.println("Especialidade: "  	+ d.getEspecialidade());
//		
//	}
	
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


