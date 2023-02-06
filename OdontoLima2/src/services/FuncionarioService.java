package services;

import java.time.LocalDate;
import java.util.ArrayList;

 import controllers.FuncionarioController;
 import models.Funcionario;

public class FuncionarioService {
	
	
	public static void cadastrar() {
		Funcionario f = new Funcionario();

		 int ano;
		 int mes;
		 int dia;


		 System.out.println("Cadastro de Funcionário");
		 System.out.println("--------------------");

		 System.out.print("Nome: ");
		 f.setNome(ReadService.entTexto());

		 //Nascimento
		 System.out.print("Ano: ");
		 ano = ReadService.entInt();

		 System.out.print("Mês: ");
		 mes = ReadService.entInt();

		 System.out.print("Dia: ");
		 dia = ReadService.entInt();

		 LocalDate nascimento = LocalDate.of(ano,mes,dia);
		 f.setNascimento(nascimento);
		 //

		 System.out.print("CPF: ");
		 f.setCpf(ReadService.entTexto());

		 System.out.print("RG: ");
		 f.setRg(ReadService.entTexto());

		 System.out.print("Telefone: ");
		 f.setTelefone(ReadService.entTexto());

		 System.out.print("Endereço: ");
		 f.setEndereco(ReadService.entTexto());

		 System.out.print("E-mail: ");
		 f.setEmail(ReadService.entTexto());

		 System.out.print("Gênero: ");
		 f.setSexo(ReadService.entTexto());

		 System.out.print("Função: ");
		 f.setFuncao(ReadService.entTexto());

		 FuncionarioController.addFuncionario(f);
	}

	public static void consultar() {

		System.out.println("----------------------------- Consulta -----------------------------");
		ArrayList<Funcionario> list = FuncionarioController.findAll();
		for(Funcionario f : list) {
			
			FuncionarioService.exibirFuncionario(f);
	}
}
		
	public static void exibirFuncionario(Funcionario f) {
		
		System.out.println("___________________________________________________________________");
		System.out.println(" ");
		
		System.out.println("ID: " 				+ f.getId());
		System.out.println("Nome: "  			+ f.getNome());
		System.out.println("CPF: "  			+ f.getCpf());
		System.out.println("RG: "  				+ f.getRg());
		System.out.println("Telefone: "  		+ f.getTelefone());
		System.out.println("Endereço: "  		+ f.getEndereco());
		System.out.println("E-mail: "  			+ f.getEmail());
		System.out.println("Gênero: "  			+ f.getSexo());
		System.out.println("Função: "  			+ f.getFuncao());
		
		System.out.println("___________________________________________________________________");
		System.out.println(" ");
		
	}

}

