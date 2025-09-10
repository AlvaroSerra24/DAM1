package VariablesCondiciones;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame un numero");
		double n1=sc.nextDouble();
		System.out.println("Dame un numero");
		double n2=sc.nextDouble();
		if (n1%n2==0 || n2%n1==0) {
			System.out.println("son multiplos");
		}
		else {
			System.out.println("no son multiplos");
		}
		sc.close();
	}
}
