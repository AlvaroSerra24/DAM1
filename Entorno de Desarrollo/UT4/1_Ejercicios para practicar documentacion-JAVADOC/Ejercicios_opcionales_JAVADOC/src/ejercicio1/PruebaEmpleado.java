package ejercicio1;

public class PruebaEmpleado {

	public static void main(String[] args) {
		Empleado empleado = new Empleado("Juan", 30, "Finanzas");
		System.out.println("Empleado: " + empleado.getNombre() + ", Edad: " + empleado.getEdad() + ", Departamento: "
				+ empleado.getDepartamento());
	}

}
