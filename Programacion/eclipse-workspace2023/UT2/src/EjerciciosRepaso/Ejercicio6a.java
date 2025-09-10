package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio6a {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=0,cont=0,mayor=0;
		int suma=0;
		for(int i=0;i<10;i++){
			System.out.println("Dame un numero");
			num=sc.nextInt();
			if(num%5==0 && num>=10) {
				suma=suma+num;
				cont++;
				if(mayor<num) {
					mayor=num;
				}

			}
		}
		System.out.println("La media es: "+(suma/cont));
		System.out.println("El mayor de los introducidos es que cumpla con los requisitos: "+mayor);
		sc.close();
	}
}
