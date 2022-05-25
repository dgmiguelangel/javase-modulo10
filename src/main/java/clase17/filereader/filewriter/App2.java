package clase17.filereader.filewriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class App2 {

	public static void main(String[] args) {
		
		String parrafo = "Curso de java starndard web programming";
		
		String path = "D:" + File.separator + "workspace/files/";
		
		File outputFile = new File(path + "output.txt");
		
		try(FileWriter fw = new FileWriter(outputFile, false)){
			
			for (int i = 0; i < parrafo.length(); i++) {
				fw.write(parrafo.charAt(i));			
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
