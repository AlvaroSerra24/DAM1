package Cine;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import taller.Coche;

public class AppCine {
	private ArrayList<Pelicula> peliculas;
	
	public AppCine() {
		this.peliculas=new ArrayList<Pelicula>();
	}

	public ArrayList<Pelicula> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(ArrayList<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}
	
	public void cargarPelicula(String fichero) throws FileNotFoundException{
		Scanner entrada=new Scanner(new File(fichero));
		String linea[];
		String cadena;
		entrada.nextLine();//Linea de cabecera
		while(entrada.hasNext()) {
			cadena=entrada.nextLine();
			linea=cadena.split(";");
			this.getPeliculas().add(new Pelicula(Integer.parseInt(linea[0]), linea[1], linea[2], linea[3]));
		}
	}
	public static void main(String[] args) throws FileNotFoundException {
		AppCine app=new AppCine();
		app.cargarPelicula("cine.csv");
		Scanner teclado=new Scanner(System.in);
		int opcion=0;
		
		do {
			app.menu();
			opcion=teclado.nextInt();
			switch(opcion) {
			case 1://Añadir peliculas
				System.out.println("Año:");
				int a=teclado.nextInt();
				teclado.nextLine();
				System.out.println("Director:");
				String dir=teclado.nextLine();
				System.out.println("Género:");
				String gen=teclado.nextLine();
				System.out.println("Título:");
				String tit=teclado.nextLine();
				app.nuevaPelicula(a,dir,gen,tit);
				break;
			case 2:
				System.out.println("Título:");
				teclado.nextLine();
				String ti=teclado.nextLine();
				app.borrarPelicula(ti);
				break;
			case 3://Mostrar peliculas
				app.mostrarPeliculas();
				break;
			case 4:
				teclado.nextLine();
				String op=teclado.nextLine();
				app.buscarGenero(op);
				break;
			case 5:
				System.out.println("Adios!!");
				break;
			}
		}while(opcion!=5);

	}

	private void borrarPelicula(String ti) {
		for(int i=0; i<this.getPeliculas().size();i++) {
			if(this.getPeliculas().get(i).getNombre().equalsIgnoreCase(ti)) {
				this.getPeliculas().remove(i);
			}
		}
		
	}

	private void buscarGenero(String op) {
		for(Pelicula p: this.getPeliculas()) {
			if(p.getGenero().equalsIgnoreCase(op)) {
				p.mostrarPelicula();
			}
		}
			
		
	}

	private void nuevaPelicula(int a, String dir, String gen, String tit) {
		this.getPeliculas().add(new Pelicula(a,dir,gen,tit));
		
	}

	private void mostrarPeliculas() {
		for(Pelicula p: this.getPeliculas())
			p.mostrarPelicula();
	}

	private void menu() {
		System.out.println("1. Añadir pelicula");
		System.out.println("2. Borrar pelicula");
		System.out.println("3. Mostrar pelicula");
		System.out.println("4. Buscar por género");
		System.out.println("5. Salir");
	}
	
}
