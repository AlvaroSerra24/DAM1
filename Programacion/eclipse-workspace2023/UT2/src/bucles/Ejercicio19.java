package bucles;

import java.util.Scanner;

public class Ejercicio19 {
	public static void main(String[] args) {
		
		
		// Dado un número comprobar si es o no primo
		// Declaracion de variables/objetos
		int i = 1, contador = 0;
		Scanner sc = new Scanner(System.in);
		int n=0;
		int j=2;
		int contadorPrimos=0;

		System.out.println("Dame un número");
		n = sc.nextInt();//Primos hasta n
		while(j<=n) {// desde 2 hasta n
			i=1;
			// Procesamiento
			//Comprueba si un numero concreto es primo
			while (i <= j) {
				if (j % i == 0) {
					// System.out.println("\t"+i+" es divisor de "+j);
					contador++;
				}
				i++;
			} // while
			//System.out.println("\t"+j+" tiene "+contador+" divisores");
			// Imprimir los resultados
			if (contador == 2) {
				//System.out.println(j+"El número es primo");
				contadorPrimos++;
			} 
			contador=0;
			j++;
		}//while j
		System.out.println("Existen "+contadorPrimos+" números primos entre 1 y "+n);
		sc.close();
	}

}
