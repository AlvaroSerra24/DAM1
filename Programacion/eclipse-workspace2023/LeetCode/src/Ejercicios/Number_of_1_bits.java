package Ejercicios;

public class Number_of_1_bits {
	public static void main(String[] args) {
		int n=010010100;
		
		numberbits(n);
		
		
	}

	private static void numberbits(int n) {
		String ns=Integer.toBinaryString(n);
		int cont=0;
		
		for(int i=0;i<ns.length();i++) {
			if(ns.charAt(i)=='1') {
				cont++;
			}
		}
		
		System.out.println(cont);
	}
	//return Integer.bitCount(n);
}
