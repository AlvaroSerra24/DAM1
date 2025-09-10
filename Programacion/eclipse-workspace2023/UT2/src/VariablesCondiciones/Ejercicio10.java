package VariablesCondiciones;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame un numero");
		int n1=sc.nextInt();
		System.out.println("Dame un numero");
		int n2=sc.nextInt();
		System.out.println("Dame un numero");
		int n3=sc.nextInt();
		sc.close();
		System.out.println(n1+""+n2+""+n3);
	}
}