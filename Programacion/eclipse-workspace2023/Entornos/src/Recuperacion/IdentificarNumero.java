package Recuperacion;

import java.util.Scanner;

public class IdentificarNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Por favor, introduce un número entre -1000 y 1000:");
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.printf("\"%s\" no es un número válido.\n", input);
                System.out.println("Por favor, introduce un número entre -1000 y 1000:");
            }
            numero = scanner.nextInt();
        } while (numero < -1000 || numero > 1000);

        String resultado = identificarNumero(numero);
        System.out.println("El número " + numero + " es: " + resultado);

        scanner.close();
    }

    public static String identificarNumero(int numero) {
        if (numero > 0) {
            return "positivo";
        } else if (numero < 0) {
            return "negativo";
        } else {
            return "cero";
        }
        }
    }