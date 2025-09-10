package Arrays;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String diaSemana[]= {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
	double tempSemana[]=new double[7];
	double sumaT=0;
	
	for (int i=0; i<tempSemana.length; i++) {
		System.out.println("Temperatura"+diaSemana[i]);
		tempSemana[i]=sc.nextDouble();
		sumaT=sumaT+tempSemana[i];
	}
	double mediaT=sumaT/tempSemana.length;
	System.out.println("La media es: "+mediaT);
	for(int i=0; i<tempSemana.length; i++) {
		if(tempSemana[i]<mediaT)
			System.out.println("La temperatura del "+diaSemana[i]+" esta por debajo de la media");
		if(tempSemana[i]>mediaT)
			System.out.println("La temperatura del "+diaSemana[i]+" esta por encima de la media");
		if(tempSemana[i]==mediaT)
			System.out.println("La temperatura del "+diaSemana[i]+" es igual que el de la media");
	}
	sc.close();
	}
}
