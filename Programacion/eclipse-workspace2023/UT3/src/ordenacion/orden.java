package ordenacion;

import java.util.Arrays;

public class orden {
	public static void main(String[] args) {
		int num[]= {3,60,1,34,23,0,66,90};
		int a=2,b=5;
		System.out.println(Arrays.toString(num));
		intercambia(num,a,b);
		System.out.println(Arrays.toString(num));
		ordenar(num);
		System.out.println(Arrays.toString(num));
	}

	public static void intercambia(int[] num, int a, int b) {
		int aux=0;
		aux=num[a];
		num[a]=num[b];
		num[b]=aux;
	}
	public static void ordenar(int[] num) {
		boolean intercambio=true;
		for(int j=0; j<num.length && intercambio;j++) {
			intercambio=false;
			for(int i=0;i<num.length-1;i++) {
				if(num[i]>num[i+1]) {
					intercambia(num,i,i+1);
					intercambio=true;
				}
			}
			
		}
	}
}
