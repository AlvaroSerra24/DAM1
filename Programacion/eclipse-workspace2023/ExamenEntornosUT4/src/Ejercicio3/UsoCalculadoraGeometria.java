package Ejercicio3;

import static Ejercicio3.CalculadoraGeometria.aCirculo;
import static Ejercicio3.CalculadoraGeometria.aCuadrado;
import static Ejercicio3.CalculadoraGeometria.vCirculo;
import static Ejercicio3.CalculadoraGeometria.vCuadrado;
public class UsoCalculadoraGeometria {
	/**
	 * 
	 * @param args
	 */
    public static void main(String[] args) {
    	/**
    	 * @author Alvaro Serradilla Otero
    	 */
        double radio = 5;
        double lados = 10;
        
        imprimirAreaYvolumen(radio,lados);
        
    }
    /**
     * 
     * @param radio
     * @param lados
     * Imprime el area y el volumen de un circulo y de un cuadrado 
     */
	private static void imprimirAreaYvolumen(double radio, double lados) {
		// TODO Auto-generated method stub
		System.out.println("Area del círculo: " + aCirculo(radio));
        System.out.println("Volumen del círculo: " + vCirculo(radio));
        System.out.println("Area del cuadrado: " + aCuadrado(lados));
        System.out.println("Volumen del cuadrado: " + vCuadrado(lados));
	}
    
}
