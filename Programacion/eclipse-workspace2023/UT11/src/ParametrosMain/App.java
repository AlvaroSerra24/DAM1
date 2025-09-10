package ParametrosMain;

public class App {
	public static void main(String[] args) {
		
		
		if(args.length==0) {
			System.out.println("No hay parámetros");
		}else {
			if(args[0].contains("empleado")) {
				System.out.println("Es un empleado");
				String dni=args[0].split("=")[1];
				System.out.println(dni);
			}
				
			if(args[1].contains("gerente"))
				System.out.println("Es el gerente");
		}
		
		
	}
}
