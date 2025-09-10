package gimnasioPendiente;

public class Dueño extends Persona {
	private String telefono;

	public Dueño(String codigo, String nombre, String apellidos, String correo, String telefono) {
		super(codigo, nombre, apellidos, correo);
		this.telefono = telefono;
	}

	public Dueño() {
		super();
		this.telefono = "";
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Dueño [telefono=" + telefono + ", codigo=" + codigo + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", correo=" + correo + "]";
	}
}
