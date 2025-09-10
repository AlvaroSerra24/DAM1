package Ejercicios_Ampliacion_Refuerzo;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Hasta que numero quieres que se genere la serie:");
		int serie=sc.nextInt();
		int n=0;
		for (int i=1;i<=serie;i++) {
			n=n+5;
			System.out.print(n);
			System.out.print(" ");
		}
		sc.close();
	}
}
