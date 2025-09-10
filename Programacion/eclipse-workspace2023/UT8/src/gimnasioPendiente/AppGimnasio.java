package gimnasioPendiente;

import java.util.Scanner;

public class AppGimnasio {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Usuario: " );
		String usuario=sc.next();
		System.out.println("Contraseña: ");
		String codigo=sc.next();
		
		if(usuario.equals("monitor")) {
			Monitor m=new Monitor(codigo, "Luca","Pérez","");
			m.cargarActividades("reservaPendientes.csv");
			System.out.println("Monitor "+m.getNombre()+" "+m.getApellidos());
			m.imprimirPlazasActividades();
		}else {
			System.out.println("Error!");
		}
	}
	
	
}
