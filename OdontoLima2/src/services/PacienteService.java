package services;

import java.time.LocalDate;
import java.util.ArrayList;

 import controllers.PacienteController;
 import models.Paciente;

public class PacienteService {
	
	
	public static void cadastrar() {
		Paciente p = new Paciente();

		 int ano;
		 int mes;
		 int dia;


		 System.out.println("Cadastro de Paciente");
		 System.out.println("--------------------");

		 System.out.print("Nome: ");
		 p.setNome(ReadService.entTexto());

		 //Nascimento
		 System.out.print("Ano: ");
		 ano = ReadService.entInt();

		 System.out.print("Mês: ");
		 mes = ReadService.entInt();

		 System.out.print("Dia: ");
		 dia = ReadService.entInt();

		 LocalDate nascimento = LocalDate.of(ano,mes,dia);
		 p.setNascimento(nascimento);
		 

		 System.out.print("CPF: ");
		 p.setCpf(ReadService.entTexto());

		 System.out.print("RG: ");
		 p.setRg(ReadService.entTexto());

		 System.out.print("Telefone: ");
		 p.setTelefone(ReadService.entTexto());

		 System.out.print("Endereço: ");
		 p.setEndereco(ReadService.entTexto());

		 System.out.print("E-mail: ");
		 p.setEmail(ReadService.entTexto());

		 System.out.print("Gênero: ");
		 p.setSexo(ReadService.entTexto());

		 System.out.print("Responsável: ");
		 p.setResponsavel(ReadService.entTexto());

		 PacienteController.addPaciente(p);
	}

	public static void consultar() {

		System.out.println("----------------------------- Consulta -----------------------------");
		ArrayList<Paciente> list = PacienteController.findAll();
		for(Paciente p : list) {
			
			PacienteService.exibirPaciente(p);
	}
}
		
	public static void exibirPaciente(Paciente p) {
		
		System.out.println("___________________________________________________________________");
		System.out.println(" ");
		
		System.out.println("ID: " 				+ p.getId());
		System.out.println("Nome: "  			+ p.getNome());
		System.out.println("CPF: "  			+ p.getCpf());
		System.out.println("RG: "  				+ p.getRg());
		System.out.println("Telefone: "  		+ p.getTelefone());
		System.out.println("Endereço: "  		+ p.getEndereco());
		System.out.println("E-mail: "  			+ p.getEmail());
		System.out.println("Gênero: "  			+ p.getSexo());
		System.out.println("Responsável: "  	+ p.getResponsavel());
		
		System.out.println("___________________________________________________________________");
		System.out.println(" ");
		
	}

}

