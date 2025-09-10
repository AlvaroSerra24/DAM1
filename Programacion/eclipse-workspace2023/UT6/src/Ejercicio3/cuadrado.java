package Ejercicio3;

public class cuadrado extends Figura {
	private double lado;

	public cuadrado(String color, double lado) {
		super(color);
		this.lado = lado;
	}
	
	public cuadrado() {
		super();
		this.lado=0;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "cuadrado [lado=" + lado + ", color=" + color + "]";
	}
	public double area() {
		return Math.PI*Math.pow(lado, 2);
	}
	public double perimetro() {
		return 2*Math.PI*this.lado;
	}
	@Override
	public boolean equals(Object obj) {
		if (getClass() != obj.getClass())
			return false;
		cuadrado other = (cuadrado) obj;
		return this.getLado()==other.getLado()
				&& this.getColor().equalsIgnoreCase(other.getColor());
	}
}
