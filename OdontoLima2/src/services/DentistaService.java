package services;

import java.time.LocalDate;
import java.util.ArrayList;

import controllers.DentistaController;
import models.Dentista;

public class DentistaService {
	
	public static void cadastrar() {
		Dentista d = new Dentista();

		 int ano;
		 int mes;
		 int dia;


		 System.out.println("Cadastro de Dentista");
		 System.out.println("--------------------");

		 System.out.print("Nome: ");
		 d.setNome(ReadService.entTexto());

		 //Nascimento
		 System.out.print("Ano: ");
		 ano = ReadService.entInt();

		 System.out.print("Mês: ");
		 mes = ReadService.entInt();

		 System.out.print("Dia: ");
		 dia = ReadService.entInt();

		 LocalDate nascimento = LocalDate.of(ano,mes,dia);
		 d.setNascimento(nascimento);
		 //

		 System.out.print("CPF: ");
		 d.setCpf(ReadService.entTexto());

		 System.out.print("RG: ");
		 d.setRg(ReadService.entTexto());

		 System.out.print("CRO: ");
		 d.setCro(ReadService.entTexto());

		 System.out.print("Telefone: ");
		 d.setTelefone(ReadService.entTexto());

		 System.out.print("Endereço: ");
		 d.setEndereco(ReadService.entTexto());

		 System.out.print("E-mail: ");
		 d.setEmail(ReadService.entTexto());

		 System.out.print("Gênero: ");
		 d.setSexo(ReadService.entTexto());

		 System.out.print("Especialidade: ");
		 d.setEspecialidade(ReadService.entTexto());

		 DentistaController.addDentista(d);
	}

	public static void consultar() {
		System.out.println("----------------------------- Consulta -----------------------------");
		ArrayList<Dentista> list = DentistaController.findAll();
		for(Dentista d : list) {
			
			Saida.exibirDentista(d);
	}
}
}

