package VariablesCondiciones;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame un numero");
		double n1=sc.nextDouble();
		if (n1==0) {
			System.out.println("El numero es igual que 0");
		}
		else {
			if(n1>0){
				System.out.println("El numero es positivo");
			}
			else {
				System.out.println("El numero es negativo");
			}
		}
		sc.close();
	}

}
