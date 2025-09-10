package Cadenas;

import java.util.Arrays;
import java.util.Scanner;

public class examen2021 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int boleto1[]= new int [5];
		int boleto2[]= new int [5];
		int cont1=0, cont2=0, intentos=5, dado=0;
		String nombre1="";
		String nombre2="";
		do {
		System.out.println("Dame el nombre del jugador 1:");
		nombre1=sc.next();
		}while(!esnombre(nombre1));
		do {
		System.out.println("Dame el nombre del jugador 2:");
		nombre2=sc.next();
		}while(!esnombre(nombre2));
		getBoleto(boleto1);
		getBoleto(boleto2);
		imprimeJugador(nombre1, boleto1);
		imprimeJugador(nombre2, boleto2);
		System.out.println("******************Comienza el juego********************");
		do {
			for(int i=0;i<boleto1.length;i++) {
				dado=(int)(1+Math.random()*6);
				System.out.println("Dado: "+dado);
				if(dado==boleto1[i]) {
					System.out.println(nombre1+" coincide con el resultado del lanzamiento "+i);
					cont1++;
				}
				if(dado==boleto2[i]) {
					System.out.println(nombre2+" coincide con el resultado del lanzamiento "+i);
					cont2++;
				}
				intentos--;
			}
		}while(intentos!=0);
		if(cont1==cont2) {
			System.out.println("Empate!!");
		}else {
			if(cont1>cont2) {
				System.out.println("Gana "+nombre1+" con aciertos= "+cont1);
			}else {
				System.out.println("Gana "+nombre2+" con aciertos= "+cont2);
			}
		}
	}

	private static boolean esnombre(String s) {
		return s.matches("[J]{0}[A-Z]{1-4}[0-9]{4}");
	}

	private static void imprimeJugador(String nombre, int[] boleto) {
		System.out.println("El jugador "+nombre+" tiene el boleto "+Arrays.toString(boleto));
		
	}

	private static void getBoleto(int[] boleto) {
		for (int i=0; i<boleto.length;i++) {
			boleto[i]=(int)(1+Math.random()*6);
		}
	}
}
