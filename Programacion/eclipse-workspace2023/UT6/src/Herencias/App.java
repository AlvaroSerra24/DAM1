package Herencias;

public class App {
	public static void main(String[] args) {
		Trabajador t1=new Trabajador("Luisa", "Lopez", "0233230Q", "dafafa");
		Empleado e=new Empleado("Patrisio", "Esponja", "fasf", "a", 30000);
		Consultor c=new Consultor("Rodrigo", "Muñoz", "gjdgjsñgf", "asjfp", 100, 1400);
		Trabajador t[]=new Trabajador[3];
		t[0]=t1;
		t[1]=e;
		t[2]=c;
		
		for(int i=0; i<t.length;i++) {
			if(t[i] instanceof Trabajador) {
				System.out.print("Trabajador: ");
			}
			if(t[i] instanceof Empleado) {
				System.out.println("Empleado: ");
			}
			if(t[i] instanceof Consultor) {
				System.out.println("Consultor: ");
			}
			System.out.println(t[i].getNombre()+" "+t[i].getApellidos()+" "+t[i].calcularPaga());
		}
	}
}
