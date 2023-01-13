package view;

import services.DentistaService;
import services.ReadService;

public class Menu {

	public static void menu() {

		while (true) {

			System.out.println("\n-----------------------> OndontoLima System <-----------------------");
			System.out.println(".......................... Seja bem-vindo ..........................\n");

			System.out.println("Escolha uma das opções");
			System.out.println("....................................................................");
			System.out.println("[1] - Cadastrar");
			System.out.println("[2] - Consultar");
			System.out.println("[0] - Sair");
			System.out.println("....................................................................");

			System.out.print("\nDigite aqui: ");
			int op = ReadService.entInt();

			switch (op) {

			case 1:
				cadastrar();
				break;

			case 2:
				consultar();
				break;

			case 3:
				System.out.println("\nSaindo do Sistema...\n" + "Obrigado por utilizar \n" + "Volte sempre!");
				System.exit(0);

			}

		}  
	}

	public static void cadastrar() {
		System.out.println("------------------------ ÁREA DE CADASTRO --------------------------\n");
		System.out.println("\nEscolha uma das opções");
		System.out.println("....................................................................");
		System.out.println("[1] - Paciente");
		System.out.println("[2] - Funcionario");
		System.out.println("[3] - Dentista");
		System.out.println("[0] - Sair");
		System.out.println("....................................................................");
		System.out.print("\nDigite aqui: ");
		int op = ReadService.entInt();

		switch (op) {
		case 1:
			break;

		case 2:
			break;

		case 3:
			DentistaService.cadastrar();
			break;

		case 0:
			System.out.println("\nSaindo do Sistema...\n" + "Obrigado por utilizar \n" + "Volte sempre!");
			System.exit(0);

		}

	}

	public static void consultar() {
		System.out.println("------------------------ ÁREA DE CONSULTA -------------------------\n");

		System.out.println("\nEscolha uma das opções");
		System.out.println("....................................................................");
		System.out.println("[1] - Paciente");
		System.out.println("[2] - Funcionario");
		System.out.println("[3] - Dentista");
		System.out.println("[0] - Sair");
		System.out.println("....................................................................");
		System.out.print("\nDigite aqui: ");
		int op = ReadService.entInt();

		switch (op) {
		case 1:
//			PacienteService.consulta();
			break;

		case 2:
//			FuncionarioService.consulta();
			break;

		case 3:
			DentistaService.consultar();
			break;

		case 0:
			System.out.println("\nSaindo do Sistema...\n" + "Obrigado por utilizar \n" + "Volte sempre!");
			System.exit(0);

		}

	}

} 