package Examen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
	private ArrayList<Publicista>LPublicistas;
	private ArrayList<Oferta> LOfertas;
	
	public App(ArrayList<Publicista> lPublicistas, ArrayList<Oferta> lOfertas) {
		this.LPublicistas = lPublicistas;
		this.LOfertas = lOfertas;
	}

	public App() {
		this.LPublicistas = new ArrayList<Publicista>();
		this.LOfertas = new ArrayList<Oferta>();
	}

	public ArrayList<Publicista> getLPublicistas() {
		return LPublicistas;
	}

	public void setLPublicistas(ArrayList<Publicista> lPublicistas) {
		this.LPublicistas = lPublicistas;
	}

	public ArrayList<Oferta> getLOfertas() {
		return LOfertas;
	}

	public void setLOfertas(ArrayList<Oferta> lOfertas) {
		this.LOfertas = lOfertas;
	}

	@Override
	public String toString() {
		return "App [LPublicistas=" + LPublicistas + ", LOfertas=" + LOfertas + "]";
	}
	
	public void generarCorreos(Publicista p)  {
		Scanner sc= new Scanner(System.in);
		for(Cliente c: p.getLClientes()) {
			try {
				c.interesesCliente("intereses.csv");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			for(Oferta n:this.LOfertas) {
				if(n.getCategoría().equals(c.getIntereses()) && n.getPuntos()<=c.getnPuntos()) {
					c.setCorreo(sc.next());;
				}
			}
		}
	}
	
	public void cargarListaPublicista(String filename) {
		try {
			Scanner entrada = new Scanner(new File(filename));
			String cadena = "";
			String[] linea;
			while(entrada.hasNext()) {
				cadena = entrada.nextLine();
				linea = cadena.split(";");
				if(linea[0].equals("publicista")) {
					this.getLPublicistas().add(new  Publicista(linea[1],linea[2],linea[3],linea[4],Integer.parseInt(linea[5])));
				}
			}
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void cargarListaOfertas(String filename) {
		try {
			Scanner entrada = new Scanner(new File(filename));
			String cadena = "";
			String[] linea;
			while(entrada.hasNext()) {
				cadena = entrada.nextLine();
				linea = cadena.split(",");
				this.getLOfertas().add(new  Oferta(linea[0], linea[1], linea[2], Integer.parseInt(linea[3])));
			}
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		App app=new App();
		app.cargarListaPublicista("Personas.csv");
		app.cargarListaOfertas("Ofertas.txt");
		System.out.println("Envío de ofertas a los clientes 27/02/2024");
		for(Publicista p: app.getLPublicistas()) {
			p.cargarListaClientes("Personas.csv");
			//app.generarCorreos(p);
			System.out.println(" "+p.getNombre()+" "+p.getApellidos()+" envía "+p.getLClientes().size()+" correos");
		}
	}
}
