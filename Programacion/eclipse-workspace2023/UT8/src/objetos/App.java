package objetos;

import java.util.Scanner;

public class App {
	
	
	
	public void menu() {
	System.out.println("1) Imprimir agenda");
	System.out.println("2) Añadir contacto");
	System.out.println("3) Eliminar contacto");
	System.out.println("4) Salir");
	System.out.println("Elegi una opcion pelotudo:");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		App app=new App();
		Agenda a=new Agenda();
		a.cargarAgenda("agenda.bin");
		app.menu();
		int opcion= 0;
		do {
			switch(opcion) {
			case 1:
				a.imprimirAgenda();
				break;
			case 2:
				System.out.println("Dame un nombre:");
				sc.nextLine();
				String nombre=sc.nextLine();
				System.out.println("Dame un telefono:");
				int telefono=sc.nextInt();
				sc.nextLine();
				System.out.println("Dame una direcion:");
				String direcion=sc.nextLine();
				System.out.println("Dame un correo:");
				String correo=sc.nextLine();
				Contacto c;
				c=new Contacto(nombre,telefono,direcion,correo);
				a.addContacto(c);
				break;
			case 3:
				System.out.println("Nombre");
				String nom=sc.nextLine();
				a.eliminarContacto(nom);
				break;
			case 4:
				a.guardarAgenda("agenda.bin");
				break;
			}
		}while(opcion!=4);
		
	}
}
