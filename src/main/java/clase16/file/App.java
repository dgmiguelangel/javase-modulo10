package clase16.file;

import java.io.File;

public class App {

	public static void main(String[] args) {

		String path = "D:" + File.separator + "workspace/files/";
		
		File file = new File(path);
		
		System.out.println("existe: " + file.exists());
		System.out.println("nombre: " + file.getName());
		System.out.println("directorio: " + file.isDirectory());
		System.out.println("leer: " + file.canRead());
		System.out.println("escribir: " + file.canWrite());
		
		leerContenido(file);
		
	}
	
	
	private static void leerContenido(File file) {
		
		File[] files = file.listFiles();
		
		for (File f : files) {
			System.out.println("Nombre del archivo: " + f.getName());
			
			if(f.isDirectory()) {
				leerContenido(f);
			}
		}
		
	}
	

}
