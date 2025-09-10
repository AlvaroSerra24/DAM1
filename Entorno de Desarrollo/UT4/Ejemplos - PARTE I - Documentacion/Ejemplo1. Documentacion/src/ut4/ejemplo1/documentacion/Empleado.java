
package ut4.ejemplo1.documentacion;

/**
 * Clase Empleado que representa la información y las operaciones de un empleado.
 * <p>
 * Esta clase proporciona métodos para establecer y obtener los detalles de un empleado
 * como su nombre, identificación y salario.
 * </p>
 *
 * @author Nombre del autor
 * @version 1.0
 */
public class Empleado {

    /**
     * Identificación única del empleado, del tipo 'int'.
     */
    private int id;

    /**
     * Nombre del empleado, del tipo 'String'.
     */
    private String nombre;

    /**
     * Salario del empleado, del tipo 'double'.
     */
    private double salario;

    /**
     * Constructor para crear un nuevo empleado con id, nombre y salario.
     *
     * @param id     Identificación del empleado, del tipo 'int'.
     * @param nombre Nombre del empleado, del tipo 'String'.
     * @param salario Salario del empleado, del tipo 'double'.
     */
    public Empleado(int id, String nombre, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
    }

    /**
     * Obtiene la identificación del empleado.
     *
     * @return El ID del empleado, del tipo 'int'.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece la identificación del empleado.
     *
     * @param id El ID del empleado, del tipo 'int'.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del empleado.
     *
     * @return El nombre del empleado, del tipo 'String'.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del empleado.
     *
     * @param nombre El nombre del empleado, del tipo 'String'.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el salario del empleado.
     *
     * @return El salario del empleado, del tipo 'double'.
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Establece el salario del empleado.
     *
     * @param salario El salario del empleado, del tipo 'double'.
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Método para imprimir los detalles del empleado.
     *
     * @return Detalles del empleado en formato String, del tipo 'String'.
     */
    @Override
    public String toString() {
        return "Empleado{" +
               "id=" + id +
               ", nombre='" + nombre + '\'' +
               ", salario=" + salario +
               '}';
    }
}
