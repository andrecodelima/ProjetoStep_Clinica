package services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {
	public static Connection Connect() {
		
		Connection conn = null;
		
		try {
//			String host = "jdbc:mysql://127.0.0.1:3306/sys";
//			String user = "root";
//			String pass = "12345678";
			
			String host = "jdbc:mysql://db-step-ortolima-do-user-13131599-0.b.db.ondigitalocean.com:25060/dbClinica";
			String user = "doadmin";
			String pass = "AVNS_ojeKFczds4KsFKuPahQ";
			
			conn = DriverManager.getConnection(host,user,pass);
			System.out.println("Conected!");
			
		}catch(SQLException e){
			System.out.println(e);
		}
		
		return conn;
	}
}


