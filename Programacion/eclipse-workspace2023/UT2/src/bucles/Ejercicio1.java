package bucles;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=0;
		//opcion1
//		while (n1>=0) {
//			System.out.println("Dame un número");
//			n1=sc.nextInt();
//			if (n1>=0)
//				System.out.println(Math.pow(n1, 2));
//		}
		
		//opcion 2
		System.out.println("Dame un numero");
		n1=sc.nextInt();
		while (n1>=0) {
			System.out.println(Math.pow(n1, 2));
			System.out.println("Dame un numero");
			n1=sc.nextInt();
		}
		sc.close();
	}
}
