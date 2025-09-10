package Cadenas;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	System.out.println("Dame una palabra: ");
	String pass=sc.next();
	String mayus=pass.substring(0, 1).toUpperCase()+pass.substring(1).toLowerCase();
	System.out.println(mayus);
	sc.close();
	}
}
