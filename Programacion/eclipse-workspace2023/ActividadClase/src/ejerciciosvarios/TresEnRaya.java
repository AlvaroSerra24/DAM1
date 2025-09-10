package ejerciciosvarios;
import java.util.Arrays;
import java.util.Scanner;

public class TresEnRaya {

	public static void main(String[] args) {
		String [][]t=new String[3][3];
		crearTablero(t); //inicializa las casillas a " "
		mostrarTablero(t);
		String jugador="X";
		int x=0,y=0, cont=4;
		Scanner sc=new Scanner(System.in);
		
		
		do {
			colocaFicha(jugador,x,y,t,cont);
			mostrarTablero(t);
			juegaPC(t);
			mostrarTablero(t);
			if(gana(jugador,t)) {
				System.out.println("El jugador 1 gana");
			}
			cont--;
		}while(cont!=0);
		

	}

	private static boolean compruebaHorizontal(String jugador, String[][]t) {
		String horiz[]= new String[3];
		for(int i=0;i<t.length;i++) {
			
		}
		return false;
	}
	private static boolean compruebaVertical(String jugador, String[][]t) {
		String vert[]= new String[3];
		for(int i=0;i<t.length;i++) {
			for(int j=0;j<t[0].length;j++) {
				vert[j]=t[i][j];
				}
			}
		for(int z=0;z<t.length;z++) {
			if(!vert[z].equals(jugador)) {
				return false;
			}
		}
		return true;
	}
	private static boolean compruebaDiagonal(String jugador, String[][]t) {
		String diag[]= new String[3];
		for(int i=0;i<t.length;i++) {
			diag[i]=t[i][i];
		}
		for(int j=0;j<t.length;j++) {
			if(!diag[j].equals(jugador)) {
				return false;
			}
		}
		System.out.println(Arrays.toString(diag));
		return true;
	}
	
	private static int juegaPC(String[][]t) {
		System.out.println("Juega el PC");
		int x=0,y=0;
		do {
			x=(int)(Math.random()*3);
			y=(int)(Math.random()*3);
			if(t[x][y]=="X" || t[x][y]=="O")
				System.out.println("Aqui ya hay una ficha ahí");
			else {
				t[x][y]="O";
			}
		}while(t[x][y]!="X" && t[x][y]!="O");
		return -1;
	}
	
	private static int colocaFicha(String jugador, int x, int y, String[][] t, int cont) {
		Scanner sc=new Scanner(System.in);
		do {
			do {
			System.out.println("Jugador elige una posición x");
			x=sc.nextInt();
			}while(x>2 || x<0);
			do {
			System.out.println("Jugador elige una posición y");
			y=sc.nextInt();
			}while(y>2 || y<0);
			if(t[x][y]=="X" || t[x][y]=="O")
				System.out.println("Aqui ya hay una ficha ahí");
			else {
				t[x][y]="X";
			}
		}while(t[x][y]!="X" && t[x][y]!="O");
		return -1;
	}

	private static boolean gana(String jugado1, String[][] t) {
		if(compruebaDiagonal(jugado1,t)) {
			return true;
		}else {
			if(compruebaVertical(jugado1,t)) {
				return true;
			}else {
				if(compruebaHorizontal(jugado1,t)) {
					return true;
				}
			}
		}
		return false;
	}

	public static void crearTablero(String [][]t) {
		for(int i=0;i<t.length;i++) {
			for(int j=0;j<t[0].length;j++) {
				t[i][j]=" ";
			}
		}
	}
	public static void mostrarTablero(String [][]t) {
		System.out.println("**************************");
		for(int i=0;i<t.length;i++) {
			System.out.println();
			for(int j=0;j<t[0].length;j++) {
				System.out.print("|"+t[i][j]+"|");
			}
			
		}
		System.out.println();
		System.out.println("**************************");
	}
}
