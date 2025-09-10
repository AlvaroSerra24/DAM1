package Frutas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Empleado extends Persona{
	private String turno;
	private ArrayList<Pedido> pedidosAsignados;
	
	public Empleado(String dni, String nombre, String apellidos, String dirección, String turno) {
		super(dni, nombre, apellidos, dirección);
		this.turno = turno;
		this.pedidosAsignados = new ArrayList<Pedido>();
	}
	
	public Empleado(String dni, String nombre, String apellidos, String dirección, String turno,
			ArrayList<Pedido> arrayList) {
		super(dni, nombre, apellidos, dirección);
		this.turno = turno;
		this.pedidosAsignados = new ArrayList<Pedido>();
	}

	public Empleado() {
		super();
		this.turno = "";
		this.pedidosAsignados = new ArrayList<Pedido>();
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public ArrayList<Pedido> getPedidosAsignados() {
		return pedidosAsignados;
	}

	public void setPedidosAsignados(ArrayList<Pedido> pedidosAsignados) {
		this.pedidosAsignados = pedidosAsignados;
	}

	@Override
	public String toString() {
		return "Empleado [turno=" + turno + ", pedidosAsignados=" + pedidosAsignados + ", dni=" + dni + ", nombre="
				+ nombre + ", apellidos=" + apellidos + ", dirección=" + dirección + "]";
	}
	
	public void asignarPedidosTurno() {
		File f= new File("Pedidos.csv");
		String cadena = "";
		String[] linea;
		try {
			Scanner entrada= new Scanner(f);
			cadena=entrada.nextLine();
			while(entrada.hasNext()) {
				cadena = entrada.nextLine();
				linea = cadena.split(";");
				if(this.turno.equals(linea[3]))
					this.getPedidosAsignados().add(new Pedido(linea[0],linea[1],linea[2],linea[3]));
			}
			entrada.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Factura generarFactura(Pedido p) {
		ArrayList<Empleado> emp=new ArrayList<Empleado>();
		emp=BDF.getInstance().cargaEmpleados();
		for(Empleado em: emp) {
			try {
				PrintWriter salida;
				salida = new PrintWriter(new File("Facturas/Factura"+this.dni+".txt"));
				salida.println();
				salida.close();
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		Empleado e=new Empleado("dfdsf","Alvaro","dfd","dfdf","1");
		e.asignarPedidosTurno();
		System.out.println(e.getPedidosAsignados());
	}
}
