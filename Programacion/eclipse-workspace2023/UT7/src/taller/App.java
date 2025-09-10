package taller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
	public ArrayList<Coche> cargarCoches(String fichero) throws FileNotFoundException{
		Scanner entrada=new Scanner(new File(fichero));
		ArrayList<Coche>coches=new ArrayList<Coche>();
		String linea[];
		String cadena;
		entrada.nextLine();
		while(entrada.hasNext()) {
			cadena=entrada.nextLine();
			linea=cadena.split(";");
			coches.add(new Coche(linea[0], linea[1], linea[2], linea[3], Integer.parseInt(linea[4]), Double.parseDouble(linea[5])));
		}
		return coches;
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		App a=new App();
		int cont=0;
		ArrayList<Coche>coches=new ArrayList<Coche>();
		coches=a.cargarCoches("coches.csv");
		System.out.println(coches);
		
		for(Coche c: coches) {
			if(c.getnPuertas()==5)
				cont++;
		}
		System.out.println("Número de coches de 5 puertas: "+cont);
		
		//Matricula, marca y modelo de los coches negros
		for(Coche c: coches) {
			if(c.getColor().equalsIgnoreCase("negro"))
				System.out.println(c.getMatricula()+" "+c.getMarca()+" "+c.getModelo());
		}
		
		//EL coche con mayor número de Km (objeto)
		
//		double max=0;
//		Coche c=new Coche();
//		for(Coche co: coches) {
//			if(co.getKm()<max) {
//				c=co;
//				max=co.getKm();
//			}
//		}
//		System.out.println("El coche con mayor km: ");
//		System.out.println("\t"+c);
		
		//Matricula del coche con menor número de Km
		
		
		
		//Guardar en otro AL los coches de 3 puertas y Borrarlos de coches
		for(int i=0; i<coches.size(); i++) {
			if(coches.get(i).getnPuertas()==3)
				coches.remove(i);
		}
		
	}
	
}
