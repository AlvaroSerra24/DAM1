package Examen;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Cliente extends Persona{
	private int edad;
	private int nPuntos;
	private ArrayList<String> intereses;
	
	public Cliente(String codigo, String nombre, String apellidos, String correo, int edad, int nPuntos,
			ArrayList<String> intereses) {
		super(codigo, nombre, apellidos, correo);
		this.edad = edad;
		this.nPuntos = nPuntos;
		this.intereses = intereses;
	}

	public Cliente(String codigo, String nombre, String apellidos, String correo, int edad, int nPuntos) {
		super(codigo, nombre, apellidos, correo);
		this.edad = edad;
		this.nPuntos = nPuntos;
		this.intereses = new ArrayList<String>();
	}

	public Cliente() {
		super();
		this.edad = 0;
		this.nPuntos = 0;
		this.intereses = new ArrayList<String>();
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getnPuntos() {
		return nPuntos;
	}

	public void setnPuntos(int nPuntos) {
		this.nPuntos = nPuntos;
	}

	public ArrayList<String> getIntereses() {
		return intereses;
	}

	public void setIntereses(ArrayList<String> intereses) {
		this.intereses = intereses;
	}

	@Override
	public String toString() {
		return "Cliente [edad=" + edad + ", nPuntos=" + nPuntos + ", intereses=" + intereses + ", codigo=" + codigo
				+ ", nombre=" + nombre + ", apellidos=" + apellidos + ", correo=" + correo + "]";
	}
	
	public void interesesCliente(String filename){
		try {
			Scanner entrada=new Scanner(new File(filename));
			String linea[];
			String cadena;
			while(entrada.hasNext()) {
				cadena=entrada.nextLine();
				linea=cadena.split(";");
				if(linea[0].equals(this.codigo)) {
					this.getIntereses().add(new String(cadena));
				}	
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		Cliente c=new Cliente("1","Juan","García Perez","juan@gmail.com",21,50);
		c.interesesCliente("intereses.csv");
		System.out.println(c.getIntereses());
	}
}
