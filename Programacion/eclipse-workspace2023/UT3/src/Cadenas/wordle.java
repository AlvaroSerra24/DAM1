package Cadenas;

import java.util.Scanner;

public class wordle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String palabras[]={"PLATO","PISAR","PLANO","MAREO","LISTA","LISTO", "SUCIO","PERRO","MIXTO","BULTO","CASTO","PRADO", "MOSCA","PISTO", "TURCO","BRAVO","VISTO","QUESO","GUISO","USADO"};
		String palusu="";
		String adivina="AAAAA";
		int intentos=6;
		int gana=0;
		String palabraSecreta=palabras[(int)(Math.random()*20)];
		do {
			System.out.println("");
			System.out.println("Dame un intento de 5 letras :");
			palusu=sc.next();
			if(palusu.length()!=5){
				System.out.println("La palabra tiene menos de 5 letras");
			}else {
				if(palabraSecreta.equals(palusu)) {
					gana++;
				}else {
					for(int i=0; i<palabraSecreta.length();i++) {
						if(palabraSecreta.charAt(i)==palusu.charAt(i)) {
							System.out.print(palusu.charAt(i));
						}else {
							System.out.print("_");
						}
					}
				}
				intentos--;
			}
		}while(intentos!=0 && gana!=1);
		if(gana==1) {
			System.out.println("Has ganado");
		}else {
			System.out.println("Has perdido");
		}
	}
}
