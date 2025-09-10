package Frutas;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Factura implements impuestos, Serializable{
	private String codigoFactura;
	private int codigoPedido;
	private String sniCliente;
	private ArrayList<ProductoPedido> productosPedidos;
	private double total;

	public Factura(String codigoFactura, int codigoPedido, String sniCliente, ArrayList<ProductoPedido> productosPedidos,
			double total) {
		super();
		this.codigoFactura = codigoFactura;
		this.codigoPedido = codigoPedido;
		this.sniCliente = sniCliente;
		this.productosPedidos = productosPedidos;
		this.total = total;
	}
	
	public Factura(String codigoFactura, int codigoPedido, String sniCliente,
			double total) {
		super();
		this.codigoFactura = codigoFactura;
		this.codigoPedido = codigoPedido;
		this.sniCliente = sniCliente;
		this.productosPedidos = new ArrayList<>();
		this.total = total;
	}

	public Factura() {
		super();
		this.codigoFactura = "";
		this.codigoPedido = 0;
		this.sniCliente = "";
		this.productosPedidos = new ArrayList<>();
		this.total = 0;
	}
	
	public String getCodigoFactura() {
		return codigoFactura;
	}


	public void setCodigoFactura(String codigoFactura) {
		this.codigoFactura = codigoFactura;
	}


	public int getCodigoPedido() {
		return codigoPedido;
	}


	public void setCodigoPedido(int codigoPedido) {
		this.codigoPedido = codigoPedido;
	}


	public String getSniCliente() {
		return sniCliente;
	}


	public void setSniCliente(String sniCliente) {
		this.sniCliente = sniCliente;
	}


	public ArrayList<ProductoPedido> getProductosPedidos() {
		return productosPedidos;
	}


	public void setProductosPedidos(ArrayList<ProductoPedido> productosPedidos) {
		this.productosPedidos = productosPedidos;
	}


	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	}

	

	@Override
	public String toString() {
		return "Factura [codigoFactura=" + codigoFactura + ", codigoPedido=" + codigoPedido + ", sniCliente="
				+ sniCliente + ", productosPedidos=" + productosPedidos + ", total=" + total + "]";
	}

	public ArrayList<ProductoPedido> cargarProductos(){
		File f= new File("ProductosPedidos.csv");
		String cadena = "";
		String[] linea;
		int cont=0;
		try {
			Scanner entrada= new Scanner(f);
			cadena=entrada.nextLine();
			while(entrada.hasNext()) {
				cadena = entrada.nextLine();
				linea = cadena.split(";");
				this.getProductosPedidos().add(new ProductoPedido(linea[0],linea[1],linea[2],linea[3],linea[4],Double.parseDouble(linea[5]),Double.parseDouble(linea[6])));
			}
			entrada.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return this.productosPedidos;
	}
	
	@Override
	public double ivaReducido() {
		double conIVA= 0;
		conIVA=this.totalSinIVA()*0.04;		
		return conIVA;
	}

	@Override
	public double totalSinIVA() {
		double total=0;
			for(ProductoPedido p : this.getProductosPedidos()) {
				total=total+(p.getPrecioKg()*p.getKg());
			}
			this.total=total;
		return total;
	}
}
