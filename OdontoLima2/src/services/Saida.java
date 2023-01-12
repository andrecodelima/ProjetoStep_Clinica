package services;
import java.util.ArrayList;

import controllers.DentistaController;
import models.Dentista;

public class Saida {
	
	public static void exibirDentista(Dentista d) {
		
		System.out.println("___________________________________________________________________");
		System.out.println(" ");
		
		System.out.println("ID: " 				+ d.getId());
		System.out.println("Nome: "  			+ d.getNome());
		System.out.println("CPF: "  			+ d.getCpf());
		System.out.println("RG: "  				+ d.getRg());
		System.out.println("CRO: "  			+ d.getCro());
		System.out.println("Telefone: "  		+ d.getTelefone());
		System.out.println("Endereço: "  		+ d.getEndereco());
		System.out.println("E-mail: "  			+ d.getEmail());
		System.out.println("Gênero: "  			+ d.getSexo());
		System.out.println("Especialidade: "  	+ d.getEspecialidade());
		
		System.out.println("___________________________________________________________________");
		System.out.println(" ");
		
	}

	 
	
//	public static void consultar() {
//		System.out.println("----------------------------- Consulta -----------------------------");
//		ArrayList<Dentista> list = DentistaController.findAll();
//		for(Dentista d : list) {
//			
//			Saida.exibirDentista(d);
//	}

}
