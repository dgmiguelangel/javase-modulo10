package clase17.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class App {

	public static void main(String[] args) {
		
		Properties p = new Properties();
		
		try {
			p.load(new FileInputStream("database.properties"));
			
			System.out.println("driver: " + p.getProperty("bd.mysql.driver"));
			System.out.println("url: " + p.getProperty("bd.mysql.url"));
			System.out.println("user: " + p.getProperty("bd.mysql.user"));
			System.out.println("pass: " + p.getProperty("bd.mysql.pass"));
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
