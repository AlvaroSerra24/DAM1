package Ejercicios_Ampliacion_Refuerzo;

import java.util.Scanner;

public class EjercicioC {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=0,cont=0,mayor=0;
		int menor=0;
	for(int i=0;i<12;i++){
		System.out.println("Dame un numero");
		num=sc.nextInt();
		if (num%2==1 && num<20) {
			cont++;
			if(cont==1) {
				mayor=num;
				menor=num;
			}else{
				if(num<menor)
					menor=num;
				if(num>mayor)
					mayor=num;
			}
		}
	}
	System.out.println("Los numeros menores que 20 y impares son: "+cont);
	System.out.println("El mayor de los introducidos es que cumpla con los requisitos: "+mayor);
	System.out.println("El menor de los introducidos es que cumpla con los requisitos: "+menor);
	sc.close();
}
}
