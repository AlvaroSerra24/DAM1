/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buclesanidados;

/**
 * Ejemplo de bucles anidados en Java.
 * @author Luis Miguel Morales Sánchez
 */
public class BuclesAnidados {

    /**
     * Método principal que demuestra el uso de bucles anidados.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este ejemplo).
     */
    public static void main(String[] args) {
        int externoMax = 3;
        int internoMax = 2;

        // Prueba con bucles externos ejecutando bucles internos un número determinado de veces
        for (int i = 0; i < externoMax; i++) {
            System.out.println("Iteracion Externa " + (i + 1));

            for (int j = 0; j < internoMax; j++) {
                System.out.println("   Iteracion Interna " + (j + 1));
            }
        }

        // Prueba con bucles internos ejecutando bucles externos un número determinado de veces
        for (int j = 0; j < internoMax; j++) {
            System.out.println("Iteracion Interna " + (j + 1));

            for (int i = 0; i < externoMax; i++) {
                System.out.println("   Iteracion Externa " + (i + 1));
            }
        }
    }
}

