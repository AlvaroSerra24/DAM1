package Frutas;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		Factura f=new Factura("1efsd",1000, "", 0);
		Empleado n=new Empleado();
		ArrayList<Empleado> emp=new ArrayList<Empleado>();
		f.cargarProductos();
		for(ProductoPedido p: f.getProductosPedidos()) {
			System.out.println(p.toString());
		}
		System.out.println("\t\t\tTotal\t"+f.totalSinIVA()+"€\n\t\t\tIVA\t"+f.ivaReducido()+"€");
		BDF.getInstance().cargarParametrosConexionXML("configTienda.txt");
		
		emp=BDF.getInstance().cargaEmpleados();
		
		for(Empleado e: emp) {
			e.asignarPedidosTurno();
		}
		
		System.out.println(emp);
	}
}
