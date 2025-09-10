package Ejercicio;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int opcion=0;
		do {
			System.out.println("1. Área del cuadrado");
			System.out.println("2. Área del círculo");
			System.out.println("3. Área del rectángulo");
			System.out.println("4. Salir");
			System.out.println("Elija una opción: ");
			opcion=sc.nextInt();
			switch (opcion) {
			case 1: //Área del cuadrado
				System.out.println("Dame el lado de un cuadrado: ");
				int lado=sc.nextInt();
				int area=lado*lado;
				System.out.println("El area del cuadrado es: "+area);
				break;
			case 2: //Área del círculo
				System.out.println("Dame el radio del circulo: ");
				int radio=sc.nextInt();
				int areac;
				areac=(int)(Math.PI*Math.abs(radio));
				System.out.println("El area del circulo es: "+areac);
				break;
			case 3: //Área del rectángulo
				System.out.println("Dame el largo del rectangulo: ");
				int largo=sc.nextInt();
				System.out.println("Dame el ancho del rectangulo: ");
				int ancho=sc.nextInt();
				int arear=largo*ancho;
				System.out.println("El area del rectangulo es: "+arear);
				break;
			}	
		}while(opcion!=4);
		sc.close();
	}
}
