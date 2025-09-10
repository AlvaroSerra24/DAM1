package singleton;

import java.sql.ResultSet;

public class AppSingleton {
	public static void main(String[] args) {
		try {
			BD.getInstance().cargarParametrosConexionXML("config.xml");
//			BD.getInstance().setCadenaConexion("jdbc:oracle:thin:@localhost:1521:xe");
//			BD.getInstance().setUsuario("jardineria");
//			BD.getInstance().setPass("jardineria");
			ResultSet rset=BD.getInstance().consultaBD("select count(*) from clientes");
			if(rset.next())
				System.out.println("Hay "+rset.getString(1)+" clientes");
			BD.getInstance().cerrarConsulta();
			rset=BD.getInstance().consultaBD("select max(codigocliente) from clientes");
			if(rset.next())
				System.out.println("Codigo mayor "+rset.getString(1));
			BD.getInstance().cerrarConsulta();
			//BD miBD2=BD.getInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
