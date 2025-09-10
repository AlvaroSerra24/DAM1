package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumerosStream {
	public static void main(String[] args) {
		List<Integer>numeros=Arrays.asList(2,3,4,5,6,7);
		
		//Crear una lista con los cuadrados
		List<Integer> cuadrado=new ArrayList<Integer>();
		cuadrado=numeros.stream().map(i->i*i).toList();
		System.out.println(cuadrado);
		//Contar cuántos números hay mayores o íguales a 4
		long cont=numeros.stream().filter(i->i>=4).count();
		System.out.println(cont);	
		//Media
		double media=numeros.stream().mapToInt(Integer::intValue).average().getAsDouble();
		System.out.println(media);
		//Suma total
		int suma=0;
		suma=numeros.stream().mapToInt(i->i.intValue()).sum();
		System.out.println(suma);
		//Comprobar si todos son menores que 10
		if(numeros.stream().allMatch(n->n<10))
			System.out.println("Todos son menores que 10");
		else
			System.out.println("No hay");
	}
}
