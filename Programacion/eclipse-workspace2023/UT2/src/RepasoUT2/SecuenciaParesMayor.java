package RepasoUT2;

import java.util.Scanner;

public class SecuenciaParesMayor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int contadorPares = 0;
        int contadorParesMax = 0;

        do {
        	System.out.println("Dame un numero");
            numero = sc.nextInt();

            if (numero % 2 == 0 && numero != -1) {
                contadorPares++;
                if (contadorPares > contadorParesMax) {
                    contadorParesMax = contadorPares;
                }
            } else {
                contadorPares = 0;
            }
        } while (numero != -1);

        System.out.println("La secuencia mayor de pares consecutivos es: " + contadorParesMax);
        
        sc.close();
    }
}