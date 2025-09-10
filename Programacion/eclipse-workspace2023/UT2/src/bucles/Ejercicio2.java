package bucles;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=0;
		System.out.println("Dame un numero");
		n1=sc.nextInt();
		while (n1!=0) {
			if (n1>0) {
				System.out.println("El numero "+n1+" es positivo");
			}
			else {
				System.out.println("El numero"+n1+" es negativo");
			}
			System.out.println("Dame un numero");
			n1=sc.nextInt();	
		}
		sc.close();
	}

}
