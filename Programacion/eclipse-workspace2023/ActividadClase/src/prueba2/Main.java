package prueba2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int numA=0,numB=0;

		do {
			System.out.println("Dame dos números positivos diferentes: ");
			numA=sc.nextInt();
			numB=sc.nextInt();
		}while(correctos(numA, numB));

		doMenuSwitch(sc, numA, numB);
		
		sc.close();
	}

	private static void doMenuSwitch(Scanner sc, int numA, int numB) {
		String opcion;
		do {
		menu(numA, numB);
		opcion=sc.next();
		
		switch(opcion) {
		case "a":
			System.out.print("Los primeros " + numB + "números de la sucesión de Fibonacci son: ");
			imprimirFibonacci(numB);
			break;
		case "b":
			System.out.print("El mayor primo entre " + numA + " y " + numB + " es: ");
	        System.out.println(mayorPrimo(numA, numB));
			break;
		case "c":
			System.out.print("Los palíndromos pares entre " + numA + " y " + numB + " son: ");
			imprimirPalindromosPares(numA, numB);
			break;
		case "d":
			System.out.print("El factorial de "+numA+" es: "+factorial(numA));
			break;
		case "e":
			System.out.println("Fin del programa");
			break;
        default:
            System.out.println("Opción no válida. Por favor, elige una opción válida.");
			}
		}while(!opcion.equals("e"));
	}

	static void imprimirFibonacci(int n) {
		int a = 0, b = 1, c;
		for (int i = 1; i <= n; i++) {
			System.out.print(a + " ");
			c = a + b;
			a = b;
			b = c;
		}
		System.out.println();
	}

	private static void imprimirPalindromosPares(int numA, int numB) {
		for (int i = numA; i <= numB; i++) {
			if (esPalindromo(i) && i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	public static int factorial(int numA){
        if(numA==0){
            return 1;
        }
        else
            return numA * factorial(numA-1);
	}

	private static void menu(int numA, int numB) {
		System.out.println("\na) Imprimir los primeros "+numB+" términos de la sucesión de Fibonacci");
		System.out.println("b) El mayor primo entre "+numA+" y "+numB);
		System.out.println("c) Imprimir los palíndromos pares entre "+numA+" y "+numB);
		System.out.println("d) Imprimir el factorial de "+numA);
		System.out.println("e) Salir");
		System.out.println("Elija una opción: ");
	}

	private static boolean correctos(int numA, int numB) {
		return numA>=10 || numA<=0 || numB>=10 || numB<=0 || numB==numA;
	}

	public static int mayorPrimo(int numA, int numB) {
	    int mayorPrimo = -1;
	    for (int i = numB; i >= numA; i--) {
	        if (esPrimo(i)) {
	            mayorPrimo = i;
	            break;
	        }
	    }
	    return mayorPrimo;
	}

	private static boolean esPrimo(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	private static boolean esPalindromo(int num) {
		int revertido = 0, resto, original = num;
		while (num != 0) {
			resto = num % 10;
			revertido = revertido * 10 + resto;
			num /= 10;
		}
		return original == revertido;
	}
}

