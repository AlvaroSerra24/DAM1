package Ejercicios_Ampliacion_Refuerzo;

import java.util.Scanner;

public class EjercicioA {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=0, primero=0, cont=0, sumaMayor10=0;
		System.out.println("Dame un numero");
		primero=sc.nextInt();
		primero=n;
		do {
			if(n%2!=0) {
				cont++;
			}
			
			if(n%2==0 && n>10) {
				sumaMayor10+=n;
			}
			System.out.println("Dame un numero");
			n=sc.nextInt();
		}while(n!=0);
		
		if(primero%2==0)
			System.out.println("El número de imapres es: "+cont);
		else
			System.out.println("La suma de los pares mayor de 10 es: "+sumaMayor10);
		sc.close();
	}
}
