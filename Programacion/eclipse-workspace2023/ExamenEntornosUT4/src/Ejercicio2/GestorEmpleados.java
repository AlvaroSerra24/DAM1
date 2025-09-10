package Ejercicio2;


public class GestorEmpleados {
	/**
	 * @author Alvaro Serradilla Otero
	 * Un programa para procesar a los empleados
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param salario
	 * @param departamento
	 * @param id
	 * @param direccion
	 * @param telefono
	 * @param email
	 */
    
    public void procesarEmpleado(String nombre, String apellido, int edad, double salario, String departamento, int id, String direccion, String telefono, String email) {
    	int año=12;
        
        imprimirDetallesEmpleado(nombre, apellido, SalarioAnual(salario, año), bonificacion(salario), departamento);
        double salarioTotal = salario * año + bonificacion(salario);  
        System.out.println("Salario Total Anual: " + salarioTotal);
    }

    /**
     * Calculamos la bonificacion
     * @param salario
     * @return
     */
    private double bonificacion(double salario) {
		// TODO Auto-generated method stub
    	double bonificacion = salario * 0.1;
		return bonificacion;
	}

    /**
     * Calculamos el Salario Anual
     * @param salario
     * @param año
     * @return
     */
	private double SalarioAnual(double salario, int año) {
		// TODO Auto-generated method stub
        double salarioAnual = salario * año;
        return salarioAnual;
	}
	
	/**
	 * Imprimimos los detalles del empleado
	 * @param nombre
	 * @param apellido
	 * @param salario
	 * @param bonificacion
	 * @param departamento
	 */

	public void imprimirDetallesEmpleado(String nombre, String apellido, double salario, double bonificacion, String departamento) {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Salario Anual: " + salario);
        System.out.println("Bonificación: " + bonificacion);
        System.out.println("Departamento: " + departamento);
    }

   /**
    * calculamos los incrementos del salario
    * @param s
    * @param años
    * @return
    */
	
    public double calcularIncrementoSalario(double s, int años) {
        double incremento = s * 0.05 * años;  
        return s + incremento;
    }
    
   /**
    * calculamso las vacaciones 
    * @param años
    * @return
    */
    public int calcularVacaciones(int años) {
        int base = 20;
        if (años > 10) {
            return base + 5;  
        }
        return base;
    }
}
