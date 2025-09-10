package CondicionalesBucles;

import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1=0;
		int i=0;
		int c=0;
		do {
			System.out.println("Dame un número");
			n1 = sc.nextInt();
			if(n1>=0) {
				c+=n1;
				i++;
			}
		}while (n1>=0);
		float m=c/i;
		System.out.println("La media es "+m);
		sc.close();
	}
}
