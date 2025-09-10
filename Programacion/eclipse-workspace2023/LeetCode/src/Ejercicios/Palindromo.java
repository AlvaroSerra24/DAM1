package Ejercicios;

public class Palindromo {
	public static void main(String[] args) {
		int x=121;
		
		if(palindromo(x))
			System.out.println("Es palindromo");
		else
			System.out.println("No es palindromo");
		
		System.out.println(Integer.toString(x));
	}

	private static boolean palindromo(int x) {
		String reves="";
		String s=String.valueOf(x);
		for(int i=0; i<s.length();i++) {
			reves=s.charAt(i)+reves;
		}
		
		return String.valueOf(x).equals(reves);
	}
}
