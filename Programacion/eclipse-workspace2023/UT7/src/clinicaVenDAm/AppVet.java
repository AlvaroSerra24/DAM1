package clinicaVenDAm;

import java.util.ArrayList;
import java.util.Scanner;

public class AppVet {
	private ArrayList<Cliente>clientes;
	
	public AppVet() {
		this.clientes=new ArrayList<Cliente>();
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public static void main(String[] args) {
		AppVet app=new AppVet();//REservo memoria para el AL
		Scanner sc=new Scanner(System.in);
		int opcion=0;
		/////////////////////////////////////////////////////////////////
		Vacuna  v=new Vacuna("Leishmania","1 enero", "Phizer", 80);
		Perro p=new Perro(2, 1, "Border Collie", "hembra", "Lori", "12232", false);
		Cliente m=new  Cliente("Luis", "1234", "luis@ribera.es", "asgfsdg");
		
		p.getLibroVacunacion().add(v);
		m.getMascotas().add(p);
		app.getClientes().add(m);
		
		
		
		/////////////////////////////////////////////////////////////////
		do {
			app.menu();
			opcion=sc.nextInt();
			
			switch(opcion) {
			case 1: //altaCliente
				app.alta();
				System.out.println(app.clientes);
				break;
			case 2:
				System.out.println("DNI");
				String dni=sc.next();
				app.atenderCliente(dni);
				break;
			case 3:
				//Dado un cliente, dar de alta una mascota
				//Preguntar si es gato, perro o conejo y pedir
				//los valores.
				//Insertar en el AL
				app.daraltaA();
				break;
			case 4:
				//Para cada cliente, contar cúantos animales tiene de
				//cada tipo.
				break;
			case 5:
				//Mostrar los nombres de todos los perros de la clínica y
				//si tienen el seguro obligatorio o no
				//((Perro)a).isSeguro
				break;
			case 6:
				//Mostrar todos los gatos obesos de la clinica
				break;
			case 7:
				//Buscar y mostrar los animales de una determinada
				//raza dada por el usuario
				break;
			case 8:
				System.out.println("Adios!!");
				break;
			}
		}while(opcion!=8);
	}

	private void alta() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame un nombre: ");
		String nombre=sc.next();
		System.out.println("Dame un DNI: ");
		String dni2=sc.next();
		System.out.println("Dame un email: ");
		String email=sc.next();
		System.out.println("Dame un direccion: ");
		String direccion=sc.next();
		Cliente c=new Cliente(nombre,dni2,email,direccion);
		this.getClientes().add(c);
		
	}

	private void daraltaA() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame el nombre del cliente: ");
		String c=sc.next();
		
		
		System.out.println("Dame su edad: ");
		int edad=sc.nextInt();
		System.out.println("Dame su peso: ");
		double peso=sc.nextDouble();
		System.out.println("Dame su raza: ");
		String raza=sc.next();
		System.out.println("Dame su sexo: ");
		String sexo=sc.next();
		System.out.println("Dame su nombre");
		String nombre=sc.next();
		
		System.out.println("Que animal es: ");
		String opcion=sc.next();
		switch(opcion) {
		case "Perro":
			System.out.println("Dame su chip");
			String chipID=sc.next();
			System.out.println("Dame su seguro");
			boolean seguro=sc.hasNext();
			Perro p=new Perro(edad,peso,raza,sexo,nombre,chipID,seguro);
			for(Cliente a:this.getClientes()) {
				 if(c.equalsIgnoreCase(a.getNombre())) {
					 a.getMascotas().add(p);
				 }
			}
			break;
		case "Gato":
			System.out.println("Dime si es obeso");
			boolean obeso=sc.hasNext();
			Gato g=new Gato(edad,peso,raza,sexo,nombre,obeso);
			for(Cliente a:this.getClientes()) {
				 if(c.equalsIgnoreCase(a.getNombre())) {
					 a.getMascotas().add(g);
				 }
			}
			break;
		case "Conejo":
			System.out.println("Dame la longitud de sus orejas");
			double longorejas=sc.nextDouble();
			Conejo co=new Conejo(edad,peso,raza,sexo,nombre,longorejas);
			for(Cliente a:this.getClientes()) {
				 if(c.equalsIgnoreCase(a.getNombre())) {
					 a.getMascotas().add(co);
				 }
			}
		}
		
		System.out.println();
	}

	private void atenderCliente(String dni) {
		//1. Buscar Cliente
		for(Cliente c: this.getClientes()) {
			if(c.getDni().equals(dni)) {
				System.out.println(c.getNombre());
				
				for(Animal a: c.getMascotas()) {
					System.out.println(a.getNombre()+" "+a.getRaza());
					double suma=0;
					for(Vacuna vac: a.getLibroVacunacion()) {
						suma=suma+vac.getPrecio();
					}
				}
			}
		}
	}

	private void menu() {
		System.out.println("1. Alta Cliente");
		System.out.println("2. Atender Cliente");
		System.out.println("3. Alta Mascota");
		System.out.println("4. Cuantos Animales");
		System.out.println("5. Nombre perros y seguro");
		System.out.println("6. Gatos Obesos");
		System.out.println("7. Raza");
		System.out.println("8. Salir");
		System.out.println("Elige una opción: ");
	}
}
