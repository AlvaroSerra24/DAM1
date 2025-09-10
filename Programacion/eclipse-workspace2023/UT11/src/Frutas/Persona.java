package Frutas;

public abstract class Persona {
	protected String dni;
	protected String nombre;
	protected String apellidos;
	protected String dirección;
	
	public Persona(String dni, String nombre, String apellidos, String dirección) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dirección = dirección;
	}
	
	public Persona() {
		this.dni = "";
		this.nombre = "";
		this.apellidos = "";
		this.dirección = "";
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
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

	public String getDirección() {
		return dirección;
	}

	public void setDirección(String dirección) {
		this.dirección = dirección;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", dirección=" + dirección
				+ "]";
	}
}
