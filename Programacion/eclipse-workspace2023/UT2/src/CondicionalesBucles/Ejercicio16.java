package CondicionalesBucles;

import java.util.Scanner;

public class Ejercicio16 {
	public static void main(String[] args) {
		int n1=0;
		int suma=0;
		Scanner sc=new	Scanner(System.in);
		for(int i=0;i<15;i++) {
			System.out.println("Dame un número");
			n1=sc.nextInt();
			suma+=n1;
		}
		System.out.println("la suma total es "+suma);
		sc.close();
	}
}
