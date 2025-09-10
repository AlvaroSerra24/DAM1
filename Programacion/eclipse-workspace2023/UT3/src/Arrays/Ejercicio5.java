package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		int numeros[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for (int i=0; i<numeros.length; i++) {
			System.out.println("Dame un número");
			numeros[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(numeros));
		Arrays.sort(numeros); //ordenar de menor a mayor un array
		System.out.println(Arrays.toString(numeros));
		sc.close();
	}
}
