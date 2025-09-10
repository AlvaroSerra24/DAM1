package Ejercicio1;

public class persona {
	private String nombre;
	private String apellidos;
	private Direccion direccion;
	
	public persona() {
		this.nombre="";
		this.apellidos="";
		this.direccion=new Direccion();
	}
	public persona(String nombre, String apellidos, Direccion direccion) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
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
	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		return "persona [nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion + "]";
	}
}
