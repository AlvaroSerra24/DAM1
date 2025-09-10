package Herencias;

public class Trabajador {

	protected String nombre;
	protected String apellidos;
	protected String dni;
	protected String direccion;
	
	public Trabajador() {
		this.nombre = "";
		this.apellidos = "";
		this.dni = "";
		this.direccion = "";
	}
	
	public Trabajador(String nombre, String apellidos, String dni, String direccion) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.direccion = direccion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", direccion=" + direccion
				+ "]";
	}
	
	public double calcularPaga() {
		return 0;
	}
	
}
