package aparcamiento;

import java.io.Serializable;

public class Coche extends Vehiculo implements Serializable{
	private int num_puertas;

	public Coche(String matricula, String color, String marca, String modelo, int num_puertas) {
		super(matricula, color, marca, modelo);
		this.num_puertas = num_puertas;
	}

	public Coche() {
		super();
		this.num_puertas = 0;
	}

	public int getNum_puertas() {
		return num_puertas;
	}

	public void setNum_puertas(int num_puertas) {
		this.num_puertas = num_puertas;
	}

	@Override
	public String toString() {
		return "Coche [num_puertas=" + num_puertas + ", Matricula=" + Matricula + ", Color=" + Color + ", Marca="
				+ Marca + ", Modelo=" + Modelo + "]";
	}
	
	
}
