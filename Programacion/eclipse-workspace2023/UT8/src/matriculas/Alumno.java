package matriculas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import gimnasioPendiente.actividadReservada;

public class Alumno extends Persona{
	private ArrayList<Nota>notas;

	public Alumno(int codigo, String dNI, String nombre, String apellidos, ArrayList<Nota> notas) {
		super(codigo, dNI, nombre, apellidos);
		this.notas = notas;
	}
	
	public Alumno(int codigo, String dNI, String nombre, String apellidos) {
		super(codigo, dNI, nombre, apellidos);
		this.notas = new ArrayList<Nota>();
	}
	
	public Alumno() {
		super();
		this.notas = new ArrayList<Nota>();
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}
	
	public void cargarNotas(String filename) {
		//Cargar en el AL las notas del alumno this
		
		try {
			Scanner entrada = new Scanner(new File(filename));
			String cadena = "";
			String[] linea;
			while(entrada.hasNext()) {
				cadena = entrada.nextLine();
				linea = cadena.split(";");
				if(Integer.parseInt(linea[2]) == this.getCodigo()) {
					this.getNotas().add(new  Nota(Integer.parseInt(linea[0]),linea[1],Integer.parseInt(linea[2]),Integer.parseInt(linea[3])));
				}
			}
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		double suma=0;
		int cont10=0;
		Alumno a=new Alumno (502,"aasffaf","Mario","Lopez");
		a.cargarNotas("matricula.csv");
		System.out.println(a.getNombre()+" "+a.getApellidos()+" tiene las siguentes notas: ");
		for(Nota n: a.getNotas()) {
			System.out.println("\t"+n);
			if(n.getNota()==10)
				cont10++;
			suma+=n.getNota();
		}
		System.out.println("Número de matrículas: "+cont10);
		System.out.println("La nota media es: "+(suma/a.getNotas().size()));
	}
}
