package Cadenas;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		System.out.println("Dame una palabra: ");
		String palabra=sc.next();
		int contA=0,contE=0;
		for(int i=0; i<palabra.length()-1;i++) {
			if((palabra.charAt(i)=='a') || (palabra.charAt(i)=='A')) {
				contA++;
			}
			if((palabra.charAt(i)=='e') || (palabra.charAt(i)=='E')) {
				contE++;
			}
			System.out.println("La letra a aparece: "+contA+" veces");
			System.out.println("La letra e aparece: "+contE+" veces");
			sc.close();
		}
	}
}
