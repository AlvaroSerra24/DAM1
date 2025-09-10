package Ejercicios;

import java.util.Arrays;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		String strs[]= {"flower","flow","flight"}; 
		
		prefijo(strs);
	}

	private static void prefijo(String[] strs) {
		String pre="";
		Arrays.sort(strs);
		for(int i=0;i<strs.length;i++) {
			for(int j=0;j<strs[i].length();j++) {
				
			}
		}
	}
}
