package semana1;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		int n[]= new int [5];
		
		int num;
		double sum=0;
		int mayor=0, menor=0;
		Scanner sc=new Scanner(System.in);
		int cont=0;
		
		
		
//		do {
//			System.out.println("Dame un nuemro: ");
//			num=sc.nextInt();
//			
//			sum=sum+num;
//			if(cont==0) {
//				mayor=num;
//				menor=num;
//			}
//			if(num>mayor) {
//				mayor=num;
//			}else {
//				if(num<menor) {
//					menor=num;
//				}
//			}
//			
//			
//			
//			cont++;
//		}while (cont!=5);
		
		for(int i=0;i<n.length;i++) {
			System.out.println("Dame un nuemro: ");
			n[i]=sc.nextInt();
			sum=sum+n[i];
		}
		
		Arrays.sort(n);
		mayor=n[0];
		menor=n[4];
		
		System.out.println("Arrays: "+Arrays.toString(n));
		System.out.println("La media es: "+(sum/5));
		System.out.println("El numero mayor es: "+mayor);
		System.out.println("El numero menor es: "+menor);
	}
}
