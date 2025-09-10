package Notas;

import java.util.Scanner;

public class ClaseDam {
	public static void main(String[] args) {
		Alumno a=new Alumno();
		Scanner sc=new Scanner(System.in);
		int opcion=0;
		String m="";
		double c=0;
		do {
			System.out.println("1. Dar de alta");
			System.out.println("2. Asignar nota");
			System.out.println("3. Mostrara número de suspensos");
			System.out.println("4. Calcular la nota media del alumno");
			System.out.println("5. Salir");
			System.out.println("Elige una opción");
			opcion=sc.nextInt();
			switch(opcion) {
			case 1: //Dar de alta
				System.out.println("Dame un nombre :");
				String n=sc.next();
				System.out.println("Dame los apellidos");
				String ap=sc.next();
				System.out.println("Dame su edad");
				int e=sc.nextInt();
				a.setNombre(n);
				a.setApellidos(ap);
				a.setEdad(e);
				break;
			case 2: //Asignar notas
				for(int i=0; i<a.getNotas().length;i++) {
					System.out.println("Modulo");
					m=sc.next();
					System.out.println("Nota");
					c=sc.nextDouble();
					a.getNotas()[i].setModulo(m);
					a.getNotas()[i].setCalificacion(c);
				}
				a.imprimirNotas();
				break;
			case 3: //Número de suspensos
				int cont=0;
				for(int i=0;i<a.getNotas().length;i++) {
					if((a.getNotas()[i].getCalificacion())<5) {
						cont++;
					}
				}
				System.out.println("Los suspensos son :"+cont);
				break;
			case 4: //Nota media
				int suma=0;
				for(int i=0;i<a.getNotas().length;i++) {
					suma+=(a.getNotas()[i].getCalificacion());
				}
				System.out.println("La media de todas las notas es "+(suma/7));
				break;
			case 5:
				System.out.println("Adios!!");
				break;
			}
		}while(opcion!=5);
	}
}
