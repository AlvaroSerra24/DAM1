package Notas;

public class Nota {
	private String modulo;
	private double calificacion;
	
	//Construuctor por defecto
	public Nota() {
		this.modulo="";
		this.calificacion=0;
	}

	//Constructor con 2 parámetros
	public Nota(String modulo, double calificacion) {
		this.modulo = modulo;
		this.calificacion = calificacion;
	}

	public String getModulo() {
		return modulo;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	@Override
	public String toString() {
		return "Módulo:"+modulo+"=>"+calificacion;
	}
	
//	public static void main(String[] args) {
//		Nota n=new Nota();
//		n.setModulo("Programacion");
//		n.setCalificacion(9);
//		System.out.println(n);
//		
//		Nota m=new Nota("BBDD", 7.5);
//		System.out.println(m);
//	}
	
}