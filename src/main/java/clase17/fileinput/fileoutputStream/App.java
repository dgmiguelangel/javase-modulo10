package clase17.fileinput.fileoutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		
		String path = "D:" + File.separator + "workspace/files/";
		
		File inputFile = new File(path + "input_image.png");
		File outputFile = new File(path + "output_image.png");
		
		try(FileInputStream fis = new FileInputStream(inputFile);
				FileOutputStream fos = new FileOutputStream(outputFile)){
			
//			int c;
//			while((c = fis.read()) != -1) {
//				fos.write(c);
//			}
			
			fos.write(fis.readAllBytes());
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
