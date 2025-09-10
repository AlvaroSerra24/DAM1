/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaztransferenciatester;

/**
 * Ejemplo de prueba de interfaz para transferencias en un banco.
 * @author Luis Miguel Morales Sánchez
 */
public class InterfazTransferenciaTester {

    /**
     * Método principal que realiza pruebas de la interfaz de transferencia.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este ejemplo).
     */
    public static void main(String[] args) {
        probarLimiteTransferencia(0);
        probarLimiteTransferencia(1);
        probarLimiteTransferencia(9999);
        probarLimiteTransferencia(10000);
        probarLimiteTransferencia(10001);
        probarLimiteTransferencia(-100);
        probarLimiteTransferencia(20000);
    }

    /**
     * Prueba el límite de transferencia en la interfaz.
     *
     * @param cantidad La cantidad a transferir.
     */
    private static void probarLimiteTransferencia(int cantidad) {
        System.out.println("Intentando transferir " + cantidad + " euros:");

        if (cantidad >= 0 && cantidad <= 10000) {
            System.out.println("Transferencia exitosa de " + cantidad + " euros.");
        } else {
            System.out.println("Error: La cantidad a transferir debe estar entre 0 y 10,000 euros.");
        }

        System.out.println("--------------------------------------");
    }
}
