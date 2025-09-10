package Ejercicio3;

public class triangulo extends Figura {
	private double lado1;
	private double lado2;
	private double lado3;
	public triangulo(String color, double lado1, double lado2, double lado3) {
		super(color);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	public triangulo() {
		super();
		this.lado1=0;
		this.lado2=0;
		this.lado3=0;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	@Override
	public String toString() {
		return "triangulo [lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + "]";
	}
	
//	public double area() {
//		if((lado1==lado2) && (lado2==lado3)) {
//			return ;
//		}else {
//			
//		}
//	}
}
