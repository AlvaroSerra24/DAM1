package Matrices;

import java.util.Arrays;

public class Ejercicio6 {
	public static void main(String[] args) {
		int nFilas=10;
		int nColumnas=10;
		int matriz[][]=new int[nFilas][nColumnas];//reservo espacio en mem.para la matriz
		
		for(int i=0; i<nFilas;i++) {
			for(int j=0;j<nColumnas;j++) {
				matriz[i][j]=(int)(1+Math.random()*100);
			}
		}
		for(int i=0; i<nFilas; i++) {
			System.out.println();
			for(int j=0; j<nColumnas; j++) {
				System.out.print(matriz[i][j]+"\t");
			}
		}
		System.out.println();
		System.out.println("Diagonal desde la esquina superior izquierda a la esquina inferior derecha :");
		diagonal(matriz);
	}

	private static void diagonal(int m[][])  {
		int minimo = m[0][0];
		int maximo = m[0][0];
		int cont=0;
		int suma=0;
		
		for (int i = 0; i<10;i++) {
			int numero = m[i][i];
			System.out.print(numero + "\t");
			if(numero>maximo)
				maximo=numero;
			if(numero<minimo)
				minimo=numero;
			suma +=numero;
			cont++;
		}
		System.out.println("\nMáximo: "+maximo);
		System.out.println("Mínimo: "+minimo);
		System.out.println("Media: "+((double) suma / cont));
	}
	
	public static void diagonalArray(int[][]matriz) {
		int[]principal=new int[10];
		
		for(int i=0; i<10;i++)
			principal[i]=matriz[i][i];
		
		Arrays.sort(principal);
		System.out.println(principal[principal.length-1]);
		System.out.println(principal[0]);
	}
}
