package Cadenas;

import java.util.Arrays;
import java.util.Scanner;

public class Piedra_Papel_Tijera {
	public static void main(String[] args) {
		String palabras[]={"Piedra", "Papel", "Tijera"};
		int intentos=5;
		String partida1[]=new String [5];
		String partida2[]=new String [5];
		do {
			for(int i=0;i<partida1.length;i++) {
				juego(palabras, i, partida1, partida2);
				intentos--;
			}
		}while(intentos!=0);
		System.out.println(Arrays.toString(partida1));
		System.out.println(Arrays.toString(partida2));
	}
	private static void juego(String[] palabras, int i, String partida1[], String partida2[]) {
		Scanner sc=new Scanner(System.in);
		String pc=palabras[(int)(Math.random()*3)];
		System.out.println(pc);
		menu();
		int elegir=sc.nextInt();
		elegir--;
		String jug=palabras[elegir];
		if(jug.equals(pc)) {
			System.out.println("Empate");
			partida1[i]="E";
			partida2[i]="E";
		}else {
			switch(jug) {
			case "Piedra":
				if(pc.equals("Papel")) {
					System.out.println("El PC gana");
					partida1[i]="P";
					partida2[i]="G";
					}
				else {
					System.out.println("El Jugador gana");
					partida1[i]="G";
					partida2[i]="P";
				}
				break;
			case "Papel":
				if(pc.equals("Piedra")) {
					System.out.println("El Jugador gana");
					partida1[i]="G";
					partida2[i]="P";
				}
				else{
					System.out.println("El PC gana");
					partida1[i]="P";
					partida2[i]="G";
				}
				break;
			case "Tijera":
				if(pc.equals("Papel")) {
					System.out.println("El Jugador gana");
					partida1[i]="G";
					partida2[i]="P";
				}
				else{
					System.out.println("El PC gana");
					partida1[i]="P";
					partida2[i]="G";
				}
				break;
			}
		}
	}
	private static void menu() {
		System.out.println("1. Piedra");
		System.out.println("2. Papel");
		System.out.println("3. Tijera");
	}
}
