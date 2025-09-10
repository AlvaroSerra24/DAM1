package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercico1Cifras {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Dame un numero de mas de una cifra");
	int num=sc.nextInt();
	int r=0,n=0;
	int inicial=num;
	while (num>=10) {
		r=num%10;
		num=num/10;
		n=n*10+r;
		//System.out.print(n);
	}
	n=n*10+num;
	System.out.println(n);
	if(n==inicial) {
		System.out.println("El numero es capicúa");
	}
	else {
		System.out.println("El numero no es capicúa");
	}
	sc.close();
}
}
