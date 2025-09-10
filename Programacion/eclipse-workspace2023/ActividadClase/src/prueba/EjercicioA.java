package prueba;

import java.util.Scanner;

public class EjercicioA {
	public static void main(String[] args) {
		int cont=0,num=0,num1=0,num2=0,suma1=0,suma2=0;
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
			suma1=suma1+r;
		}
		for(int j=0;j<3;j++) {
			int r=num2%10;
			num2=num2/10;
			suma2=suma2+r;
		}
		if(suma1>suma2) {
			System.out.println("El primer numero sus cifras valen mas");
		}
		else {
			if(suma2==suma1) {
				System.out.println("Las cifras de los dos numeros valen lo mismo");
			}
			else {
				System.out.println("El segundo numero sus cifras valen mas");
			}
			sc.close();
		}
	}
}
