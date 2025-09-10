package Cadenas;

import java.util.Scanner;

public class examen2021ejercicio1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numero=0,contp=0,mayor=0;
		
		do {
			System.out.println("Dame un numero: ");
			numero=sc.nextInt();
			if(numero%2==0) {
				contp++;
				if(contp>mayor) {
					mayor=contp;
				}
			}else
				contp=0;
		}while(numero!=-1);
		System.out.println("La secuencia mayor es de: "+mayor);
	}
}
