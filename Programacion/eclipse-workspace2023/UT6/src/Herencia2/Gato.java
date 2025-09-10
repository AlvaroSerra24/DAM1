package Herencia2;

public class Gato extends Animal{

	public Gato(String nombre, String chip, String raza, int nPatas, String color, String sonido) {
		super(nombre, chip, raza, nPatas, color, sonido);
		// TODO Auto-generated constructor stub
	}
	public String emitirSonido() {
		return "Miauu";
	}
}
