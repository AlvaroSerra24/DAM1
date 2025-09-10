package Ejemplos;

import java.util.Scanner;

public class Ejemplo1 {
	
	private static int suma(int n1, int n2) {
		// TODO Auto-generated method stub
		return (n1+n2);
	}
	private static int resta(int n1, int n2) {
		// TODO Auto-generated method stub
		return (n1-n2);
	}
	private static int producto(int n1, int n2) {
		// TODO Auto-generated method stub
		return (n1*n2);
	}
	private static int division(int n1, int n2) {
		// TODO Auto-generated method stub
		return (n1/n2);
	}
	
	public static void menu() {
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Producto");
		System.out.println("4. Division");
		System.out.println("5. Salir");
		System.out.println("Elija una opcion: ");
	}
	
	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		int opcion=0;
		
		System.out.println("Dame el valor de a");
		a=sc.nextInt();
		System.out.println("Dame el valor de b");
		b=sc.nextInt();
		
		do {
			menu();
			opcion=sc.nextInt();
			switch(opcion) {
			case 1:
				System.out.println(suma(a,b));
			break;
			case 2:
				System.out.println(resta(a,b));
				break;
			case 3:
				System.out.println(producto(a,b));
				break;
			case 4:
				System.out.println(division(a,b));
				break;
			case 5:
				System.out.println("Adios!!");
			}
		}while(opcion!=5);		
		sc.close();
	}
	
}
