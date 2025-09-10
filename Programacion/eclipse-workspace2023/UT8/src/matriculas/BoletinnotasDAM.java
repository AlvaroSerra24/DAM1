package matriculas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class BoletinnotasDAM {
	
	private ArrayList<Alumno>dam;

	public BoletinnotasDAM() {
		dam=new ArrayList<>();
	}
	
	public void cargaInicial(String filename) {
		try {
			Scanner entrada = new Scanner(new File(filename));
			String cadena = "";
			String[] linea;
			while(entrada.hasNext()) {
				cadena = entrada.nextLine();
				linea = cadena.split(";");
				this.getDam().add(new Alumno(Integer.parseInt(linea[0]),linea[1],linea[2],linea[3]));
			}
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public ArrayList<Alumno> getDam() {
		return dam;
	}

	public void setDam(ArrayList<Alumno> dam) {
		this.dam = dam;
	}

	public void generarBoletines(){
		//Crear el directorio
//		File f=new File("boletines");
//		f.mkdir();
		
		for(Alumno n: this.getDam()) {
			PrintWriter salida;
			double suma=0;
			try {
				salida = new PrintWriter(new File("boletines/Boletin"+n.getNombre()+n.getApellidos()+".txt"));
				salida.println("***********************************IES RIBERA DEL TAJO*********************************");
				salida.println(n.getNombre()+" "+n.getApellidos());
				for(Nota m: n.getNotas()) {
					salida.println("\t"+m);
					suma+=m.getNota();
				}
				salida.println("La nota media es: "+(suma/n.getNotas().size()));
				salida.flush();
				salida.close();
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		Alumno f=new Alumno();
		BoletinnotasDAM a=new BoletinnotasDAM();
		a.cargaInicial("Alumnos.csv");
		int opcion=0;
		do {
		menu();
		opcion=sc.nextInt();
		switch(opcion) {
		case 1:
			for(Alumno n: a.getDam()) {
				n.cargarNotas("matricula.csv");
			}
			break;
		case 2:
			a.generarBoletines();
			break;
		case 3:
			System.out.println("Adios!!!");
			break;
		}
		}while(opcion!=3);
		
	}

	private static void menu() {
		// TODO Auto-generated method stub
		System.out.println("1. Leer notas");
		System.out.println("2. Imprimir boletines");
		System.out.println("3. Salir");
		System.out.println("Elige una opcion: ");
	}

}
