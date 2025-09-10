package json;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Applibro {
	private ArrayList<libro> libros;
	
	public Applibro() {
		this.libros = new ArrayList<libro>();
	}

	public Applibro(ArrayList<libro> libros) {
		this.libros = libros;
	}

	public ArrayList<libro> getLibros() {
		return libros;
	}

	public void setLibros(ArrayList<libro> libros) {
		this.libros = libros;
	}
	
	public static void main(String[] args) {
		int opcion=0;
		Scanner sc=new Scanner (System.in);
		Applibro app=new Applibro();
		app.cargarLibros();
		//System.out.println(app.getLibros());
		do {
			app.menu();
			opcion=sc.nextInt();
			switch(opcion) {
			case 1:
				app.mostrar();
				break;
			case 2:
				app.buscar();
				break;
			case 3:
				app.paginas();
				break;
			case 4:
				System.out.println("Adios!!");
				break;
			}
		}while (opcion != 4);
	}
	
	private void paginas() {
		// TODO Auto-generated method stub
		List<String> mas=this.getLibros().stream().filter(n->n.getPaginas()>500).map(n->n.getNombre()).distinct().toList();
		List<String> menos=this.getLibros().stream().filter(n->n.getPaginas()<500).map(n->n.getNombre()).distinct().toList();
		System.out.println("Estos son los libros con más de 500 paginas");
		for(int i=0;i<mas.size();i++) {
			System.out.println("- "+mas);
		}
		System.out.println("Estos son los libros con menos de 500 paginas");
		for(int i=0;i<menos.size();i++) {
			System.out.println("- "+menos);
		}
	}

	private void buscar() {
		// TODO Auto-generated method stub
		int cont=0;
		List<String> autores=this.getLibros().stream().map(n->n.getAutor()).distinct().toList();
		Scanner sc=new Scanner (System.in);
		for(int i=0;i<autores.size();i++) {
			System.out.println(autores.get(i));
		}
		System.out.println("Elige el autor");
		String b=sc.next();
		for(libro a: this.getLibros()) {
			if(b.equals(a.getAutor())) {
				System.out.println("- "+a.getNombre());
				cont++;
			}
		}
		System.out.println("Total de libros de este autor: "+cont);
	}	

	private void mostrar() {
		// TODO Auto-generated method stub
		int cont=0;
		for(libro a: this.getLibros()) {
				System.out.println("\t- "+a.getNombre());
				cont++;
			}
			System.out.println("Total "+cont);
		}		

	private void cargarLibros() {
		//1) objeto para leer todo el fichero
		JSONParser parser=new JSONParser();
		
		try {
			Object obj=parser.parse(new FileReader("libros.json"));
			//2) Convertir obj en JSONArray
			JSONArray actJson=(JSONArray)obj;
			//System.out.println(lenguajes);
			actJson.forEach(a->parsearlibros((JSONObject)a));
			
			

		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void parsearlibros(JSONObject a) {
		String nombre=(String)a.get("name");
		String autor=(String)a.get("author");
		String fecha=(String)a.get("year");
		long paginas=(long)a.get("pages");
		this.getLibros().add(new libro(nombre,autor,fecha,paginas));
	}
	
	private void menu() {
		
		System.out.println("1. Mostrar todos los libros");
		System.out.println("2. Busca los libros de un mismo autor");
		System.out.println("3. Mostrar cuantas paginas tiene el libro");
		System.out.println("4. Salir");
	}
}
