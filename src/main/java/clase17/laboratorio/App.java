package clase17.laboratorio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<String> texto = new ArrayList<String>();
		String msg;

		File outputFile = new File("output.txt");

		System.out.println("Escriba el texto a guardar. \nEscriba 'fin' para finalizar...");

		do {

			msg = sc.nextLine();

			if (msg.equalsIgnoreCase("fin")) {
				break;
			}

			texto.add(msg);

		} while (true);

		sc.close();

		escribir(texto, outputFile);

		leer(outputFile);

	}

	
	private static void escribir(List<String> texto, File fileName) {

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {

			for (String s : texto) {
				bw.write(s);
				bw.newLine();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void leer(File fileName) {

		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			
			String msg;
			
			if(br.ready()) {
				
				while((msg = br.readLine()) != null) {
					System.out.println(msg);
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
