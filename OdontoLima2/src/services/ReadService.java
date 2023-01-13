package services;

import java.util.Scanner;

public class ReadService {
	public static String entTexto() {
		
		String valor = "";
		
		try {
			Scanner sc = new Scanner(System.in);
			valor = sc.next();
//			sc.close();
			
		}catch(Exception e) {
			System.err.println("\nTexto inválido!");
		}

		return valor;
		
	}

	public static int entInt() {

		int valor = 0;
		boolean certo = false;

		while (certo != true) {
			try {
				Scanner sc = new Scanner(System.in);
				valor = sc.nextInt();
				certo = true;
				
			} catch (Exception e) {
				System.out.print("ERRO\n" + "Número inteiro solicitado! \n" + "Tente outra vez: ");
			}
		}
//		sc.close();
		return valor;
		
	}

	public static double entDecimal() {

		double valor = 0;
		boolean certo = false;

		while (certo != true) {
			try {
				Scanner sc = new Scanner(System.in);
				valor = sc.nextDouble();
				certo = true;
//				sc.close();
				
			} catch (Exception e) {
				System.out.print("ERRO\n" + "Número decimal solicitado! \n" + "Tente outra vez: ");
			}
		}

		return valor;
	}
}
