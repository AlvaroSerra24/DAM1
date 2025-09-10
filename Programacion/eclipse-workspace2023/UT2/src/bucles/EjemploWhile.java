package bucles;

public class EjemploWhile {
	
	public static void main(String[] args) throws InterruptedException {
		//Bucle While
		
		//Pares entre 0 y 20
		int i=0;//iterador del bucle con cu inicial
		while(i<=20) {
			System.out.print(i+" ");
			i=i+2;
			//i++;//i=i+1
			//Thread.sleep(500);
		}
		System.out.println();
		//Multiplos de 3 entre 3 y 21
		int j=3;//iterador
		while(j<=21) {
			System.out.print(j+" ");
			j+=3;
		}
		System.out.println();
		//Multiplo de 3 o 5 entr 0 y 50
		int k=0;
		while(k<=50) {
			if(k%3==0 || k%5==0) {
			System.out.print(k+" ");
			}
			k++;
		}
		//ver los números pares de 100 a 0
		System.out.println();
		int l=100;
		while(l>=0) {
			System.out.print(l+" ");
			l-=2;
		}
	}
}
