package Ejercicio3;

import java.util.Objects;

import VideoClub.main;

public class circulo extends Figura {
	private double radio;

	public circulo(String color, double radio) {
		super(color);
		this.radio = radio;
	}
	public circulo() {
		super();
		this.radio = 0;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double area() {
		return Math.PI*Math.pow(radio, 2);
	}
	public double perimetro() {
		return 2*Math.PI*this.radio;
	}
	@Override
	public boolean equals(Object obj) {
		if (getClass() != obj.getClass())
			return false;
		circulo other = (circulo) obj;
		return this.getRadio()==other.getRadio()
				&& this.getColor().equalsIgnoreCase(other.getColor());
	}
	
	public static void main(String[] args) {
		circulo c=new circulo("verde", 2);
		circulo p=new circulo("verde", 3);
		if(c.equals(p)) {
			System.out.println("Son iguales");
		}else {
			System.out.println("Son diferentes");
		}
	}
	@Override
	public String toString() {
		return "circulo [radio=" + radio + ", color=" + color + "]";
	}
	
}
