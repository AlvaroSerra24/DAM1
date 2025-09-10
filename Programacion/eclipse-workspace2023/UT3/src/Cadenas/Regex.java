package Cadenas;

import java.util.Scanner;

public class Regex {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String palabra=sc.next();
		if(esDNI(palabra))
			System.out.println("Es un dni correcto");
		else
			System.out.println("No es un dni correcto");
		if(esMatricula(palabra))
			System.out.println("Es una matricula correcta");
		else
			System.out.println("No es una matricula correcta");
		if(esBinario(palabra))
			System.out.println("Es Binario");
		else
			System.out.println("No es Binario");
		if(esEntero(palabra))
			System.out.println("Es Entero");
		else
			System.out.println("No es entero");
		sc.close();
	}
	
	public static boolean esDNI(String s) {
		return s.matches("[0-9]{8}[A-Z]");
	}
	public static boolean esMatricula(String s) {
		return s.matches("[0-9]{4}[A-Z]{3}");
	}
	public static boolean esBinario(String s) {
		return s.matches("^[0-1]+$");
	}
	public static boolean esEntero(String s) {
		return s.matches("^[+|-]?[0-9]+$");
	}
	public static boolean esEnteroPositivo(String s) {
		return s.matches("^+?[0-9]+$");
	}
	public static boolean esOctal(String s) {
		return s.matches("^[0-7]+$");
	}
	public static boolean esEmail(String s) {
		return s.matches("^[a-zA-Z0-9\\.]+@[a-zA-Z0-9\\.]+$");
	}
	public static boolean esISBN(String s) {
		return s.matches("^(978|979)[0-9]{10}$");
	}
}
