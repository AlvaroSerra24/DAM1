package objetos;

import java.io.Serializable;

public class Contacto implements Serializable {
	
	private String Nombre;
	private int Telefono;
	private String Direcion;
	private String Correo;
	
	public Contacto(String nombre, int telefono, String direcion, String correo) {
		Nombre = nombre;
		Telefono = telefono;
		Direcion = direcion;
		Correo = correo;
	}
	
	public Contacto() {
		Nombre = "";
		Telefono = 0;
		Direcion = "";
		Correo = "";
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getTelefono() {
		return Telefono;
	}

	public void setTelefono(int telefono) {
		Telefono = telefono;
	}

	public String getDirecion() {
		return Direcion;
	}

	public void setDirecion(String direcion) {
		Direcion = direcion;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}

	@Override
	public String toString() {
		return "Contacto [Nombre=" + Nombre + ", Telefono=" + Telefono + ", Direcion=" + Direcion + ", Correo=" + Correo
				+ "]";
	}
	
	

}
