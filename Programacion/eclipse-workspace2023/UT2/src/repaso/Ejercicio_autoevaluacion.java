package repaso;

import java.util.Scanner;

public class Ejercicio_autoevaluacion {
	public static void main(String[] args) {
		double media=0;
		int contador=0,par=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime tu nombre:");
		String nombre=sc.next();
		System.out.println("Bienvenido, "+nombre);
		
		System.out.println("Dime en que año naciste: ");
		int edad=sc.nextInt();
		edad=2023-edad;
		System.out.println(edad);
		
		if (edad<18) {
			System.out.println("Es menor de edad");
		}
		else {
			if (edad==18)
				System.out.println("Tienes 18 años");
			else
				System.out.println("Es mayor de edad");
		}
		
		Scanner m=new Scanner(System.in);
		System.out.println("Dame un numero del uno al cuatro");
		int menu=m.nextInt();
		switch(menu) {
		case 1:
			Scanner d=new Scanner(System.in);
			System.out.println("Dame un numero");
			int dia=d.nextInt();
			switch(dia) {
			case 1:
				System.out.println("Lunes");
				break;
			case 2:
				System.out.println("Martes");
				break;
			case 3:
				System.out.println("Miercoles");
				break;
			case 4:
				System.out.println("Jueves");
				break;
			case 5:
				System.out.println("Viernes");
				break;
			case 6:
				System.out.println("Sabado");
				break;
			case 7:
				System.out.println("Domingo");
				break;
			default:
				System.out.println("Debe de ser un numero entre 1 y 7");
				break;
			}
		case 2:
			do {
				Scanner n=new Scanner(System.in);
				System.out.println("Dame una nota");
				int nota=n.nextInt();
				media=media+nota;
				contador++;
			} while(contador<6);
			media=media/6;
			System.out.println("Esta es la media "+media);
		case 3:
			Scanner num=new Scanner(System.in);
			System.out.println("Dame un numero ");
			int nv=num.nextInt();
			for (int i=0;i<=nv;i++) {
				if(i%2==1)
					System.out.print(i+" ");
			}
		case 4:
			Scanner nu=new Scanner(System.in);
			System.out.println("Dame un numero ");
			int nuv=nu.nextInt();
			for (int j=0;j<=nuv;j++) {
				if(j%2==0) {
					par=par+j;
				}
			}
			System.out.println(par);
		default:
			System.out.println("Debe de ser un numero entre 1 y 7");
			break;
		}
		sc.close();
	}
}
