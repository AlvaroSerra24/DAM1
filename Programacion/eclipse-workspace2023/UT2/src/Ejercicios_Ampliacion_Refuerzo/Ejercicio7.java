package Ejercicios_Ampliacion_Refuerzo;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		
		Scanner sc=new	Scanner(System.in);
		String nom1="root";
		String nom="";
		int comp=3;
		String cont1="1234";
		String cont="";
		do {
			System.out.println("Dime tu nombre");
			nom=sc.next();
			System.out.println("Dime tu contraseña");
			cont=sc.next();
			comp--;
		}while (comp>0 && (!nom.equals(nom1)) || (!cont.equals(cont1)));
		if (nom.equals(nom1) && cont.equals(cont1)) {
			System.out.println("Bienvenido al sistema");
		}
		else {
			System.out.println("Cuenta bloqueada");
		}
		sc.close();
	}
}
