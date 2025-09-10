package bucles;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=0;
		System.out.println("Dame un numero");
		n1=sc.nextInt();
		int c=1;
		while (n1>0) {
			c++;
			System.out.println("Dame un numero");
			n1=sc.nextInt();
		}
		System.out.println("Numeros introducidos "+c);
		sc.close();
	}

}
