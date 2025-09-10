package clinica;

public abstract class Persona {
	protected String DNI;
	protected String nombre;
	protected String apellidos;
	protected String telefono;
	
	public Persona(String dNI, String nombre, String apellidos, String telefono) {
		this.DNI = dNI;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
	}
	
	public Persona() {
		this.DNI = "";
		this.nombre = "";
		this.apellidos = "";
		this.telefono = "";
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Persona [DNI=" + DNI + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono
				+ "]";
	}
	
	
}
