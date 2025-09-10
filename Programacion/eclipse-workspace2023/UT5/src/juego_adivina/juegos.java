package juego_adivina;

import java.util.Scanner;

public class juegos {
	public static void main(String[] args) {
		Adivina a=new Adivina();
		Scanner sc=new Scanner(System.in);
		int intentos=5;
		String vocal;
		String cad;
		cad=a.imprimirSinVocales();
		a.setAux(cad);
		
		System.out.println("LA PALABRA QUE TIENES QUE ADIVINAR ES: "+a.getAux());
		//Bucle del juego
		do {
			System.out.println("Dame una vocal");
			vocal=sc.next();
			if(a.vocalEncontrada(vocal)) {
				a.imprimir(vocal);
			}
			intentos--;
		}while(intentos!=0);
	}
}
