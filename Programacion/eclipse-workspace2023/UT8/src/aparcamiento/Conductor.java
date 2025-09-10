package aparcamiento;

public class Conductor extends Persona{
	private String codigo;
	private int Turno;
	
	public Conductor(String dNI, String nombre, String apellidos, int edad, String direccion, String email,
			String codigo, int turno) {
		super(dNI, nombre, apellidos, edad, direccion, email);
		this.codigo = codigo;
		Turno = turno;
	}

	public Conductor() {
		super();
		this.codigo = "";
		Turno = 0;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getTurno() {
		return Turno;
	}

	public void setTurno(int turno) {
		Turno = turno;
	}

	@Override
	public String toString() {
		return "Conductor [codigo=" + codigo + ", Turno=" + Turno + ", DNI=" + DNI + ", Nombre=" + Nombre
				+ ", Apellidos=" + Apellidos + ", Edad=" + Edad + ", direccion=" + direccion + ", email=" + email + "]";
	}
	
}
