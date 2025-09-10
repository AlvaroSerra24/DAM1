package Cadenas;

public class Cadenas {
	public static void main(String[] args) {
		String palabra="Hola";
		String pass=new String("DFADF_jfdf123*!");
		//Letras que componen el String
		for(int i=0; i<palabra.length();i++) {
			System.out.println(palabra.charAt(i));//palabra[i]
		}
		//Sustituir un caracter por otro
		palabra=palabra.replace('o', 'a');
		System.out.println(palabra);
		palabra="murcielago";
		String subpalabra=palabra.substring(3);
		System.out.println(subpalabra);
		subpalabra=palabra.substring(3, 6);
		System.out.println(subpalabra);
		
		//Contiene un substring
		if(pass.contains("_")) {
			System.out.println("Contiene _");
		}
		System.out.println(palabra.toUpperCase());
		if(palabra.equals("murcielago"))
			System.out.println("Es igual");
		if(palabra.equalsIgnoreCase("murcielago"))
			System.out.println("Es igual independientemente de mayusculas y minusculas");
	}
}
