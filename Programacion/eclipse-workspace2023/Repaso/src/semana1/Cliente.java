package semana1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
	private String codigo;
	private String nombre;
	private String apellidos;
	private String correo;
	private int edad;
	private int nPuntos;
	private ArrayList<String>intereses;
	
	public Cliente(String codigo, String nombre, String apellidos, String correo, int edad, int nPuntos,
			ArrayList<String> intereses) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.correo = correo;
		this.edad = edad;
		this.nPuntos = nPuntos;
		this.intereses = intereses;
	}

	public Cliente(String codigo, String nombre, String apellidos, String correo, int edad, int nPuntos) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.correo = correo;
		this.edad = edad;
		this.nPuntos = nPuntos;
		this.intereses = new ArrayList<String>();
	}
	
	public Cliente() {
		this.codigo = "";
		this.nombre = "";
		this.apellidos = "";
		this.correo = "";
		this.edad = 0;
		this.nPuntos = 0;
		this.intereses = new ArrayList<String>();
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getnPuntos() {
		return nPuntos;
	}

	public void setnPuntos(int nPuntos) {
		this.nPuntos = nPuntos;
	}

	public ArrayList<String> getIntereses() {
		return intereses;
	}

	public void setIntereses(ArrayList<String> intereses) {
		this.intereses = intereses;
	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nombre=" + nombre + ", apellidos=" + apellidos + ", correo=" + correo
				+ ", edad=" + edad + ", nPuntos=" + nPuntos + ", intereses=" + intereses + "]";
	}
	public void CargarIntereses(String filename) {
		try {
			Scanner entrada=new Scanner(new File(filename));
			String linea[];
			String cadena;
			while(entrada.hasNext()) {
				cadena=entrada.nextLine();
				linea=cadena.split(";");
				if(linea[0].equals(this.codigo)) {
					for(int i=1; i<linea.length;i++)
						this.getIntereses().add(linea[i]);
				}	
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Cliente c= new Cliente("1","Alfonso","Perez","alfonhso",22,50);
		c.CargarIntereses("intereses.csv");
		System.out.println("El cliente "+c.getNombre()+" tiene los intereses: ");
		for(String s: c.getIntereses()) {
			System.out.println(s);
		}
	}
}
