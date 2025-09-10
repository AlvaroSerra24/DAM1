package VideoClub;

import java.util.ArrayList;
import java.util.Arrays;

public class Cliente {
	private ArrayList<Alquiler> alquileres;
	private String nombre;
	
	public Cliente() {
		this.nombre="";
		this.alquileres=new ArrayList<Alquiler>();
	}

	public Cliente(String nombre) {
		this.nombre = nombre;
		this.alquileres=new ArrayList<Alquiler>();
	}

	public Cliente(ArrayList<Alquiler>  alquileres, String nombre, int posicion) {
		super();
		this.alquileres = alquileres;
		this.nombre = nombre;

	}

	public ArrayList<Alquiler> getAlquileres() {
		return alquileres;
	}

	public void setAlquileres(ArrayList<Alquiler> alquileres) {
		this.alquileres = alquileres;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void nuevoAlquiler(Alquiler a) {
		this.getAlquileres().add(a);
	}
	
	public void informeAlquiler() {
		int tipo=0;
		double suma=0;
		double eurosDVD=0;
		int puntos=this.getAlquileres().size();
		System.out.println("TICKET para "+this.getNombre()+" :");
		//Para cada alquiler el tipo del dvd y el número de días
		//for(int i=0; i<this.getAlquileres().length;i++) {
		for(Alquiler a: this.getAlquileres()) {
			tipo=a.getDvd().getTipo();
			switch(tipo) {
			case DVD.NORMAL:
				eurosDVD=2*a.getTiempo();
				break;
			case DVD.INFANTIL:
				eurosDVD=1.5*a.getTiempo();
				break;
			case DVD.NOVEDAD:
				eurosDVD=3*a.getTiempo();
				break;
			}
			System.out.println("\t "+a.getDvd().getNombre()+"\t "+eurosDVD+"€");
			suma=suma+eurosDVD;
		}
		System.out.println("Importe total: "+suma+"€");
		System.out.println("Puntos :"+puntos);
	}
	public static void main(String[] args) {
		DVD mulan=new DVD("Mulan", DVD.INFANTIL);
		DVD casablanca=new DVD("Casablanca", DVD.NORMAL);
		Alquiler a1=new Alquiler(casablanca, 4);
		Alquiler a2=new Alquiler(mulan, 3);
		Cliente maria=new Cliente("Maria");
		maria.nuevoAlquiler(a1);
		maria.nuevoAlquiler(a2);
		maria.informeAlquiler();
//		System.out.println("Posicion "+maria.getPosicion());
//		System.out.println("Alquileres "+Arrays.toString(maria.getAlquileres()));
//		System.out.println(maria.getAlquileres()[0].getDvd().getNombre());
//		System.out.println(maria.getAlquileres()[0].getDvd().getTipo());
	}
}
