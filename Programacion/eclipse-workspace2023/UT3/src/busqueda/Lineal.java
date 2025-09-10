package busqueda;

import java.util.Arrays;

public class Lineal {
	public static void main(String[] args) {
		int num[]= {10,50,30,70,80,60,20,90,40};
		int elemento=20;
		Arrays.sort(num);
		//System.out.println(Arrays.toString(num));
		//System.out.println("Encontrado en la posicion: "+busquedaBinariaRecursiva(num, elemento, 0,num.length-1));
		
		System.out.println("Encontrado en la posicion: "+busquedaLineal(num,elemento));
	}

	private static int busquedaLineal(int[] num, int elemento) {
		for(int i=0;i<num.length;i++) {
			if(elemento==num[i]) {
				return i;
			}
		}
		
		return -1;
		
	}
//	public static int busquedaBinariaRecursiva(int num[], int elemento, int l,int h) {
//		int m=(l+h)/2;
//		if(l>h)
//			return-1;
//		if(num[m]==elemento) {
//			return m;
//		}else {
//			if(num[m]<elemento) {
//				return busquedaBinariaRecursiva(num,elemento,m+1 ,h );
//			}else {
//				return busquedaBinariaRecursiva(num,elemento,l ,m-1 );
//			}
//		}
//	}
}
