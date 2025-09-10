package json;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;

public class leerjson {
	public static void main(String[] args) {
		//1) objeto para leer todo el fichero
		JSONParser parser=new JSONParser();
		
		try {
			Object obj=parser.parse(new FileReader("data.json"));
			//2 Converit obj en JSONObject
			JSONObject json=(JSONObject)obj;
			
			//3 Extraer los datos del objeto JSON
			String nombre=(String)json.get("nombre");
			long edad=(long)json.get("edad");
			String ciudad=(String)json.get("ciudad");
			
			System.out.println(nombre+" de "+ciudad+" tiene "+edad+" años");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
