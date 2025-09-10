package aparcamiento;

import java.io.Serializable;

public class Cliente extends Persona implements Serializable{
	private String hora_llegada;
	private String dias_estancia;
	private String vehiculo;
	
	public Cliente(String dNI, String nombre, String apellidos, int edad, String direccion, String email,
			String hora_llegada, String dias_estancia, String vehiculo) {
		super(dNI, nombre, apellidos, edad, direccion, email);
		this.hora_llegada = hora_llegada;
		this.dias_estancia = dias_estancia;
		this.vehiculo = vehiculo;
	}

	public Cliente() {
		this.hora_llegada = "";
		this.dias_estancia = "";
		this.vehiculo = "";
	}

	public String getHora_llegada() {
		return hora_llegada;
	}

	public void setHora_llegada(String hora_llegada) {
		this.hora_llegada = hora_llegada;
	}

	public String getDias_estancia() {
		return dias_estancia;
	}

	public void setDias_estancia(String dias_estancia) {
		this.dias_estancia = dias_estancia;
	}

	public String getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(String vehiculo) {
		this.vehiculo = vehiculo;
	}

	@Override
	public String toString() {
		return "Cliente [hora_llegada=" + hora_llegada + ", dias_estancia=" + dias_estancia + ", vehiculo=" + vehiculo
				+ ", DNI=" + DNI + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Edad=" + Edad + ", direccion="
				+ direccion + ", email=" + email + "]";
	}
	
	
}
