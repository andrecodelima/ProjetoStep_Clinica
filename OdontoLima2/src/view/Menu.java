package view;

import java.util.ArrayList;
import java.util.Scanner;

import controllers.DentistaController;
import models.Dentista;
import services.Saida;

public class Menu {

	public static void menu() {
		
		while(true) {
			Scanner sc = new Scanner(System.in);

			System.out.println("---------> OndontoLima System <----------");
			System.out.println("............ Seja bem-vindo .............\n");
			
			System.out.println("Escolha uma das opções");
			System.out.println(".......................");
			System.out.println("[1] - Cadastrar");
			System.out.println("[2] - Consultar");
			System.out.println("[3] - Sair");
			System.out.println(".......................");
			
			System.out.print("Digite aqui: ");
			int op = sc.nextInt();
			
			switch(op) {
			case 1:
				break;
				
			case 2:
				System.out.println("|Consulta|");
				ArrayList<Dentista> list = DentistaController.findAll();
				for(Dentista d : list) {
					
					Saida.exibirDentista(d);
				}
				break;
			
			case 3:
				System.out.println("Saindo do Sistema...\n"
								+ "Obrigado por utilizar \n"
								+ "Volte sempre!");
				System.exit(0);
			
			}
			
			
		}
		
		
		
	
	}//
}
