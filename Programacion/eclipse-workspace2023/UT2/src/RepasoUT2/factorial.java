package RepasoUT2;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 // long factorial; con long se puede calcular hasta el factorial de 25
		 double factorial;
		 int num;
		 System.out.print("Introduce un número: ");
		 num=sc.nextInt();

		 factorial=1; // es importante inicializarlo a 1, ya que multiplicará-

		 // por ejemplo: el factorial de 10 es:
		 // 10*9*8*7*6*5*4*3*2*1

		 for (int i=num;i>0;i--)
		 {
		 factorial=factorial*i;

		 }
		 System.out.println("El factorial de " + num + " es: " + factorial);
		 }

}
