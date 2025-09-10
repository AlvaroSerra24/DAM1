package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio4Div {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int sumaA=0,sumaB=0;
	System.out.println("Dame un numero");
	int A=sc.nextInt();
	System.out.println("Dame un numero");
	int B=sc.nextInt();
	for(int i=1;i<A;i++) {
		if(A%i==0) {
			sumaA=sumaA+i;
		}
	}
	for(int i=1;i<B;i++) {
		if(B%i==0) {
			sumaB=sumaB+i;
		}
	}
	
	if(A==sumaB && B==sumaA) {
		System.out.println("Son amigos");
	}else {
		System.out.println("No son amigos");
	}
	sc.close();
	}
}
