package Frutas;

public class Cliente extends Persona{
	private String metodoPago;

	public Cliente(String dni, String nombre, String apellidos, String dirección, String metodoPago) {
		super(dni, nombre, apellidos, dirección);
		this.metodoPago = metodoPago;
	}
	
	public Cliente() {
		super();
		this.metodoPago = "";
	}

	public String getMetodoPago() {
		return metodoPago;
	}

	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}

	@Override
	public String toString() {
		return "Cliente [metodoPago=" + metodoPago + ", dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", dirección=" + dirección + "]";
	}
}
