package Cadenas;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame un NIF: ");
		String NIF=sc.next();
		if(esDNICorrecto(NIF)) {
			System.out.println("DNI correcto");
		}else {
			System.out.println("DNI incorrecto");
		}
		
		System.out.println("Matrícula");
		String matricula=sc.next();
		if(esMatricula(matricula)) {
			System.out.println("Matrícula OK");
		}else {
			System.out.println("Matrícula incorrecta");
		}
		
//		if(NIF.length()==9) {
//			//XXXXXXXXL
//			if(Character.isUpperCase(NIF.charAt(8))) {
//				System.out.println("Ultimo caracter una letra");
//				for(int i=0; i<=7; i++) {
//					if(!Character.isDigit(NIF.charAt(i))) {
//						System.out.println("NIF incorrecto");
//					}
//					
//				}
//			}else {
//				System.out.println("NIF incorrecto");
//			}
//			Character.isDigit(0);
//			
//		}else {
//			System.out.println("NIF incorrecto: Longitud");
//		}
		sc.close();
	}

	private static boolean esDNICorrecto(String nif) {
		if(nif.length()==9) {
			if(nif.length()==9) {
				//XXXXXXXXL
				if(Character.isUpperCase(nif.charAt(8))) {
					System.out.println("Ultimo caracter una letra");
					for(int i=0; i<=7; i++) {
						if(!Character.isDigit(nif.charAt(i))) {
							System.out.println("NIF incorrecto");
							return false;
						}
						
					}
				}else {
					System.out.println("NIF incorrecto");
					return false;
				}
				Character.isDigit(0);
				
			}else {
				System.out.println("NIF incorrecto: Longitud");
				return false;
			}
		}
		return true;
	}
	
	public static boolean esMatricula(String mat) {
		if(mat.length()!=7) {
			return false;
		}else {
			for(int i=0; i<=3; i++) {
				if(!Character.isDigit(mat.charAt(i))) {
					return false;
				}
			}
			for(int i=4; i<=6; i++) {
				if(!Character.isUpperCase(mat.charAt(i)))
					return false;
			}
		}
		return true;
	}
}
