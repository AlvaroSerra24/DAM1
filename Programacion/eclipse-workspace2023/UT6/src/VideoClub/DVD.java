package VideoClub;

public class DVD {
	private String nombre;
	private int tipo;
	public static final int INFANTIL=2;
	public static final int NOVEDAD=1;
	public static final int NORMAL=0;
	public DVD(String nombre, int tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
	}
	public DVD() {
		this.nombre="";
		this.tipo=DVD.NORMAL;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "DVD [nombre=" + nombre + ", tipo=" + tipo + "]";
	}
	
	public static void main(String[] args) {
		DVD mulan=new DVD("Mulan", DVD.INFANTIL);
		System.out.println(mulan);
	}
}
