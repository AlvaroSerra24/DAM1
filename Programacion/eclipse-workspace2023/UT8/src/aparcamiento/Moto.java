package aparcamiento;

import java.io.Serializable;

public class Moto extends Vehiculo implements Serializable{
	private String Tipo;
	private String Cilindrada;
	private String Carnet;
	public Moto(String matricula, String color, String marca, String modelo, String tipo, String cilindrada,
			String carnet) {
		super(matricula, color, marca, modelo);
		Tipo = tipo;
		Cilindrada = cilindrada;
		Carnet = carnet;
	}
	
	public Moto() {
		super();
		Tipo = "";
		Cilindrada = "";
		Carnet = "";
	}

	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public String getCilindrada() {
		return Cilindrada;
	}
	public void setCilindrada(String cilindrada) {
		Cilindrada = cilindrada;
	}
	public String getCarnet() {
		return Carnet;
	}
	public void setCarnet(String carnet) {
		Carnet = carnet;
	}
	@Override
	public String toString() {
		return "Moto [Tipo=" + Tipo + ", Cilindrada=" + Cilindrada + ", Carnet=" + Carnet + ", Matricula=" + Matricula
				+ ", Color=" + Color + ", Marca=" + Marca + ", Modelo=" + Modelo + "]";
	}
	
}
