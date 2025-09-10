package CondicionalesBucles;

import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1=0;
		int cont=0;
		do {
			System.out.println("Dame un número");
			n1 = sc.nextInt();
			cont=n1+cont;
		}while (n1!=0);
		System.out.println(cont+" es la suma de todos los numeros introducidos");
		sc.close();
	}
}
