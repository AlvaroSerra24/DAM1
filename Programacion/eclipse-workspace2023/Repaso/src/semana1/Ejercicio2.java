package semana1;
import java.io.*;


import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		ArrayList<Integer>numeros= new ArrayList<Integer>();
		int sum=0, mayor=0, menor=99;
		
		try {
			Scanner entrada=new Scanner(new File("numeros.txt"));
			String cadena;
			while(entrada.hasNext()) {
				cadena=entrada.next();
				System.out.println(cadena);
				numeros.add(Integer.parseInt(cadena));
			}
			System.out.println(numeros);
			
			for(Integer a: numeros) {
				sum+=a;
				if(a>mayor)
					mayor=a;
				else
					if(a<menor)
						menor=a;
			}
			
			
			System.out.println("La media es: "+sum/numeros.size());
			System.out.println("El numero menor es: "+menor);
			System.out.println("El numero mayor es: "+mayor);
			
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}	
	}
}
