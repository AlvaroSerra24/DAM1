package Ejercicio;

import java.util.Scanner;

public class Ejercicio {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=0, b=0;
		String opcion="";
		do {
			System.out.println("Dame un numero a");
			a=sc.nextInt();
			System.out.println("Dame un numero b");
			b=sc.nextInt();
		}while((a==b) || (a<=0) || (b<=0));
		do {
			Menu();
			opcion=sc.next();
			switch(opcion) {
			case "a":
				amigos(a,b);
				break;
			case "b":
				primos(a,b);
				break;
			case "c":
				imprimir(a,b);
				break;
			case "d":
				sumar(a,b);
				break;
			case "e":
				System.out.println("Adios!");
				break;
			}
		}while(opcion.charAt(0)!='e');
		sc.close();
	}

	private static int sumar(int a, int b) {
		int sumab=0;
		if(b>10) {
			do {
				int r = b % 10;
				b = b / 10;
				sumab = sumab + r;
			}while(b>0);
		}
		else
			sumab=b;
		System.out.println(sumab);
		return sumab;
	}

	private static void imprimir(int a, int b) {
		if(a>10) {
			do {
				int r = a % 10;
				a = a / 10;
				System.out.println(r);
			}while(a>0);
		}
		else
			System.out.println(a);
		return;
	}

	private static void primos(int a, int b) {
		if(b>a) {
			for(int i=a;i<=b;i++) {
				if(i!=2) {
					if(i!=3) {
						if((i%2==0) || (i%3==0) || (i==1))
							System.out.println("El numero "+i+" no es primo");
						else
							System.out.println("El numero "+i+" es primo");
					}
					else
						System.out.println("El numero "+i+" es primo");
				}
				else
					System.out.println("El numero "+i+" es primo");
			}
		}
		else {
			for(int j=b;j<=a;j++) {
				if(j!=2) {
					if(j!=3) {
						if((j%2==0) || (j%3==0) || (j==1))
							System.out.println("El numero "+j+" no es primo");
						else
							System.out.println("El numero "+j+" es primo");
					}
					else
						System.out.println("El numero "+j+" es primo");
				}
				else
					System.out.println("El numero "+j+" es primo");
			}
		}
		return;
	}

	private static int amigos(int a, int b) {
		int t=0;
		for(int i=1;i<a;i++) {
			if(a%i==0)
				t=t+i;
		}
		if(t==b)
			System.out.println("Son numeros amigos");
		else
			System.out.println("No son amigos");
		return(t);
	}

	private static void Menu() {
		System.out.println("a.¿Son números amigos?");
		System.out.println("b.¿Cuántos primos hay entre ambos?");
		System.out.println("c.Imprimir las cifras de a");
		System.out.println("d.Sumar las cifras de b");
		System.out.println("e.Salir");
		System.out.println("Elija una opcion: ");
	}
}
