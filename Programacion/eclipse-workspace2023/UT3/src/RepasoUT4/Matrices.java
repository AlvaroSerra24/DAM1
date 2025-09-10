package RepasoUT4;

import java.util.Arrays;
import java.util.Scanner;

public class Matrices {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int nFilas=0, nColumnas=0;//==matriz.lenght matriz[0].lenght
		do {
			System.out.println("Dame el numero de filas:");
			nFilas=sc.nextInt();
		}while(nFilas<2 || nFilas>10);
		do {
			System.out.println("Dame el numero de columnas:");
			nColumnas=sc.nextInt();
		}while(nColumnas<2 || nColumnas>10);
		int matriz[][]=new int [nFilas][nColumnas];
		
		generarMatriz(matriz);
		imprimeMatriz(matriz);
		buscarMatriz(matriz);
		System.out.println(filaSumaMayor(matriz));
	}

	private static int filaSumaMayor(int[][] matriz) {
		int suma=0;
		int array[]=new int[matriz.length];
		int copia[]=new int[matriz.length];
		for(int i=0; i<matriz.length;i++) {
			for(int j=0;j<matriz[0].length;j++) {
				suma=suma+matriz[i][j];
			}
			array[i]=suma;
			copia[i]=suma;
			suma=0;
		}
		
		System.out.println(Arrays.toString(array));
		return suma;
	}

	private static void buscarMatriz(int[][] matriz) {
		Scanner sc=new Scanner(System.in);
		int n=0, cont=0;
		do {
			System.out.println("Dame un numero que buscar:");
			n=sc.nextInt();
		}while((n<0) || (n>20));
		for(int i=0; i<matriz.length;i++) {
			for(int j=0;j<matriz[0].length;j++) {
				if(matriz[i][j]==n) {
					System.out.println("El numero "+n+" ha sido encontrado en la fila "+(i+1)+" y columna "+(j+1));
					cont++;
				}
			}
		}
		System.out.println("Has sido encontrado "+cont+" veces");
	}

	private static void imprimeMatriz(int[][] matriz) {
		for(int i=0; i<matriz.length;i++) {
			System.out.println();
			for(int j=0;j<matriz[0].length;j++) {
				System.out.print(matriz[i][j]+"\t");
			}
		}
		System.out.println();
	}

	private static void generarMatriz(int[][] matriz) {
		for(int i=0; i<matriz.length;i++) {
			for(int j=0;j<matriz[0].length;j++) {
				matriz[i][j]=(int)(Math.random()*21);	
			}
		}
	}
	
}
