package Ejercicio1;
import java.util.Scanner;

/**
 * @author Alvaro Serradilla Otero
 */

public class Factorial {
 
	public static void main ( String [ ] args ) {
		/**
		 * En esta parte se puede ver como cambiamos los nombres de las variables
		 */
		
		double numero;
		Scanner sc = new Scanner(System.in);
		double factorial = 1;
		
		
		System.out.println("Introduzca un numero mayor o igual a cero: ");
		numero = sc.nextDouble();

		/**
		 * Aquí podemos ver como cambiamos las lineas de codigo para meterlas dentro de metodos
		 */
		
		//Calcula el factorial de un número
		calcularYimprimirFactorial(numero, factorial);
 
	}
	/**
	 * 
	 * @param numero
	 * @param factorial
	 */
	private static void calcularYimprimirFactorial(double numero, double factorial) {
		// TODO Auto-generated method stub
		while ((numero!= 0) && (numero!= 1)) {
			factorial *= numero;
			numero--;
		}
		imprimirfactorial(factorial);
	}
	/**
	 * 
	 * @param factorial
	 */
	private static void imprimirfactorial(double factorial) {
		System.out.println ( factorial ) ;
	}

 
}