package VariablesCondiciones;

import java.util.Scanner;

public class Ejercicio_ecuacion {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame el primer numero de la ecuacion");
		double a=sc.nextDouble();
		System.out.println("Dame el segundo numero de la ecuacion");
		double b=sc.nextDouble();
		System.out.println("Dame el tercer numero de la ecuacion");
		double c=sc.nextDouble();
		double x1;
		double x2;
		x1=((-b+Math.sqrt(Math.pow(b,b)-4*a*c))/2*a);
		x2=((-b-Math.sqrt(Math.pow(b,b)-4*a*c))/2*a);
		
		System.out.println(x1);
		System.out.println(x2);
		sc.close();
	}

}
