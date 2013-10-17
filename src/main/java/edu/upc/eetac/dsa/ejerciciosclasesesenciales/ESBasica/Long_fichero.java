package edu.upc.eetac.dsa.ejerciciosclasesesenciales.ESBasica;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Calendar;

public class Long_fichero {
	
	public static void main(String[] arg) {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		int cont = 0;
		double bytes = 0;
		String nombre_fichero=null;

		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			String path = System.getProperty("user.dir")+ "/Resources/ejemplo.jpg";
			archivo = new File(path);
			fr = new FileReader(archivo);
			nombre_fichero=String.valueOf(archivo);
			nombre_fichero = nombre_fichero.substring(23);
			

		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado");
		}
		try {
			bytes = archivo.length();
			System.out.println("bytes: " + bytes);

			}

		catch (Exception e) {
			System.out.println("Error ");
		}

		{
			FileWriter fichero = null;
			PrintWriter pw = null;

			try {
				String path = System.getProperty("user.dir")+ "/Resources/registro.txt";
				fichero = new FileWriter(path,true);
				pw = new PrintWriter(fichero);

				Calendar cal1 = Calendar.getInstance();
				pw.println((bytes + " ")+ cal1.get(Calendar.DATE) + "/"
						+ cal1.get(Calendar.MONTH) + "/"
						+ cal1.get(Calendar.YEAR) + " "
						+ cal1.get(Calendar.HOUR) + ":"
						+ cal1.get(Calendar.MINUTE) + ":"
						+ cal1.get(Calendar.SECOND) + (" " + nombre_fichero));
				

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					// Nuevamente aprovechamos el finally para
					// asegurarnos que se cierra el fichero.
					if (null != fichero)
						fichero.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
	
}
}