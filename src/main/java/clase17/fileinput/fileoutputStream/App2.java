package clase17.fileinput.fileoutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class App2 {

	public static void main(String[] args) {
		
		String path = "D:" + File.separator + "workspace/files/";
		
		File inputFile = new File(path + "input.txt");
		
		try(FileInputStream fis = new FileInputStream(inputFile);){
			
			int c;
			while((c = fis.read()) != -1) {
				System.out.println(c);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
