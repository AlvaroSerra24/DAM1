package clinica;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Paciente extends Persona{
	private float peso;
	private int edad;
	private String cita;
	private String historia;
	
	public Paciente(String dNI, String nombre, String apellidos, String telefono, float peso, int edad, String cita,
			String historia) {
		super(dNI, nombre, apellidos, telefono);
		this.peso = peso;
		this.edad = edad;
		this.cita = cita;
		this.historia = historia;
	}
	
	public Paciente() {
		super();
		this.peso = 0;
		this.edad = 0;
		this.cita = "";
		this.historia = "";
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCita() {
		return cita;
	}

	public void setCita(String cita) {
		this.cita = cita;
	}

	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}

	@Override
	public String toString() {
		return "Paciente [peso=" + peso + ", edad=" + edad + ", cita=" + cita + ", historia=" + historia + ", DNI="
				+ DNI + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + "]";
	}
	
	public void generarHistoria(){
		//Crear el directorio
//		File f=new File("boletines");
//		f.mkdir();
		
			
			try {
				PrintWriter salida;
				salida = new PrintWriter(new File("Pacientes/Historia"+this.getDNI()+".txt"));
				salida.println(this.getHistoria());
				salida.close();
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}
	}
	
	public static void main(String[] args) {
		Paciente p=new Paciente("986774463P", "Paco", "Garcia", "67592334", 60,15,"sggs","Le duele la cabeza");
		p.generarHistoria();
		p.setHistoria("Le duele el pie");
		p.generarHistoria();
	}
}
