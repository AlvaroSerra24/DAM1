package Frutas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;


public class BDF {
	private static BDF miInstancia=null;
	private static boolean permitirInstanciaNueva;
	private Connection conn;
	private Statement stmt;
	private String cadenaConexion;//driver@servidor:puerto:sid
	private String usuario;
	private String pass;
	
	
	
	public BDF() throws Exception {
		if(!permitirInstanciaNueva) {
			throw new Exception("No se puede crear otro objeto. Usa getInstance()");
		}
	}
	public static BDF getInstance() {
		if(miInstancia==null) {
			permitirInstanciaNueva=true;
			try {
				miInstancia=new BDF();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			permitirInstanciaNueva=false;
		}
		
		return miInstancia;
	}
	
	public Connection getConn() {
		return conn;
	}
	public void setConn(Connection conn) {
		this.conn = conn;
	}
	public Statement getStmt() {
		return stmt;
	}
	public void setStmt(Statement stmt) {
		this.stmt = stmt;
	}
	public String getCadenaConexion() {
		return cadenaConexion;
	}
	public void setCadenaConexion(String cadenaConexion) {
		this.cadenaConexion = cadenaConexion;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public ResultSet consultaBD(String consulta) {
		ResultSet rset=null;
		try {
			this.conn=DriverManager.getConnection(this.cadenaConexion,this.usuario,this.pass);
			this.stmt=conn.createStatement();
			rset=stmt.executeQuery(consulta);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rset;
	}
	
	public void cerrarConsulta() {
		try {
			this.stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void cargarParametrosConexionXML(String fichero) {
		Scanner entrada;
		try {
			entrada = new Scanner(new File(fichero));
			String cadena;
			
			while(entrada.hasNext()) {
				cadena=entrada.nextLine();
				this.cadenaConexion=cadena.split("-")[0];
				this.usuario=cadena.split("-")[1];
				this.pass=cadena.split("-")[2];
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<Empleado> cargaEmpleados(){
		BDF.getInstance().cargarParametrosConexionXML("configTienda.txt");
		ArrayList<Empleado> Emp=new ArrayList<Empleado>();
		Empleado em=new Empleado();
		ResultSet rset=BDF.getInstance().consultaBD("select * from persona");
		try {
			while(rset.next()) {
					if(!rset.getString(5).equals("0")){
						Emp.add(new Empleado(rset.getString(1),rset.getString(2),rset.getString(3),rset.getString(4),rset.getString(5),em.getPedidosAsignados())); 
					}
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BDF.getInstance().cerrarConsulta();
		return Emp;
	}
}
