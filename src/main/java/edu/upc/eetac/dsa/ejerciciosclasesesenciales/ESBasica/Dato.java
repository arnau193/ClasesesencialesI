package edu.upc.eetac.dsa.ejerciciosclasesesenciales.ESBasica;

import java.io.Serializable;

public class Dato implements Serializable {

	public int a;
	public String b;
	public char c;

	public int getInt() {
		return a;
	}

	public void setInt(int a) {
		this.a = a;
	}

	public String getString() {
		return b;
	}

	public void setString(String b) {
		this.b = b;
	}

	public char getChar() {
		return c;
	}

	public void setChar(char c) {
		this.c = c;
	}

	public Dato(int a, String b, char c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public String toString() {
		return (getInt() + " " + getString() + " " + getChar());
	}
}
