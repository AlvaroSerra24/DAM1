package VariablesCondiciones;

import java.util.Scanner;

public class Ejercicio_Nomina {

	public static void main(String[] args) {
		
		System.out.println("************************************");
		System.out.println("*        CÁLCULO DE NÓMINAS        *");
		System.out.println("************************************");
		System.out.println("1)Programador junior");
		System.out.println("2)Programador senior");
		System.out.println("3) Jefe de proyecto");
		System.out.println("Introduzca el cargo del empleado:");
		Scanner sc=new Scanner(System.in);
		int cargo=sc.nextInt();
		double nomina=0;
		System.out.println("¿Cuántos días ha estado de viaje?");
		double dias=sc.nextDouble();
		System.out.println("Estado civil (1-Soltero 2-Casado");
		int estado=sc.nextInt();
			
		switch(cargo) {
		case 1:
			System.out.println("Programador junior");
			nomina=950;
			break;
		case 2:
			System.out.println("Programador senior");
			nomina=1200;
			break;
		case 3:
			System.out.println("Jefe de proyecto");
			nomina=1600;
			break;
		default:
			System.out.println("No se correponde con ninguna opción");
		}//switch
		
		System.out.println("El sueldo base es: "+nomina+"€");
		System.out.println("Dias de viaje ("+dias+"): "+(30*dias)+"€");
		nomina=nomina+(30*dias);
		if(estado==1) {//soltero
			System.out.println("IRPF "+(nomina*0.25)+"€");
			nomina=nomina-nomina*0.25;
		}else {//casado
			System.out.println("IRPF "+(nomina*0.20)+"€");
			nomina=nomina-nomina*0.20;
		}
		System.out.println("Total: "+nomina+"€");
		sc.close();
	}

}
