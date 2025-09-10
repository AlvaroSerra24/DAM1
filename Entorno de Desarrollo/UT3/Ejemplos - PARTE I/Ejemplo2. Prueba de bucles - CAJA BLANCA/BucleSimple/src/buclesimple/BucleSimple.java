package buclesimple;

/**
 * Ejemplo de bucle simple en Java.
 *
 * @author Luis Miguel Morales Sánchez
 */
public class BucleSimple {

    /**
     * Método principal que demuestra el uso de un bucle simple.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en
     * este ejemplo).
     */
    public static void main(String[] args) {
        // a) Repetir el máximo, máximo-1 y máximo +1 veces el bucle:
        int max = 5;

        // Repetir el máximo veces el bucle:
        System.out.println("PRUEBA - REPETIR ITERACIÓN MAX:");
        for (int i = 0; i < max; i++) {
            System.out.println("Iteracion con max: " + (i + 1));
        }

        System.out.println("PRUEBA - REPETIR ITERACIÓN MAX-1:");
        // Repetir el máximo-1 veces el bucle:
        for (int i = 0; i < max - 1; i++) {
            System.out.println("Iteracion con max-1: " + (i + 1));
        }

         System.out.println("PRUEBA - REPETIR ITERACIÓN MAX+1:");
        // Repetir el máximo +1 veces el bucle:
        for (int i = 0; i < max + 1; i++) {
            System.out.println("Iteracion con max+1: " + (i + 1));
        }

        // b) Repetir el bucle cero y una vez:
        // Bucle cero veces
        System.out.println("PRUEBA - BUCLE CERO VECES:");
        for (int i = 0; i < 0; i++) {
            System.out.println("No deberia imprimirse");
        }

        // Bucle una vez
        System.out.println("PRUEBA - BUCLE UNA VEZ:");
        for (int i = 0; i < 1; i++) {
            System.out.println("Iteracion " + (i + 1));
        }

        // c) Repetir el bucle un número determinado de veces:
        System.out.println("PRUEBA - BUCLE NUMERO DETERMINADO DE VECES:");
        int iteraciones = 3;
        for (int i = 0; i < iteraciones; i++) {
            System.out.println("Iteracion " + (i + 1));
        }
    }
}
