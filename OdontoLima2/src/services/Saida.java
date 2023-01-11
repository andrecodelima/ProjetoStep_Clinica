package services;
import models.Dentista;

public class Saida {
	
	public static void exibirDentista() {
		Dentista d = new Dentista();
		
		System.out.println("ID: " + d.getId());
	}
}
