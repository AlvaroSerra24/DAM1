package ut4.ejemplo1.documentacion;

/**
 * Clase Principal que ejecuta la aplicación.
 * <p>
 * Esta clase contiene el método main, que es el punto de entrada de la aplicación.
 * En este método se crean instancias de la clase Empleado y se muestran sus detalles.
 * </p>
 *
 * @autor Tu nombre
 * @version 1.0
 */
public class EmpleadoApp {

    /**
     * El punto de entrada principal del programa.
     * <p>
     * Este método crea instancias de la clase Empleado y las utiliza para demostrar
     * las funcionalidades de la clase Empleado. No devuelve ningún valor ya que su tipo
     * de retorno es 'void'.
     * </p>
     *
     * @param args Argumentos de línea de comandos (no utilizados), del tipo 'String[]'.
     */
    public static void main(String[] args) {
        // Creación de un empleado
        Empleado empleado1 = new Empleado(1, "Juan Pérez", 3000.0);

        // Mostrar los detalles del empleado
        System.out.println("Detalles del Empleado 1: " + empleado1);

        // Creación de otro empleado
        Empleado empleado2 = new Empleado(2, "Ana López", 4000.0);

        // Mostrar los detalles del segundo empleado
        System.out.println("Detalles del Empleado 2: " + empleado2);
    }
}

