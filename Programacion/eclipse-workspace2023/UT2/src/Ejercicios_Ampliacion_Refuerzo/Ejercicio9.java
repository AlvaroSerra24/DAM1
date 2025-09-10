package Ejercicios_Ampliacion_Refuerzo;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=0,mayor=0,menor=0;
		int suma=0;
		float media=0;
		for(int i=0;i<10;i++) {
			System.out.println("Dame tu nombre");
			num=sc.nextInt();
			if(i==0) {
				mayor=num;
				menor=num;
			}else{
				if(num<menor)
					menor=num;
				if(num>mayor)
					mayor=num;
			}
			suma=suma+num;
		}
		media=(suma/10);
		System.out.println("Suma: "+suma);
		System.out.println("Media: "+media);
		System.out.println("Mayor: "+mayor);
		System.out.println("Menor: "+menor);
		sc.close();
	}
}
