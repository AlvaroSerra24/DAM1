package VariablesCondiciones;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame el primer numero");
		double n1=sc.nextDouble();
		System.out.println("Dame el segundo numero");
		double n2=sc.nextDouble();
		if (n1==n2) {
			System.out.println("Los dos numeros son iguales");
		}
		else {
			System.out.println("Los dos numeros son distintos");
		}
		sc.close();
	}

}
