package clase17.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class App2 {

	public static void main(String[] args) {
		
		if (conectar() != null) {
			System.out.println("Me conecte!");
		}

	}
	
	private static Connection conectar() {
		
		Connection con = null;

		Properties p = new Properties();		

		try {
			p.load(new FileInputStream("database.properties"));
			
			String driver = p.getProperty("bd.mysql.driver");
			String url = p.getProperty("bd.mysql.url");
			String usuario = p.getProperty("bd.mysql.user");
			String clave = p.getProperty("bd.mysql.pass");
			
			Class.forName(driver);
			
			con = DriverManager.getConnection(url, usuario, clave);			
			
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Hubo un error en la conexion...");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return con;
		
	}

}
