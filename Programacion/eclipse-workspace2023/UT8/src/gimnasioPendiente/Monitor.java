package gimnasioPendiente;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Monitor extends Persona {
	private ArrayList<actividadReservada>listaActividades;

	public Monitor(String codigo, String nombre, String apellidos, String correo) {
		super(codigo, nombre, apellidos, correo);
		this.listaActividades = new ArrayList<actividadReservada>();
	}

	public Monitor() {
		super();
		this.listaActividades = new ArrayList<actividadReservada>();
	}

	public Monitor(String codigo, String nombre, String apellidos, String correo,
			ArrayList<actividadReservada> listaActividades) {
		super(codigo, nombre, apellidos, correo);
		this.listaActividades = listaActividades;
	}

	public ArrayList<actividadReservada> getListaActividades() {
		return listaActividades;
	}

	public void setListaActividades(ArrayList<actividadReservada> listaActividades) {
		this.listaActividades = listaActividades;
	}

	@Override
	public String toString() {
		return "Monitor [listaActividades=" + listaActividades + ", codigo=" + codigo + ", nombre=" + nombre
				+ ", apellidos=" + apellidos + ", correo=" + correo + "]";
	}
	
	public void imprimirActividades() {
		System.out.println("Las actividades impartidas por el monitor "+this.getCodigo()+" son:");
		for(actividadReservada a: this.getListaActividades()) {
			System.out.println(a.getNombreActividad()+" a las "+a.getHora()+" tiene "+a.getnPar()+" participantes");
		}
	}
	
	public void imprimirPlazasActividades() {
		for(actividadReservada a: this.getListaActividades()) {
			System.out.println((a.getnMax()-a.getnPar())+" plazas disponibles para "+a.getNombreActividad()+"a las "+a.getHora()+" tiene "+a.getnPar()+" participantes");
		}
	}
	
	
	public void cargarActividades(String filename){
		try {
			Scanner entrada = new Scanner(new File(filename));
			String cadena = "";
			String[] linea;
			entrada.nextLine();
			while(entrada.hasNext()) {
				cadena = entrada.nextLine();
				linea = cadena.split(";");
				if(linea[2].equals(this.getCodigo())) {
					this.getListaActividades().add(new actividadReservada(linea[0], Double.parseDouble(linea[1]), linea[2], Integer.parseInt(linea[3]),Integer.parseInt(linea[4])));
				}
			}
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Monitor m=new Monitor("100","Olivia","Fernández","olivia@gmail.com");
		System.out.println(m.getNombre());
		m.cargarActividades("reservaPendientes.csv");
		m.imprimirActividades();
	}
}
