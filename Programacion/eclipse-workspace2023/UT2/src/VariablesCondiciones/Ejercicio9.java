package VariablesCondiciones;

import java.util.Scanner;

public class Ejercicio9 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Dame un numero");
			double n1=sc.nextDouble();
			System.out.println("Dame un numero");
			double n2=sc.nextDouble();
			if (n1>n2) {
				System.out.println(n2+","+n1);
			}
			else {
				System.out.println(n1+","+n2);
			}
			sc.close();
		}
}
