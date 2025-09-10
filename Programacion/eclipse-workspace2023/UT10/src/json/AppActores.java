package json;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class AppActores {
	private ArrayList<Actor>actores;
	
	
	public AppActores() {
		this.actores = new ArrayList<Actor>();
	}
	
	public ArrayList<Actor> getActores() {
		return actores;
	}


	public void setActores(ArrayList<Actor> actores) {
		this.actores = actores;
	}


	public static void main(String[] args) {
		AppActores app=new AppActores();
		app.cargarActores();
		//System.out.println(app.getActores());
		
		List<String> lpais=app.getActores().stream().map(n->n.getPais()).distinct().toList();	
		
		for(int i=0;i<lpais.size();i++) {
			int cont=0;
			System.out.println("Actores de "+lpais.get(i));
			for(Actor a: app.getActores()) {
				if(a.getPais().equals(lpais.get(i))) {
					System.out.println("\t- "+a.getNombre()+" "+a.getApellido());
					cont++;
				}
				
			}
			System.out.println("Total "+cont);
		}	
		
//		System.out.println("Actores de USA");
//		app.contar("USA");
//		System.out.println("Actores de Scotland");
//		app.contar("Scotland");
//		System.out.println("Actores de Wales");
//		app.contar("Wales");
//		System.out.println("Actores de UK");
//		app.contar("UK");
	}	

//	private void contar(String pais) {
//		// TODO Auto-generated method stub
//		int cont=0;
//		for(Actor a: this.getActores()) {
//			if(a.getPais().equals(pais)) {
//				System.out.println("\t- "+a.getNombre()+" "+a.getApellido());
//				cont++;
//			}
//			
//		}
//		System.out.println("Total "+cont);
//	}

	private void cargarActores() {
		//1) objeto para leer todo el fichero
		JSONParser parser=new JSONParser();
		
		try {
			Object obj=parser.parse(new FileReader("actores.json"));
			//2) Convertir obj en JSONArray
			JSONArray actJson=(JSONArray)obj;
			//System.out.println(lenguajes);
			actJson.forEach(a->parsearActores((JSONObject)a));
			
			

		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void parsearActores(JSONObject a) {
		String nombre=(String)a.get("first_name");
		String apellido=(String)a.get("last_name");
		String edad=(String)a.get("age");
		String peliculas=(String)a.get("movies");
		String pais=(String)a.get("country");
		this.getActores().add(new Actor(nombre,apellido,edad,peliculas,pais));
	}
}
