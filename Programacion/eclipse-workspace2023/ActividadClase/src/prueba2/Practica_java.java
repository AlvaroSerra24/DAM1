package prueba2;

import java.util.Scanner;

public class Practica_java {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=0, b=0;
		String opcion="";
		boolean cumple=true; 
		do {
			System.out.println("Dame un numero a");
			a=sc.nextInt();
			System.out.println("Dame un numero b");
			b=sc.nextInt();
			if((a==b) || (a<=0) || (b<=0) || (a>10)) {
				cumple=false;
				System.out.println(cumple+", No se cumplen los requisitos");
			}
			else {
				cumple=true;
				System.out.println(cumple+", Se cumplen los requisitos");
			}
			
		}while((a==b) || (a<=0) || (b<=0) || (a>10));
	
		do {
			Menu();
			opcion=sc.next();
			switch(opcion) {
			case "a":
				Fibonacci(b);
				break;
			case "b":
				Primos(a,b);
				break;
			case "c":
				Palindromos(a,b);
				break;
			case "d":
				Factorial(a);
				break;
			case "e":
				System.out.println("Adios!");
				break;
			}
		}while(opcion.charAt(0)!='e');
		sc.close();
	}

	private static void Fibonacci(int b) {
		double Fibonacci[]=new double[b];
		int a=0, c=1,cont=0;
		System.out.println(a);
		System.out.println(c);
		for(int i=0;i<Fibonacci.length;i++) {
			if(cont==0) {
				a=a+c;
				System.out.println(a);
			}
			if(c%2==0) {
				a=a+c;
				System.out.println(a);
			}
			c++;
			cont++;
		}
			
	}
	private static void Primos(int a, int b) {
		int mayor=0,menor=0,cont1=0,cont2=0;
		if(b>a) {
			for(int i=a;i<=b;i++) {
				if(i!=2) {
					if(i!=3) {
						if((i%2!=0) || (i%3!=0) || (i!=1)) {
							if(cont1==0) {
								mayor=i;
								menor=i;										
							}else
								if(i>mayor) {
									mayor=i;
								}else
									menor=i;
							cont1++;
							if(i==b) {
								System.out.println("El numero "+mayor+" es el primo mas grande");
							}
						}
					}
				}
			}
		}
		else {
			for(int j=b;j<=a;j++) {
				if(j!=2) {
					if(j!=3) {
						if((j%2!=0) || (j%3!=0) || (j==1))
							if(cont2==0) {
								mayor=j;
								menor=j;										
							}else
								if(j>mayor) {
									mayor=j;
								}else
									menor=j;
							cont2++;
							if(j==a) {
								System.out.println("El numero "+mayor+" es el primo mas grande");
							}
					}
				}
			}
		}
		return;
	}

	private static void Palindromos(int a, int b) {
		Scanner sc=new Scanner(System.in);
		
		if(b>a) {
			for(int i=a;i<=b;i++) {
				if(i%2!=0) {
					if(i>10) {
						for(int z=0;z<2;z++) {
							int nume=i;
							int r=i%10;
							i=i/10;
							if(i==r) {
							System.out.println(nume+"es palíndromo");	
							}
						}
							
					}else {
						System.out.println(i+" es palindromo");
					}
						
				}	
			}
		}
		else {
			for(int j=b;j<=a;j++) {
				if(j%2!=0) {
					if(j>10) {
						for(int z=0;z<2;z++) {
							int nume=j;
							int r=j%10;
							j=j/10;
							if(j==r) {
							System.out.println(nume+"es palíndromo");	
							}
						}
				}
			}
		}
		}
		sc.close();
	}

	private static int Factorial(int a) {
		if(a==0)
			return 1;
		else
			return a*Factorial(a-1);
	}
	private static void Menu() {
		System.out.println("a.Imprimir los primeros b términos de la sucesión de Fibonacci");
		System.out.println("b.El mayor primo entre a b");
		System.out.println("c.Imprimir los palíndromos pares entre a y b");
		System.out.println("d.Imprimir el factorial de a");
		System.out.println("e.Salir");
		System.out.println("Elija una opcion: ");
		
	}
}
