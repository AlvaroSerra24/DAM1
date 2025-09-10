package Ejercicio3;

public class App {
	public static void main(String[] args) {
		Figura f[]=new Figura[4];
		f[0]=new cuadrado("verde",2);
		f[1]=new cuadrado("Verde",2);
		f[2]=new circulo("Azul",5);
		f[3]=new circulo("Amarillo",3);
		
		for(int i=0;i<f.length-1;i++) {
			if(f[i].equals(f[i+1]))
					System.out.println(f[i]+" = "+f[i+1]);
			else
				System.out.println(f[i]+" != "+f[i+1]);
		}
	}
}
