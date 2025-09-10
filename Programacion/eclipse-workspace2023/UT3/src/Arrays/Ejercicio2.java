package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		int []numeros=new int[20];
		Scanner sc=new Scanner(System.in);
		int n=0,contador=0;
		for (int i=0; i<numeros.length; i++) {
			numeros[i]=(int)(1+Math.random()*25);
		}
		System.out.println("Array");
		System.out.println(Arrays.toString(numeros));
		System.out.println("Dame un número");
		n=sc.nextInt();
		for(int i=0; i<numeros.length; i++) {
			if(numeros[i]==n)
				System.out.println("Encontrado "+n+" en la posicion "+i);
				contador++;
		}
		System.out.println("El numero "+n+" se ha encontrado "+contador+" veces");
		sc.close();
	}
}
