package clinicaVenDAm;

import java.util.ArrayList;

public class Perro extends Animal {
	private String chipID;
	private boolean seguro;
	
	public Perro(int edad, double peso, String raza, String sexo, String nombre, ArrayList<Vacuna> libroVacunacion,
			String chipID, boolean seguro) {
		super(edad, peso, raza, sexo, nombre, libroVacunacion);
		this.chipID = chipID;
		this.seguro = seguro;
	}

	public Perro(int edad, double peso, String raza, String sexo, String nombre, String chipID, boolean seguro) {
		super(edad, peso, raza, sexo, nombre);
		this.chipID = chipID;
		this.seguro = seguro;
	}

	public Perro() {
		super();
		this.chipID = "";
		this.seguro = false;
	}

	public String getChipID() {
		return chipID;
	}

	public void setChipID(String chipID) {
		this.chipID = chipID;
	}

	public boolean isSeguro() {
		return seguro;
	}

	public void setSeguro(boolean seguro) {
		this.seguro = seguro;
	}

	@Override
	public String toString() {
		return "Perro [chipID=" + chipID + ", seguro=" + seguro + ", peso=" + peso + ", raza=" + raza + ", nombre="
				+ nombre + ", libroVacunacion=" + libroVacunacion + "]";
	}
	
	public static void main(String[] args) {
		Vacuna  v=new Vacuna("Leishmania","1 enero", "Phizer", 80);
		Vacuna  v2=new Vacuna("Antirrábica","1 febrero", "Astra Zeneca", 50);
		
		Perro p=new Perro(2, 1, "Border Collie", "hembra", "Lori", "12232", false);
		System.out.println(p);
		
		p.getLibroVacunacion().add(v2);
		p.getLibroVacunacion().add(v);
		
		System.out.println(p);
		
		double suma=0;
		for(Vacuna vac: p.getLibroVacunacion()) {
			suma=suma+vac.getPrecio();
		}
		
		System.out.println("Total vacunas: "+suma);
	}
}
