package clase17.filereader.filewriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		
		String path = "D:" + File.separator + "workspace/files/";
		
		File inputFile = new File(path + "input.txt");
		
		try(FileReader fr = new FileReader(inputFile)){
			
			int c;
			while((c = fr.read()) != -1) {
				char caracter = (char) c;
				System.out.println(c + " -> " + caracter);
			}			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
