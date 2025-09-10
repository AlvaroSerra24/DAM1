package POO;

public class App {
	
	public static void main(String[] args) {
		//Craer un alumno
		Alumno a=new Alumno("11111111H", "Álvaro", "Serradilla", "Otero", 21, "Calle si", "675734756");
		
		System.out.println(a);
		a.setEdad(22);
		System.out.println(a);
		
		System.out.println("la edad de "+a.getNombre()+" es: "+a.getEdad());
		a.setNombre(a.getNombre().toUpperCase());
		System.out.println(a.getNombre());
		//Otro objeto
		Alumno b=new Alumno();
		System.out.println(b);
		b.setNombre("Juan");
		b.setApellido1("Carrión");
		b.setEdad(24);
		System.out.println(b);
		
		if(a.getEdad()>b.getEdad()) {
			System.out.println(a.getNombre()+" es mayor que "+b.getNombre());
		}else {
			System.out.println(b.getNombre()+" es mayor que "+a.getNombre());
		}
		
	}
	
}
