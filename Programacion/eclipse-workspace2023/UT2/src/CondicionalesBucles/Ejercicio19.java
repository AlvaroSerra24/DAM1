package CondicionalesBucles;

import java.util.Scanner;

public class Ejercicio19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float n1=0;
		int i=0;
		int cont=0;
		float csuma=0;
		do {
			System.out.println("Dame un sueldo");
			n1 = sc.nextFloat();
			i++;
			csuma+=n1;
			if(n1<1000) {
				cont++;
			}
		}while(i<10);
		System.out.println("La suma de los 10 sueldos es "+csuma);
		System.out.println("Este es el numero de sueldos mayor a 1000€:"+cont);
		sc.close();
	}
}
