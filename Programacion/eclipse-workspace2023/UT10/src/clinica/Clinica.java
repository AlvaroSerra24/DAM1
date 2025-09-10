package clinica;

import java.util.ArrayList;
import java.util.Scanner;

public class Clinica {
	
	private ArrayList<Profesionales> medicos;
	private ArrayList<Paciente> cola;
	
	
	public static void Menu() {
			System.out.println("1. Listado de pacientes");
			System.out.println("2. Cargar historias clinicas");
			System.out.println("3. Atender paciente");
			System.out.println("4. Salir");
			System.out.println("Elija una opcion: ");
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String opcion="";
		
		opciones(opcion);
		
	}
	
	private static void opciones(String opcion) {
		Scanner sc= new Scanner(System.in);
		do {
			do {
				Menu();
				opcion=sc.next();
			}while(!opcion.matches("[1-4]"));
			switch(opcion) {
			case "1":
				System.out.println("Holi");
				break;
			case "2":
				break;
			case "3":
				break;
			case "4":
				System.out.println("Adios!!");
				break;
			}
		}while (!opcion.equals("4"));
		
		
	}
	public Clinica(ArrayList<Profesionales> medicos, ArrayList<Paciente> cola) {
		super();
		this.medicos = medicos;
		this.cola = cola;
	}
	
	public Clinica() {
		this.medicos = new ArrayList<Profesionales>();
		this.cola = new ArrayList<Paciente>();
	}
	public ArrayList<Profesionales> getMedicos() {
		return medicos;
	}
	public void setMedicos(ArrayList<Profesionales> medicos) {
		this.medicos = medicos;
	}
	public ArrayList<Paciente> getCola() {
		return cola;
	}
	public void setCola(ArrayList<Paciente> cola) {
		this.cola = cola;
	}
	
	
}
