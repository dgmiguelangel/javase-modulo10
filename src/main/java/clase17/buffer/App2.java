package clase17.buffer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App2 {

	public static void main(String[] args) {

		String path = "D:" + File.separator + "workspace/files/";

		File inputFile = new File(path + "input.txt");

		try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {

			String msg;

			if (br.ready()) {
				while ((msg = br.readLine()) != null) {
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
