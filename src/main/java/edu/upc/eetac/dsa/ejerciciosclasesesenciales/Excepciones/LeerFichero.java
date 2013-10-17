package edu.upc.eetac.dsa.ejerciciosclasesesenciales.Excepciones;

import java.io.*;

public class LeerFichero {

	public static void main(String[] arg) throws BigNumberException {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			String path = System.getProperty("user.dir")+ "/Resources/leer_numeros2.txt";			
			archivo = new File(path);
			fr = new FileReader(archivo);
		}
			 catch (FileNotFoundException e) {
					System.out.println("Archivo no encontrado");
				} 
		try{
			br = new BufferedReader(fr);
		
		
		

			// Lectura del fichero
			String linea;
			int numero;
			linea = br.readLine();
			while (linea != null){
				System.out.println(linea);
				linea = br.readLine();
				try{
				numero=Integer.parseInt(linea);
				control(numero);
				}
				catch(NumberFormatException e)
				{
					throw new RuntimeException(e);
				}
			}
		}
		
		catch (IOException e)
		{
			throw new RuntimeException(e);
		}
	
		
			
		finally {
			// En el finally cerramos el fichero, para asegurarnos
			// que se cierra tanto si todo va bien como si salta
			// una excepcion.
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	private static void control(int numero) throws BigNumberException {
		if (numero>1000){
		 throw new BigNumberException();
	}
	}
}