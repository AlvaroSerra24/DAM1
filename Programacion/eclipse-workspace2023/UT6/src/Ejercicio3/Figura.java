package Ejercicio3;

import java.util.Objects;

public abstract class Figura {
	protected String color;

	public Figura(String color) {
		this.color = color;
	}
	public Figura() {
		this.color="";
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Figura [color=" + color + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Figura other = (Figura) obj;
		return Objects.equals(color, other.color);//return this.getColor().equalsIgnoreCase(other.getColor());	
		}
	public double area() {
		return 0;
	}
	public double perimetro() {
		return 0;
	}
	
}
