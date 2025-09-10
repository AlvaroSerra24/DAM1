package RepasoUT3;

import java.util.Scanner;

public class Palindromos_String {
	public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
         
        // Pedimos una cadena
        System.out.println("Escribe una cadena");
        String cadena = sn.next();
         
        if(esPalindromo(cadena)){
            System.out.println("Es palindromo");
        }else{
            System.out.println("No es palindromo");
        }
         
    }
     
    public static String invertirCadena(String cadena){
         
        cadena = cadena.toLowerCase();
        String cadenaInvertida = "";
         
        // Invertimos la cadena
        char caracter;
        for (int i = cadena.length() - 1; i >= 0; i--) {
            caracter = cadena.charAt(i);
            cadenaInvertida += caracter;
        }
         
        return cadenaInvertida;
    }
     
    public static boolean esPalindromo(String cadena){
         
        String cadenaInvertida = invertirCadena(cadena);
         
        // Comprobamos si es palindromo o no
        return cadena.equalsIgnoreCase(cadenaInvertida);
    }
}
