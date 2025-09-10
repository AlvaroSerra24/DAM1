package Herencias;

public class Empleado extends Trabajador{
	//Atributos propios del empleado
	private  double impuestos;
	private double sueldo;
	private static final int PAGAS=14;
	
	public Empleado() {
		super();//Constructor por defecto de la super clase
		this.sueldo=0;
		this.impuestos=0;
	}
	public Empleado(String nombre, String apellidos, String dni, String direccion, double sueldo) {
		super(nombre, apellidos, dni, direccion);
		this.impuestos = 0.3*impuestos;
		this.sueldo = sueldo;
	}
	public double getImpuestos() {
		return impuestos;
	}
	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	@Override
	public String toString() {
		return "Empleado [impuestos=" + impuestos + ", sueldo=" + sueldo + ", nombre=" + nombre + ", apellidos="
				+ apellidos + ", dni=" + dni + ", direccion=" + direccion + "]";
	}
	
	public double calcualrPaga() {
		return(this.sueldo-this.impuestos)/PAGAS;
	}
	
	
	
}
