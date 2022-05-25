package clase17.buffer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class App3 {

	public static void main(String[] args) {

		String[] parrafo = { "Curso de java standard web programming", "Curso java web api" };

		String path = "D:" + File.separator + "workspace/files/";

		File outputFile = new File(path + "output.txt");

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

			for (String s : parrafo) {
				bw.write(s);
				bw.newLine();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
