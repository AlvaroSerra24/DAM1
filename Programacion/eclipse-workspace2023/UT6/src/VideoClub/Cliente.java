package VideoClub;

import java.util.Arrays;

public class Cliente {
	private Alquiler alquileres[];
	private String nombre;
	private int posicion;
	
	public Cliente() {
		this.nombre="";
		this.alquileres=new Alquiler[5];
		this.posicion=0;
	}

	public Cliente(String nombre) {
		this.nombre = nombre;
		this.alquileres=new Alquiler[5];
		this.posicion=0;
	}

	public Cliente(Alquiler[] alquileres, String nombre, int posicion) {
		super();
		this.alquileres = alquileres;
		this.nombre = nombre;
		this.posicion = posicion;
	}

	public Alquiler[] getAlquileres() {
		return alquileres;
	}

	public void setAlquileres(Alquiler[] alquileres) {
		this.alquileres = alquileres;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	
	public void nuevoAlquiler(Alquiler a) {
		if(this.posicion<5) {
			this.alquileres[posicion]=a;
			this.posicion++;
		}
	}
	
	public void informeAlquiler() {
		int tipo=0;
		double suma=0;
		double eurosDVD=0;
		int puntos=this.getPosicion();
		System.out.println("TICKET para "+this.getNombre()+" :");
		//Para cada alquiler el tipo del dvd y el número de días
		for(int i=0; i<this.getAlquileres().length;i++) {
			
			tipo=this.getAlquileres()[i].getDvd().getTipo();
			switch(tipo) {
			case DVD.NORMAL:
				eurosDVD=2*this.getAlquileres()[i].getTiempo();
				break;
			case DVD.INFANTIL:
				eurosDVD=1.5*this.getAlquileres()[i].getTiempo();
				break;
			case DVD.NOVEDAD:
				eurosDVD=3*this.getAlquileres()[i].getTiempo();
				break;
			}
			System.out.println("\t "+this.getAlquileres()[i].getDvd().getNombre()+"\t "+eurosDVD+"€");
			suma=suma+eurosDVD;
		}
		System.out.println("Importe total: "+suma+"€");
		System.out.println("Puntos :"+puntos);
	}
	public static void main(String[] args) {
		DVD mulan=new DVD("Mulan", DVD.INFANTIL);
		DVD casablanca=new DVD("Casablanca", DVD.NORMAL);
		Alquiler a1=new Alquiler(casablanca, 3);
		Alquiler a2=new Alquiler(mulan, 2);
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
