package json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Lenguajes {
	public static void main(String[] args) {
		int min=2024;
		int fecha=0;
		//1) objeto para leer todo el fichero
				JSONParser parser=new JSONParser();
				
				try {
					Object obj=parser.parse(new FileReader("lenguajes.json"));
					//2) Convertir obj en JSONArray
					JSONArray lenguajes=(JSONArray)obj;
					//System.out.println(lenguajes);
					//lenguajes.forEach(l->parsearLenguaje((JSONObject)l));
					for(Object o: lenguajes) {
						fecha=Integer.parseInt(parsearLenguaje((JSONObject)o));
						if(fecha<min) {
							min=fecha;
						}
					}
					System.out.println("El lenguaje mas antiguo es de: "+min);	
		
				} catch (IOException | ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

	private static String parsearLenguaje(JSONObject l) {
		String nombre=(String)l.get("name");
		String fecha=(String)l.get("publish_date");
		String descripcion=(String)l.get("description");
		System.out.println(nombre+" "+fecha);
		return fecha;
	}
}
