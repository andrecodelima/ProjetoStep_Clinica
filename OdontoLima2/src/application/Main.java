package application;
import controllers.DentistaController;
import services.Db;

public class Main {

	public static void main(String[] args) {
		Db c = new Db();
		c.Connect();
		
		System.out.println(".................");
		
		DentistaController d = new DentistaController();
		
		d.findAll();
	}

}
