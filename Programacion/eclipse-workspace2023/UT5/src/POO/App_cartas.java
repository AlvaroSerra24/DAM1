package POO;

import java.util.Scanner;

public class App_cartas {
	public static void main(String[] args) {
		Carta c1=new Carta();
		Carta c2=new Carta();
		String s1="";
		String s2="";
		
		
		int total1=0, total2=0;
			do {
			c1.esxtraerCarta();
			System.out.println(c1);
			total1+=c1.getNumero();
			System.out.println("Sumo 1: "+total1);
			}while(!seguirJugando(s1) && total1<21);
			do {
			c2.esxtraerCarta();
			System.out.println(c2);
			total2+=c2.getNumero();
			System.out.println("Sumo 2: "+total2);
			}while(!seguirJugando(s2) && total2<21);
			//juego mientras no sea 21
		
		
		if(total1>total2) {
			if(total1<21) {
				System.out.println("Ha ganado 1");
				System.out.println("Ha perdido 2");
			}else {
				System.out.println("Ha perdido 1");
				System.out.println("Ha ganado 2");
			}
		}else {
			if(total2<21) {
				System.out.println("Ha ganado 2");
				System.out.println("Ha perdido 1");
			}else {
				System.out.println("Ha perdido 2");
				System.out.println("Ha ganado 1");
			}
		}
	}

	private static boolean seguirJugando(String s) {
		Scanner sc= new Scanner(System.in);
		do {
			System.out.println("¿Quieres seguir jugando?");
			s=sc.next();
			s=s.toUpperCase();
		}while(!s.equals("S") && !s.equals("N"));
		if(s.equals("S"))
			return false;
		else
			return true;
	}
}
