package RepasoUT4;
import java.util.Arrays;
import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String j1 = solicitarNick(sc, "Jugador 1");
        String j2 = solicitarNick(sc, "Jugador 2");

        int[] resultado1 = lanzarDados();
        int[] resultado2 = lanzarDados();

        mostrarResultados(j1, resultado1);
        mostrarResultados(j2, resultado2);

        jugar(j1, resultado1, j2, resultado2);
    }

    private static String solicitarNick(Scanner sc, String jugador) {
        String nick;
        do {
            System.out.println(jugador + ": introduce el nick");
            nick = sc.nextLine();
        } while (!nick.matches("J[A-Z]{3}[0-9]"));
        return nick;
    }

    private static int[] lanzarDados() {
        int[] resultado = new int[5];
        for (int i = 0; i < resultado.length; i++) {
            resultado[i] = (int)(Math.random() * 6) + 1;
        }
        return resultado;
    }

    private static void mostrarResultados(String jugador, int[] resultado) {
        System.out.println(jugador + " tiene " + Arrays.toString(resultado));
    }

    private static void jugar(String j1, int[] resultado1, String j2, int[] resultado2) {
        System.out.println("************Comienza el juego************");
        int aciertosJ1 = 0, aciertosJ2 = 0;
        for (int i = 0; i < 5; i++) {
            int dado = (int)(Math.random() * 6) + 1;
            System.out.println("Dado: " + dado);
            if (resultado1[i] == dado) {
                aciertosJ1++;
                System.out.println("         " + j1 + " coincide con el lanzamiento del dado " + (i+1));
            }
            if (resultado2[i] == dado) {
                aciertosJ2++;
                System.out.println("         " + j2 + " coincide con el lanzamiento del dado " + (i+1));
            }
        }

        // Determinar el ganador
        if (aciertosJ1 > aciertosJ2) {
            System.out.println("Gana " + j1 + " con aciertos=" + aciertosJ1);
        } else if (aciertosJ2 > aciertosJ1) {
            System.out.println("Gana " + j2 + " con aciertos=" + aciertosJ2);
        } else {
            System.out.println("Empate con aciertos=" + aciertosJ1);
        }
    }
}