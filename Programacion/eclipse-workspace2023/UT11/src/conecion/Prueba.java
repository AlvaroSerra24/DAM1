package conecion;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Prueba {
	public static void main(String[] args) {
		
		
		menu();
		
		
		try {
			Connection conn=DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe","jardineria","jardineria");
			Statement stmt=conn.createStatement();
			
			try {
				ResultSet rset=stmt.executeQuery("select codigocliente, nombrecontacto, apellidocontacto, telefono from clientes");
				PrintWriter p=new PrintWriter("index.html");
				p.println("<!DOCTYPE html>\r\n"
						+ "<html lang=\"en\">\r\n"
						+ "<head>\r\n"
						+ "    <meta charset=\"UTF-8\">\r\n"
						+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
						+ "    <title>Tabla</title>\r\n"
						+ "    <link rel=\"stylesheet\" type=\"text/css\" href=\"estilos/estilos.css\"/>\r\n"
						+ "</head>\r\n"
						+ "<body>\r\n"
						+ "<h1>Clientes de jardineria</h1>\r\n"
						+ "<table>\r\n"
						+ "    <tr>\r\n"
						+ "        <th>CÓDIGO</th>\r\n"
						+ "        <th>NOMBRE</th>\r\n"
						+ "        <th>APELLIDOS</th>\r\n"
						+ "        <th>TELEFONO</th>\r\n"
						+ "    </tr>\r\n");
						
				while(rset.next()) {
					p.println("<tr><td>"+rset.getString(1)+"</td><td>"+rset.getString(2)+"</td><td>"+rset.getString(3)+"</td><td>"+rset.getString(4)+"</td></tr>");
				}
				
				p.println("</table>    \r\n"
						+ "</body>\r\n"
						+ "</html>\r\n");
				p.flush();
				p.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void menu() {
		// TODO Auto-generated method stub
		System.out.println("1. Muestre por pantalla el código y el nombre de los clientes\r\n"
				+ "2. La ciudad y el teléfono de las oficinas de EEUU\r\n"
				+ "3. El nombre, los apellidos y el email de los empleados a cargo de Alberto Soria.\r\n"
				+ "4. Nombre de clientes españoles\r\n"
				+ "5. Crea una página web que tenga en una tabla el código, nombre, apellidos y teléfono de los clientes de la empresa");
		
	}
}
