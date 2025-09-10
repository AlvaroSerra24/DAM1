package aparcamiento;

import java.io.Serializable;

public class Vehiculo implements Valida, Serializable {
	protected String Matricula;
	protected String Color;
	protected String Marca;
	protected String Modelo;
	
	public Vehiculo(String matricula, String color, String marca, String modelo) {
		Matricula = matricula;
		Color = color;
		Marca = marca;
		Modelo = modelo;
	}
	
	public Vehiculo() {
		Matricula = "";
		Color = "";
		Marca = "";
		Modelo = "";
	}

	public String getMatricula() {
		return Matricula;
	}

	public void setMatricula(String matricula) {
		Matricula = matricula;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	
	@Override
	public String toString() {
		return "Vehiculo [Matricula=" + Matricula + ", Color=" + Color + ", Marca=" + Marca + ", Modelo=" + Modelo
				+ "]";
	}

	@Override
	public boolean valida(String cadena) {
		// TODO Auto-generated method stub
		cadena=Matricula;
		if(cadena.matches("[0-9]{4}{-}[A-Z]{3}")){
			return true;
		}else
			return false;
	}

}
