package RepasoUT2;

import java.util.Scanner;

public class adivina {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int n, num;
		 // n es el número que hay que acertar
		 // num guarda los números introducidos
		 System.out.print("Introduce N: ");
		 n =sc.nextInt();
		 System.out.print("Introduce número: ");
		 num=sc.nextInt();

		 while(num!=n) // mientras no coincidan ambos números
		 {
		 if(num>n)
		 System.out.println("menor");
		 else
		 System.out.println("mayor");
		 System.out.print("Introduce número: ");
		 num=sc.nextInt();
		 }
		 // al salir del mientras tenemos la certeza que num es igual a n

		 System.out.println("acertaste...");
		 }
}
