package ejemplos;

public class VariablesExpresiones {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// main control, espacio, enter
		
		//Comentario 1 línea: Texto que no se ejecuta
		//Comentario de varias líneas
		/*bnjdfznbl
		 * lbñfsjb
		 */
		
		System.out.println("Variable");
		// Syso control, espacio, enter
		
		//Declarar variable tipo nombre;
		//Declarar e inicializar una variable tipo nombre=valor;
		//int edadAlumno;//declarar
		//int edadProfesor=25;//declarar e inicializar
		
		
		//Numéricas
		int x=2;//4B
		int y=5;
		//float altura=1.86f; 
		//double distancia=2000000;
		//Booleanos true/false
		//boolean encontrado=true;
		//Letras
		//char letras='a';
		
		//string o cadenas de caracteres
		//String saludo="Hola";
		
		//Expresión=conjunto de variables/operadores/objectos que devuelve un valor
		x=4;//asignación
		System.out.println("El valor de x="+x);
		//Operadores aritmeticos
		x=x+2;//suma
		System.out.println("Suma x="+x);
		x=x-3;//resta
		System.out.println("Resta x="+x);
		x=x*8;//producto
		System.out.println("Producto x="+x);
		x=7/4;//division
		System.out.println("División x="+x);
		x=7%4;
		System.out.println("Resto 7/4 es x="+x);
		x+=2;//x=X+2;
		x++;//x=x+1;
		x--;//x=x-1;
		
		//Operadores relacionales <,<=,==,>=,>
		System.out.println(x==4);
		//Operadores lógicos: and &&, or ||, not !
		System.out.println(x>4||x==10);
		System.out.println(x+y);
		}
	}
