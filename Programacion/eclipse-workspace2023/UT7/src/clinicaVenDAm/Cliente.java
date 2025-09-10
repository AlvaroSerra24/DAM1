package clinicaVenDAm;

import java.util.ArrayList;

import VideoClub.main;

public class Cliente {
	private String nombre;
	private String dni;
	private String email;
	private String direccion;
	private ArrayList<Animal>mascotas;
	
	public Cliente(String nombre, String dNI, String email, String direccion, ArrayList<Animal> mascotas) {
		this.nombre = nombre;
		this.dni = dNI;
		this.email = email;
		this.direccion = direccion;
		this.mascotas = mascotas;
	}

	public Cliente(String nombre, String dNI, String email, String direccion) {
		this.nombre = nombre;
		this.dni = dNI;
		this.email = email;
		this.direccion = direccion;
		this.mascotas=new ArrayList<Animal>();
	}
	
	public Cliente() {
		this.nombre = "";
		this.dni = "";
		this.email = "";
		this.direccion = "";
		this.mascotas=new ArrayList<Animal>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Animal> getMascotas() {
		return mascotas;
	}

	public void setMascotas(ArrayList<Animal> mascotas) {
		this.mascotas = mascotas;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", dni=" + dni + ", email=" + email + ", direccion=" + direccion
				+ ", mascotas=" + mascotas + "]";
	}
	
	public static void main(String[] args) {
		Vacuna  v=new Vacuna("Leishmania","1 enero", "Phizer", 80);
		Vacuna  v2=new Vacuna("Antirrábica","1 febrero", "Astra Zeneca", 50);
		
		Perro p=new Perro(2, 1, "Border Collie", "hembra", "Lori", "12232", false);
		Gato g=new Gato(2, 5, "Rag Dol", "macho", "León", true);
		g.getLibroVacunacion().add(v2);
		
		System.out.println(p);
		p.getLibroVacunacion().add(v2);
		p.getLibroVacunacion().add(v);
		
		System.out.println(p);
		
		double suma=0;
		for(Vacuna vac: p.getLibroVacunacion()) {
			suma=suma+vac.getPrecio();
		}
		
		System.out.println("Total vacunas de "+p.getNombre()+": "+suma);
		
		
		Cliente m=new  Cliente("Luis", "1234", "luis@ribera.es", "asgfsdg");
		m.getMascotas().add(p);
		m.getMascotas().add(g);
		
		double suma2=0;
		for(Animal a: m.getMascotas()) {
			for(Vacuna vac: a.getLibroVacunacion()) {
				suma2=suma2+vac.getPrecio();
			}
		}
		System.out.println("Total de las vacunas de las mascotas de "+m.getNombre()+": "+suma2);
	}
}

