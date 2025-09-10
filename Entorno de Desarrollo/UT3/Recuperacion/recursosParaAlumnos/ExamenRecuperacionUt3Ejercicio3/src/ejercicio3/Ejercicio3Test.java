package ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio3Test {

	@Test
	void testCalcular_cantidad_solicitada() {
		Ejercicio3 ejercicio = new Ejercicio3();
		double resultado1 = ejercicio.calcular_cantidad_solicitada(1000.00, 700.00);
		double valoresperado1 = 1000.0;
		assertEquals(resultado1,valoresperado1,0);
		double resultado2 = ejercicio.calcular_cantidad_solicitada(4000.00, 700.00);
		double valoresperado2 = 3000.0;
		assertEquals(resultado2,valoresperado2,0);
		double resultado3 = ejercicio.calcular_cantidad_solicitada(1000.00, -1000);
		double valoresperado3 = 0;
		assertEquals(resultado3,valoresperado3,0);
		double resultado4 = ejercicio.calcular_cantidad_solicitada(18000.00 , 1700.00);
		double valoresperado4 = 15000.0;
		assertEquals(resultado4,valoresperado4,0);
	}

	@Test
	void testCalcular_interes_prestamo() {
		Ejercicio3 ejercicio = new Ejercicio3();
		double resultado1 = ejercicio.calcular_interes_prestamo(3500.00);
		double valoresperado1 = 6.0;
		assertEquals(resultado1,valoresperado1,0);
		double resultado2 = ejercicio.calcular_interes_prestamo(7999.00);
		double valoresperado2 = 12.0;
		assertEquals(resultado2,valoresperado2,0);
		double resultado3 = ejercicio.calcular_interes_prestamo(8001.00);
		double valoresperado3 = 13.5;
		assertEquals(resultado3,valoresperado3,0);
		double resultado4 = ejercicio.calcular_interes_prestamo(-8001.00);
		double valoresperado4 = 0;
		assertEquals(resultado4,valoresperado4,0);
	}

}
