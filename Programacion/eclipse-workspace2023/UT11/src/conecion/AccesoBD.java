package conecion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccesoBD {
	public static void main(String[] args) {
		
		try {
			Connection conn=DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe","jardineria","jardineria");
			Statement stmt=conn.createStatement();
			ResultSet rset=stmt.executeQuery("select codigocliente, nombrecliente from clientes");
			
			
			while(rset.next()) {
				System.out.println(rset.getString(1)+" "+rset.getString(2));
			}
			System.out.println("\nCiudad y telefono de oficinas de EEUU");
			rset=stmt.executeQuery("select ciudad, telefono from oficinas where pais='EEUU'");
			
			while(rset.next()) {
				System.out.println(rset.getString(1)+" "+rset.getString(2));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
