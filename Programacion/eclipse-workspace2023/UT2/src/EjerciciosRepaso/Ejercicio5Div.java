package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio5Div {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=0,suma=0;
		System.out.println("Dame un numero");
		num=sc.nextInt();
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				System.out.println(i+" es divisor");
				suma=suma+i;
				if (suma==num) {
					System.out.println("El numero "+num+(" es perfecto"));
				}
			}
		}
		if (suma!=num) {
			System.out.println("El numero "+num+(" no es perfecto"));
		}
		sc.close();
	}
}
