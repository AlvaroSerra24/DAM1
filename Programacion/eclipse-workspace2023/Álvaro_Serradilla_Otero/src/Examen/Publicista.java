package Examen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Publicista extends Persona{
	private int antiguedad;
	private ArrayList<Cliente> LClientes;
	
	public Publicista(String codigo, String nombre, String apellidos, String correo, int antiguedad,
			ArrayList<Cliente> lClientes) {
		super(codigo, nombre, apellidos, correo);
		this.antiguedad = antiguedad;
		this.LClientes = lClientes;
	}

	public Publicista(String codigo, String nombre, String apellidos, String correo, int antiguedad) {
		super(codigo, nombre, apellidos, correo);
		this.antiguedad = antiguedad;
		LClientes = new ArrayList<Cliente>();
	}

	public Publicista() {
		super();
		this.antiguedad = 0;
		LClientes = new ArrayList<Cliente>();
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public ArrayList<Cliente> getLClientes() {
		return LClientes;
	}

	public void setLClientes(ArrayList<Cliente> lClientes) {
		LClientes = lClientes;
	}

	@Override
	public String toString() {
		return "Publicista [antiguedad=" + antiguedad + ", LClientes=" + LClientes + ", codigo=" + codigo + ", nombre="
				+ nombre + ", apellidos=" + apellidos + ", correo=" + correo + "]";
	}
	
	public void cargarListaClientes(String filename) {
		try {
			Scanner entrada = new Scanner(new File(filename));
			String cadena = "";
			String[] linea;
			while(entrada.hasNext()) {
				cadena = entrada.nextLine();
				linea = cadena.split(";");
				if(linea[1].equalsIgnoreCase(this.getCodigo()) && linea[0].equals("cliente")) {
					this.getLClientes().add(new  Cliente(linea[1],linea[3],linea[4],linea[5],Integer.parseInt(linea[6]),Integer.parseInt(linea[9])));
				}
			}
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Publicista p=new Publicista("101","Mario","Garcia Benito","mario@gmail.com",32);
		p.cargarListaClientes("Personas.csv");
		System.out.println(p.getLClientes());
	}
}
