package CondicionalesBucles;

import java.util.Scanner;

public class Ejercicio25 {
	public static void main(String[] args) {
		int num=0,cont=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame un numero");
		num=sc.nextInt();
		int contP=0;
		
		for(int n=1;n<=num;n++) {
			
			for(int i=1;i<=n;i++) {
				if(n%i==0)
					cont++;
			}
			if(cont==2) {
				System.out.println(n+" es primo");
				contP++;
			}
			cont=0;
		}
		System.out.println("Entre 1 y "+num+" hay estos primos: "+contP);
		sc.close();
	}
}
