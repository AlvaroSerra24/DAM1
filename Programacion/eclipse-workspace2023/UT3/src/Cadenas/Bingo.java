package Cadenas;

import java.util.Arrays;
import java.util.Scanner;

public class Bingo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int boleto1[]= new int [5];
		int boleto2[]= new int [5];
		System.out.println("Dame el nombre del jugador 1:");
		String nombre1=sc.next();
		System.out.println("Dame el nombre del jugador 2:");
		String nombre2=sc.next();
	
		getBoleto(boleto1);
		getBoleto(boleto2);
		imprimeJugador(nombre1, boleto1);
		imprimeJugador(nombre2, boleto2);
		
		do {
			int bola=0;
			bola=(int)(1+Math.random()*20);
			System.out.println(bola);
			
			for(int i=0; i<boleto1.length; i++) {
				if(boleto1[i]==bola) {
					System.out.println("El numero "+bola+" esta en el boleto 1");
					boleto1[i]=0;
				}
			}
			
			for(int j=0; j<boleto2.length; j++) {
				if(boleto2[j]==bola) {
					System.out.println("El numero "+bola+" esta en el boleto 2");
					boleto2[j]=0;
				}
			}
			try{
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}while(!gana(boleto1) && !gana(boleto2));
		
		if(gana(boleto1)!=gana(boleto2)) {
			if(gana(boleto1))
				System.out.println("El jugador 1 gana");
			else
				System.out.println("El jugador 2 gana");
		}else
			System.out.println("El jugador 1 empata con el jugador 2");
		sc.close();
	}

	private static void imprimeJugador(String nombre, int[] boleto) {
		System.out.println("El jugador "+nombre+" con alias "+getAlias(nombre)+" tiene el boleto "+Arrays.toString(boleto));
	}

	private static String getAlias(String nombre) {
		String jugador="J"+nombre.substring(0, 3)+((int)(1+Math.random()*100));
		return jugador;
	}

	private static boolean gana(int[] boleto) {
		for (int i=0; i<boleto.length; i++) {
			if(boleto[i]!=0)
				return false;
		}
		return true;
	}

	private static void getBoleto(int[] boleto) {
		for (int i=0; i<boleto.length;i++) {
			boleto[i]=(int)(1+Math.random()*20);
		}
	}
}
