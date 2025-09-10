package Arrays;

import java.util.Arrays;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		int []numeros=new int[20];
		
		for (int i=0; i<numeros.length; i++) {
			numeros[i]=(int)(1+Math.random()*50);
		}
		System.out.println("Array");
		System.out.println(Arrays.toString(numeros));
		System.out.println("Array al revés");
		System.out.println(arrayReves(numeros));
		
	}
	
	public static String arrayReves(int numeros[]) {
		String reves="[";
		for(int i=numeros.length-1;i>=0;i--) {
			if(i!=0) {
				reves=reves+numeros[i]+", ";
			}
		}
		reves=reves+numeros[0]+"]\n";
		return reves;
	}

}
