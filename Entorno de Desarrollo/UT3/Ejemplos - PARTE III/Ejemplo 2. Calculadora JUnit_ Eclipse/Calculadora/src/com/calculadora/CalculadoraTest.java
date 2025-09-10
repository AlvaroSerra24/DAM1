package com.calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSuma() {
		double valorEsperado=30;
		Calculadora calc=new Calculadora(20,10);
		double resultado=calc.suma();
		assertEquals(valorEsperado, resultado,0);
	}

	@Test
	void testResta() {
		fail("Not yet implemented");
	}

	@Test
	void testMultiplicar() {
		fail("Not yet implemented");
	}

	@Test
	void testDividir() {
		fail("Not yet implemented");
	}

}
