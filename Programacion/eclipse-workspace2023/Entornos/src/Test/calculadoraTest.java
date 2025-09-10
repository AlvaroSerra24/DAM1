package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Calculadora.calculadora;

class calculadoraTest {
	
	
	calculadora cal= new calculadora(0,0);
	calculadora cal2= new calculadora(0,0);

	@Test
	void testSuma() {
		double valorEsperado=30;
		calculadora calc=new calculadora(20,10);
		double resultado=calc.suma();
		assertEquals(valorEsperado, resultado,0);
	}

	@Test
	void testResta() {
		double valorEsperado=10;
		calculadora calc=new calculadora(20,10);
		double resultado=calc.resta();
		assertEquals(valorEsperado, resultado,0);
	}

	@Test
	void testMultiplicar() {
		double valorEsperado=200;
		calculadora calc=new calculadora(20,10);
		double resultado=calc.multiplicar();
		assertEquals(valorEsperado, resultado,0);
	}

	@Test
	void testDividir() {
		double valorEsperado=2;
		calculadora calc=new calculadora(20,10);
		double resultado=calc.dividir();
		assertEquals(valorEsperado, resultado,0);
	}

}
