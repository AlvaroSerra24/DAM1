package Herencias;

public class Consultor extends Trabajador {
	private int horas;
	private double tarifas;
	
	public Consultor() {
		super();
		this.horas=0;
		this.tarifas=0;
	}
	public Consultor(String nombre, String apellidos, String dni, String direccion, int horas, double tarifas) {
		super(nombre, apellidos, dni, direccion);
		this.horas = horas;
		this.tarifas = tarifas;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public double getTarifas() {
		return tarifas;
	}
	public void setTarifas(double tarifas) {
		this.tarifas = tarifas;
	}
	@Override
	public String toString() {
		return "Consultor [horas=" + horas + ", tarifas=" + tarifas + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", dni=" + dni + ", direccion=" + direccion + "]";
	}
	
	public double calcularPaga() {
		return this.horas*this.tarifas;
	}
}
