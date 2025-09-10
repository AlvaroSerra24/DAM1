package prueba;

import java.util.Scanner;

public class EjercicioB {
	public static void main(String[] args) {
		int cont=0,num=0,num1=0,num2=0,pares1=0,pares2=0;
		Scanner sc=new Scanner(System.in);
		do{
		System.out.println("Dame un número entero de 3 cifras");
		num=sc.nextInt();
		if(num>=100 && num<1000) {
			cont++;
			if (cont==1)
				num1=num;
			else
				num2=num;
		}
		}while(cont!=2);
		
		for(int i=0;i<3;i++) {
			int r=num1%10;
			num1=num1/10;
			if (r%2==0) {
				pares1++;
			}
		}
		for(int j=0;j<3;j++) {
			int r=num2%10;
			num2=num2/10;
			if (r%2==0) {
				pares2++;
			}
		}
		if(pares1>pares2) {
			System.out.println("El primer numero tiene mayor cantidad de pares");
		}
		else {
			if(pares1==pares2) {
				System.out.println("Los dos numeros tienen la misma cantidad de numeros pares");
			}
			else {
				System.out.println("El segundo numero tiene mayor cantidad de pares");
			}
		}
		sc.close();
		
	}
} 
