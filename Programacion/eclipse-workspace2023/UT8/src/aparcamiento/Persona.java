package aparcamiento;

import java.io.Serializable;

public class Persona implements Valida,Serializable {
	protected String DNI;
	protected String Nombre;
	protected String Apellidos;
	protected int Edad;
	protected String direccion;
	protected String email;
	
	public Persona(String dNI, String nombre, String apellidos, int edad, String direccion, String email) {
		DNI = dNI;
		Nombre = nombre;
		Apellidos = apellidos;
		Edad = edad;
		this.direccion = direccion;
		this.email = email;
	}

	public Persona() {
		DNI = "";
		Nombre = "";
		Apellidos = "";
		Edad = 0;
		this.direccion = "";
		this.email = "";
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Persona [DNI=" + DNI + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Edad=" + Edad
				+ ", direccion=" + direccion + ", email=" + email + "]";
	}

	@Override
	public boolean valida(String cadena) {
		// TODO Auto-generated method stub
		cadena=DNI;
		if(cadena.matches("[0-9]{8}[A-Z]")) {
			return true;
		}else
			return false;
	}
	
	
}
