/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfazusuariotester;

/**
 * Ejemplo de prueba de una interfaz de usuario con validaciones de código de usuario y contraseña.
 * 
 * @author Luis Miguel Morales Sánchez
 */
public class InterfazUsuarioTester {

    /**
     * Método principal que realiza pruebas de la interfaz de usuario.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este ejemplo).
     */
    public static void main(String[] args) {
        probarCodigoUsuario();
        probarContraseña();
    }

    /**
     * Prueba la generación de códigos de usuario.
     */
    private static void probarCodigoUsuario() {
        System.out.println("Pruebas de Codigo de Usuario:");

        // Clases válidas para código de usuario
        System.out.println("Clases validas para código de usuario:");
        validarCodigoUsuario("Pelegrino"); // Longitud entre 6 y 12, solo letras
        validarCodigoUsuario("Rocinante");

        // Clases inválidas para código de usuario
        System.out.println("Clases invalidas para código de usuario:");
        validarCodigoUsuario("marrullero44"); // Contiene números
        validarCodigoUsuario("nene"); // Longitud inferior a 6
        validarCodigoUsuario("Portaavionesgigante"); // Longitud superior a 12
        validarCodigoUsuario("Z&aratrusta"); // Contiene caracteres no alfabéticos
        validarCodigoUsuario("Ventajoso12"); // Contiene números
    }

    /**
     * Prueba la generación de contraseñas.
     */
    private static void probarContraseña() {
        System.out.println("\nPruebas de Contrasena:");

        // Clases válidas para contraseña
        System.out.println("Clases validas para contrasena:");
        validarContraseña("5Entrevias"); // Longitud entre 8 y 10, letras y números
        validarContraseña("s8brino");

        // Clases inválidas para contraseña
        System.out.println("Clases invalidas para contrasena:");
        validarContraseña("corta"); // Longitud inferior a 8
        validarContraseña("muyperoquemuylarguisiisisima"); // Longitud superior a 10
        validarContraseña("999999999"); // Solo números
    }

    /**
     * Valida si un código de usuario cumple con las restricciones.
     *
     * @param codigoUsuario El código de usuario a validar.
     */
    private static void validarCodigoUsuario(String codigoUsuario) {
        if (codigoUsuario.matches("^[a-zA-Z]{6,12}$")) {
            System.out.println("Valido: " + codigoUsuario);
        } else {
            System.out.println("Invalido: " + codigoUsuario);
        }
    }

    /**
     * Valida si una contraseña cumple con las restricciones.
     *
     * @param contraseña La contraseña a validar.
     */
    private static void validarContraseña(String contraseña) {
        if (contraseña.matches("^(?=.*[a-zA-Z])(?=.*\\d)[a-zA-Z\\d]{8,10}$")) {
            System.out.println("Valido: " + contraseña);
        } else {
            System.out.println("Invalido: " + contraseña);
        }
    }
}

