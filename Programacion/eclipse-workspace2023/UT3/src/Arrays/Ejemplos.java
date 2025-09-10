package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejemplos {

	public static void main(String[] args) {
		//Notas de un alumno
		Scanner s=new Scanner(System.in);
		double notas[]=new double[7]; //también se puede escribir double []notas;
		
		//para dar valores fijos al array sería
		double notasFijas[] = {10,4,6,7,8,8,9};
		String modulos[]= {"BD","Programacion","EnDes","LM","SiSi","FOL","ING"};
		System.out.println("La longitud del array es: "+notas.length);
		
		
		//Rellenar el array notas
		for (int i=0;i<notas.length;i++) {
			System.out.println("Dame la nota "+(i+1)+": "); //La nota 1 se almacenará en 0, la 2 en 1, la 3 en 2...
			notas[i]=s.nextDouble();
		}
		System.out.println(notas); //Esto imprime la dirección de memoria, no el array
		System.out.println(Arrays.toString(notas));
		
		
		//Recorrer el array notasFijas
		for (int i=0;i<notasFijas.length;i++) {
			System.out.println(modulos[i]+": "+notasFijas[i]);
		}
		
		
		//Modificar un elemento del array notasFijas
		notasFijas[5]=8.5; //modifica el valor en la posición 5
		for (int i=0;i<notas.length;i++) {
			System.out.println("Posicion "+(i+1)+": "+notasFijas[i]); //Lo recorremos para comprobar el cambio
		}
		
		
		//Buscar un elemento del array
		for (int i=0;i<notasFijas.length;i++) {
			if (notasFijas[i]==10) {
				System.out.println("Tiene un 10 en "+modulos[i]);
			}
		}
		
		//Cálculo en el array notasFijas
		double suma=0;
		for (int i=0;i<notasFijas.length;i++) {
			suma=suma+notasFijas[i];
		}
		System.out.println("La media es: "+suma/notasFijas.length);
		
		//Borrar un elemento (borrado lógico, no real)
		notasFijas[5]=0;
		System.out.println(Arrays.toString(notasFijas));
		//Para borrado real tendrías que hacer otro array con una posición menos y mover el elemento que se desea borrar a la última posición del original
		
		//Copiar un array en otro
		double notasCopia[]=new double[7];
		notasCopia=notasFijas;
		System.out.println(Arrays.toString(notasCopia));
		
		//Mostrar un array al revés
		for (int i=notasFijas.length-1; i>=0;i--) {
			System.out.print(notasFijas[i]+", ");
		}
		
		//Generar elemento aleatorio
		notasFijas[2]=(int) (1+Math.random()*10);
		s.close();
	}
}