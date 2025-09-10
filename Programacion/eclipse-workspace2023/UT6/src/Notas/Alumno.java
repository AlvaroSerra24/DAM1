package Notas;

import java.util.Arrays;
import java.util.Scanner;

public class Alumno {
	private String Nombre;
	private String Apellidos;
	private int edad;
	private Nota[] notas;
	
	//Constructor por defecto
	//Inicializa variables y reserva memoria
	public Alumno() {
		this.Nombre="";
		this.Apellidos="";
		this.edad=0;
		this.notas=new Nota[7];
		for (int i = 0; i < notas.length; i++) {
			notas[i]=new Nota();
		}
	}

	public Alumno(String nombre, String apellidos, int edad) {

		this.Nombre = nombre;
		this.Apellidos = apellidos;
		this.edad = edad;
		this.notas=new Nota[7];
		for (int i = 0; i < notas.length; i++) {
			notas[i]=new Nota();
		}
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Nota[] getNotas() {
		return notas;
	}

	public void setNotas(Nota[] notas) {
		this.notas = notas;
	}
	
	@Override
	public String toString() {
		return "Alumno [nombre=" + Nombre + ", apellidos=" + Apellidos + ", edad=" + edad + ", notas="
				+ Arrays.toString(notas) + "]";
	}

	public void imprimirNotas() {
		System.out.println("El alumno/a "+this.getNombre()+" "+this.getApellidos()+" tiene las siguientes notas");
		for (int i = 0; i < this.notas.length; i++) {
			System.out.println(this.notas[i]);
		}
	}
	
	public static void main(String[] args) {
		Alumno a=new Alumno("Marta","Peña",18);
		Scanner sc=new Scanner(System.in);
		String m="";
		double c=0;
		
		for(int i=0; i<a.getNotas().length;i++) {
			System.out.println("Modulo");
			m=sc.next();
			System.out.println("Nota");
			c=sc.nextDouble();
			a.getNotas()[i].setModulo(m);
			a.getNotas()[i].setCalificacion(c);
		}
		a.imprimirNotas();
	}
	
}
