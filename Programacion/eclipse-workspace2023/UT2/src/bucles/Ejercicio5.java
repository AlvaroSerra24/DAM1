package bucles;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		int s=(int)(1+Math.random()*20);
		Scanner sc=new Scanner(System.in);
		int n1=0;
		System.out.println("Dame un numero");
		n1=sc.nextInt();
		while (s!=n1 && n1<=20) {
			if (n1>s) {
				System.out.println("Prueba con un número mas pequeño");
			}
			else {
				System.out.println("Prueba con un número mas grande");
			}
			System.out.println("Dame un numero");
			n1=sc.nextInt();
		}
		if(s==n1) {
			System.out.println("Has acertado el numero");
		}
		else {
			System.out.println("El numero es mas grande que 20");
		}
		sc.close();
	}
}
