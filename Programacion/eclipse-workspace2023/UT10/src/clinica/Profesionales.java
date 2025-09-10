package clinica;

public class Profesionales extends Persona{
	private String especialida;
	private int turno;
	public static final int GUARDIA=2;
	public static final int TARDE=1;
	public static final int MAÑANA=0;
	
	public Profesionales(String dNI, String nombre, String apellidos, String telefono, String especialida, int turno) {
		super(dNI, nombre, apellidos, telefono);
		this.especialida = especialida;
		this.turno = turno;
	}
	
	public Profesionales() {
		super();
		this.especialida = "";
		this.turno = Profesionales.TARDE;
	}

	public String getEspecialida() {
		return especialida;
	}

	public void setEspecialida(String especialida) {
		this.especialida = especialida;
	}

	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Profesionales [especialida=" + especialida + ", turno=" + turno + ", DNI=" + DNI + ", nombre=" + nombre
				+ ", apellidos=" + apellidos + ", telefono=" + telefono + "]";
	}
	
	
}
