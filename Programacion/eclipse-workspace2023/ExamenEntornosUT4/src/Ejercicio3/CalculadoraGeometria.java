package Ejercicio3;

public class CalculadoraGeometria {

	   /**
	    * Es un programa para calcular las areas y volumenes
	    * @author Alvaro Serradilla Otero
	    * @param r
	    * @return
	    * Calcula el area de un circulo
	    */
    public static double aCirculo(double r) {
        return Math.PI * r * r;
    }
    	/**
    	 * 
    	 * @param r
    	 * @return
    	 * Calcula el volumen de un circulo
    	 */
    public static double vCirculo(double r) {
        return Math.PI * Math.pow(r, 2) * r;
    }
    	/**
    	 * 
    	 * @param lLado
    	 * @return
    	 * Calcula el area de un cuadrado
    	 */
    public static double aCuadrado(double lLado) {
        return lLado * lLado;
    }
    	/**
    	 * 
    	 * @param lado
    	 * @return
    	 * calcula el volumen de un cuadrado
    	 */
    public static double vCuadrado(double lado) {
        double resultado = lado * lado * lado;
        return resultado;
    }
}

