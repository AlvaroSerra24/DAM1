package VariablesCondiciones;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame el radio del círculo");
		double radio=sc.nextDouble();
		if (radio>0) {
			double longitud=2*Math.PI*radio;
			System.out.println("La longitud es:"+longitud);
		}
		else {
			System.out.println("Error! el radio debe de ser mayor que 0");
		}
		System.out.println("FIN");
		sc.close();
	}

}
