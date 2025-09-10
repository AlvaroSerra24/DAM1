package CondicionalesBucles;

import java.util.Scanner;

public class Ejercicio23 {
	public static void main(String[] args) {
		Scanner sc=new	Scanner(System.in);
		int n=0;
		System.out.println("Dame un numnero para ver su tabla hasta el 10");
		n=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(n+" x "+i+"= "+(n*i));
		}
		sc.close();
	}
}
