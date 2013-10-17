package edu.upc.eetac.dsa.ejerciciosclasesesenciales.ESBasica;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class InstanciarObjeto {
	public static void main(String[] arg) {

		Dato dato1 = new Dato(1, "dato1", 'c');
		Dato dato2 = new Dato(2, "dato2", 'c');
		Dato dato3 = new Dato(3, "dato3", 'c');

		try {
			String path = System.getProperty("user.dir")+ "/Resources/dato.txt";
			FileOutputStream ficheroSalida = new FileOutputStream(path);
			ObjectOutputStream objetoSalida = new ObjectOutputStream(
					ficheroSalida);

			objetoSalida.writeObject(dato1);
			objetoSalida.writeObject(dato2);
			objetoSalida.writeObject(dato3);

			objetoSalida.close();
		}

		catch (FileNotFoundException e) {
			System.out.println("El fichero no existe");

		}

		catch (IOException e) {
			System.out.println(e.getMessage());
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			String path = System.getProperty("user.dir")+ "/Resources/dato.txt";
			FileInputStream ficheroEntrada = new FileInputStream(path);
			ObjectInputStream objetoEntrada = new ObjectInputStream(
					ficheroEntrada);

			dato1 = (Dato) objetoEntrada.readObject();
			dato2 = (Dato) objetoEntrada.readObject();
			dato3 = (Dato) objetoEntrada.readObject();

			objetoEntrada.close();

		}

		catch (FileNotFoundException e) {
			System.out.println("El fichero no existe");

		}

		catch (IOException e) {
			System.out.println(e.getMessage());
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println(dato1);
		System.out.println(dato2);
		System.out.println(dato3);

	}
}
