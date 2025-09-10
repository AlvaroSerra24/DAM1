package Banco;

import java.util.ArrayList;

public class Cliente {
	private String codigoCliente;
	private String dni;
	private String nombre;
	private String apellidos;
	private ArrayList<Cuenta> cuentas;
	
	
	
	public Cliente(String codigoCliente, String dni, String nombre, String apellidos, ArrayList<Cuenta> cuentas) {
		this.codigoCliente = codigoCliente;
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.cuentas = cuentas;
	}

	public Cliente(String codigoCliente, String dni, String nombre, String apellidos) {
		this.codigoCliente = codigoCliente;
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.cuentas = cuentas;
	}
	
	public Cliente() {
		this.codigoCliente = "";
		this.dni = "";
		this.nombre = "";
		this.apellidos = "";

	}

	public String getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
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

	public ArrayList<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(ArrayList<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}
	
	@Override
	public String toString() {
		return this.nombre+" "+apellidos+"\n\tcodigoCliente:"+this.codigoCliente+"\n\tdni:"+this.dni;
	}
	
	public void mostrarCuentas() {
		for(Cuenta c: this.getCuentas()) {
			System.out.println(c.getCuenta()+c.getSaldo());
			System.out.println();
		}
	}
	
	
	
	public static void main(String[] args) {
		Cliente cli=new Cliente("B123","123H","Francisco","Álvarez");
		System.out.println(cli);
	}
	
}
