package semana1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class App extends Cliente{
	private ArrayList<Cliente> clientes;
	
	public App(String codigo, String nombre, String apellidos, String correo, int edad, int nPuntos,
			ArrayList<String> intereses, ArrayList<Cliente> clientes) {
		super(codigo, nombre, apellidos, correo, edad, nPuntos, intereses);
		this.clientes = clientes;
	}

	public App(String codigo, String nombre, String apellidos, String correo, int edad, int nPuntos,
			ArrayList<String> intereses) {
		super(codigo, nombre, apellidos, correo, edad, nPuntos, intereses);
		this.clientes = new ArrayList<Cliente>();
	}

	public App() {
		super();
		this.clientes = new ArrayList<Cliente>();
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	@Override
	public String toString() {
		return "App [clientes=" + clientes + "]";
	}
	
	public void cargarListaClientes(String filename) {
		try {
			Scanner entrada = new Scanner(new File(filename));
			String cadena = "";
			String[] linea;
			while(entrada.hasNext()) {
				cadena = entrada.nextLine();
				linea = cadena.split(";");
				if(linea[1].equalsIgnoreCase(this.getCodigo()) && linea[0].equals("cliente")) {
					this.getClientes().add(new  Cliente(linea[1],linea[3],linea[4],linea[5],Integer.parseInt(linea[6]),Integer.parseInt(linea[9])));
				}
			}
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		App a= new App();
		a.cargarListaClientes("Personas.csv");
		for(Cliente p: a.getClientes()) {
			System.out.println(p.getNombre());
			p.CargarIntereses("intereses.csv");
			for(String s: p.getIntereses()) {
				System.out.println(s);
			}
		}
	}
}
