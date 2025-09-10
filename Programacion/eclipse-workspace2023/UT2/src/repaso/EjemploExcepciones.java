package repaso;

import java.util.Scanner;

public class EjemploExcepciones {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame un número");
		int a=sc.nextInt();
		
		System.out.println("Dame un número");
		int b=sc.nextInt();
		try {
			System.out.println("a/b="+(a/b));
		}catch(Exception e) {
			System.out.println("Error,has dividido entre 0");
		}
		System.out.println("FIN");
		sc.close();
	}

}
