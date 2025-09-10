package Cadenas;

import java.util.Scanner;

public class JuegoBarcos {
	public static void main(String[] args) {
		String boleto="AAAAAAAAAA";
		Scanner sc=new Scanner(System.in);
		int cont=0;
		int pos=0;
		
		while(cont<4) {
			pos=(int)(Math.random()*10);
			
			
			if(boleto.charAt(pos)!='B') {
				if(pos!=9) {
					boleto=boleto.substring(0, pos)+'B'+boleto.substring(pos+1);
				}else {
					boleto=boleto.substring(0, pos)+'B';
				}
				cont++;
			}
		}
		int intentos=6;
		do {
			System.out.println("Dame una posicion");
			pos=sc.nextInt();
			if(boleto.charAt(pos)=='A')
				System.out.println("agua");
			else {
				System.out.println("Hundido");
				if(pos!=9)
					boleto=boleto.substring(0, pos)+'A'+boleto.substring(pos+1);
				else
					boleto=boleto.substring(0, pos)+'A';
			}
			intentos--;	
		}while(!boleto.equals("AAAAAAAAAA") && intentos>0);
		
		if(intentos>=0 && boleto.equals("AAAAAAAAAA"))
			System.out.println("Has ganado!!!");
		else {
			System.out.println("LOOSERRR!!!");
		}
		System.out.println(boleto);
		sc.close();
	}
}
