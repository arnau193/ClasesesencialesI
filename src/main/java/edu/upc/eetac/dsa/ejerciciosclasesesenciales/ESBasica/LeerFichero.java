package edu.upc.eetac.dsa.ejerciciosclasesesenciales.ESBasica;

import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;

public class LeerFichero {

	public static void main(String[] arg) {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		int cont = 0;
		String nombre_fichero = null;

		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			String path = System.getProperty("user.dir")+ "/Resources/leer.txt";
			archivo = new File(path);
			nombre_fichero=String.valueOf(archivo);
			nombre_fichero = nombre_fichero.substring(23);
			fr = new FileReader(archivo);
			

		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado");
		}
		try {
			int caract = fr.read();

			while (caract != -1) {
				cont++;
				caract = fr.read();
				// Mostrar en pantalla el carácter leído convertido a char

			}
			System.out.print("Hay " + cont + " caracteres");
			
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
				pw.println((cont + " ")+ cal1.get(Calendar.DATE) + "/"
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
