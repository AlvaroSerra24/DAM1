package aparcamiento;

import java.io.Serializable;

public class Furgoneta extends Vehiculo implements Serializable{
	private int Capacidad;

	public Furgoneta(String matricula, String color, String marca, String modelo, int capacidad) {
		super(matricula, color, marca, modelo);
		Capacidad = capacidad;
	}

	public Furgoneta() {
		super();
		Capacidad = 0;
	}

	public int getCapacidad() {
		return Capacidad;
	}

	public void setCapacidad(int capacidad) {
		Capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Furgoneta [Capacidad=" + Capacidad + ", Matricula=" + Matricula + ", Color=" + Color + ", Marca="
				+ Marca + ", Modelo=" + Modelo + "]";
	}
	
	
}
