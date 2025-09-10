package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio4Cifra {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame un numero de mas de dos cifras");
		int n=sc.nextInt();

		int ult=n%10;
		int rest=n/10;
		
		int c=0;
		double nuevo=0;
		while (n>=10) {
			n=n/10;
			c++;
		}
		
		nuevo=ult*Math.pow(10,c)+rest;
		System.out.println((int)nuevo);
		sc.close();
	}
}
