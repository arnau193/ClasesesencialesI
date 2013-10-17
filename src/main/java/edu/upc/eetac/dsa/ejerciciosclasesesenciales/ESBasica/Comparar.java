package edu.upc.eetac.dsa.ejerciciosclasesesenciales.ESBasica;

import java.io.*;

public class Comparar {
	public static void main(String[] arg) {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		double cont1 = 0;
		double cont2 = 0;
		String linea;
		String nombre_bytes = null;
		
		try {
			String path = System.getProperty("user.dir")+ "/Resources/registro.txt";
			archivo = new File(path);
			fr = new FileReader(archivo);
			br=new BufferedReader(fr);
		

		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado");
		}
		try {
			while ((linea = br.readLine()) != null) {
				String[] result = linea.split(" ");
				cont1 = Double.parseDouble(result[0]);
				if (cont1>cont2){
				cont2=cont1;
				nombre_bytes = result[3];
				}

			}

			System.out.println(nombre_bytes);
			
		}

		catch (Exception e) {
			System.out.println("Error ");
		}
		

		try {

			if (null != fr)
				fr.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
}
