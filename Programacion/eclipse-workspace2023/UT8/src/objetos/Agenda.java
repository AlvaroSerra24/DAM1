package objetos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Agenda {
	private ArrayList<Contacto>agenda;
	
	public Agenda() {
		this.agenda=new ArrayList<Contacto>();
	}

	public ArrayList<Contacto> getAgenda() {
		return agenda;
	}

	public void setAgenda(ArrayList<Contacto> agenda) {
		this.agenda = agenda;
	}
	//Leer los contactos del fichero
	public void cargarAgenda(String filename) {
		try {
			FileInputStream fi=new FileInputStream(filename);
			ObjectInputStream entrada=new ObjectInputStream(fi);
			
			Contacto c=null;
			while(entrada!=null) {
				try {
					c=(Contacto)entrada.readObject();
					this.getAgenda().add(c);
				}catch (Exception e) {
					entrada=null;
				}
			}	
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void imprimirAgenda() {
		for(Contacto c: this.getAgenda())
			System.out.println(c.getNombre()+" "+c.getTelefono());
	}
	
	public void eliminarContacto(String name) {
		for(int i=0; i<this.getAgenda().size(); i++) {
			if(this.getAgenda().get(i).getNombre().equalsIgnoreCase(name))
				this.getAgenda().remove(i);
		}
	}
	
	public void addContacto(Contacto c) {
		this.getAgenda().add(c);
	}
	
	//Guardar los contactos del AL en el fichero
	public void guardarAgenda(String filename) {
		//escribir->Out
		try {
			FileOutputStream fo=new FileOutputStream(filename);
			ObjectOutputStream salida=new ObjectOutputStream(fo);
			for(Contacto c: this.getAgenda()) {
				salida.writeObject(c);//escribimos los objetos en el fichero 
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Agenda a=new Agenda();
		a.getAgenda().add(new Contacto("Maria",2131234124,"Av.Madrid","hola@gmail.com"));
		a.getAgenda().add(new Contacto("Luis",23234124,"C/Mayor","Luis@gmail.com"));
		a.getAgenda().add(new Contacto("Paola",244444124,"Mi casa","Paola@gmail.com"));
		a.guardarAgenda("agenda.bin");
		a.cargarAgenda("agenda.bin");
		a.imprimirAgenda();
		a.eliminarContacto("Luis");
		a.imprimirAgenda();
		a.guardarAgenda("agenda.bin");
	}
}
