package aparcamiento;

import java.util.Scanner;

public class Aparcamiento {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int opcion=0;
		do {
			menu();
			opcion=sc.nextInt();
			switch (opcion) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 0:
				System.out.println("Adios!!!");
				break;
			}
		}while (opcion!=0);
	}

	private static void menu() {
		// TODO Auto-generated method stub
		System.out.println("1. Leer conductores");
		System.out.println("2. Dar de alta cliente");
		System.out.println("3. Guardad clientes");
		System.out.println("4. Leer clientes");
		System.out.println("5. Generar tickets");
		System.out.println("6. Imprimir turno de entrega");
		System.out.println("0. Salir");
		System.out.println("Elige tu opcion: ");
	}
}
