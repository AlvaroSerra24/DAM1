package ejercicio3;

public class Main {

    public static void main(String[] args) {
        Ejercicio3 ejercicio = new Ejercicio3();
        
        // Prueba 1
        double resultado1 = ejercicio.calcular_cantidad_solicitada(1000.00, 700.00);
        System.out.println("Prueba 1: Entrada (1000.00, 700.00), Salida esperada: 1000.0, Resultado: " + resultado1);
        
        // Prueba 2
        double resultado2 = ejercicio.calcular_cantidad_solicitada(1000.00, -1000);
        System.out.println("Prueba 2: Entrada (1000.00, -1000), Salida esperada: 0, Resultado: " + resultado2);
        
        // Prueba 3
        double resultado3 = ejercicio.calcular_cantidad_solicitada(18000.00, 1700.00);
        System.out.println("Prueba 3: Entrada (18000.00, 1700.00), Salida esperada: 15000.0, Resultado: " + resultado3);
        
        // Prueba 4
        double resultado4 = ejercicio.calcular_cantidad_solicitada(18000.00, 1000.00);
        System.out.println("Prueba 3: Entrada (18000.00, 1000.00), Salida esperada: 9000.0, Resultado: " + resultado4);
    }
}
