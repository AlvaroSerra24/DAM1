package Matrices;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int nFilas=0;
		int nColumnas=0;
		
		
		do {
			System.out.println("Cuantas filas tiene");
			nFilas=sc.nextInt();
		}while(nFilas<2 || nFilas>10);
		
		do {
			System.out.println("Cuantas columnas tiene");
			nColumnas=sc.nextInt();
		}while(nColumnas<2 || nColumnas>10);
		
		int matriz[][]=new int[nFilas][nColumnas];//reservo espacio en mem.para la matriz
		
		for(int i=0; i<nFilas;i++) {
			for(int j=0;j<nColumnas;j++) {
				matriz[i][j]=(int)(1+Math.random()*50);
			}
		}
		for(int i=0; i<nFilas; i++) {
			System.out.println();
			for(int j=0; j<nColumnas; j++) {
				System.out.print(matriz[i][j]+"\t");
			}
		}
		sc.close();
	}
}
