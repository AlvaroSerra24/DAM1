package bucles;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=0;
		System.out.println("Dame un numero");
		n1=sc.nextInt();
		while (n1!=0) {
			if (n1%2==0) {
				System.out.println("El numero "+n1+" es par");
			}
			else {
				System.out.println("El numero "+n1+" es impar");
			}
			System.out.println("Dame un numero");
			n1=sc.nextInt();	
		}
		sc.close();
	}

}
