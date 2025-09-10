package Herencia2;

public class Perro extends Animal{
	private boolean seguro;

	public Perro(String nombre, String chip, String raza, int nPatas, String color, String sonido, boolean seguro) {
		super(nombre, chip, raza, nPatas, color, sonido);
		this.seguro = seguro;
	}

	public Perro() {
		super();
		this.seguro=false;
	}

	public boolean isSeguro() {
		return seguro;
	}

	public void setSeguro(boolean seguro) {
		this.seguro = seguro;
	}
	public String emitirSonido() {
		return "Guau";
	}
	
	
}
