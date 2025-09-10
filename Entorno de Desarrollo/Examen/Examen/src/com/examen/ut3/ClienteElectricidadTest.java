package com.examen.ut3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClienteElectricidadTest {

	
	@Test
	void testCalcularTotalFactura() {
		ClienteElectricidad cliente1 = new ClienteElectricidad("12345", true, 150, 6);
		cliente1.calcularTotalFactura();
		double valoresperado=0.0;
		assertEquals(valoresperado,cliente1.getTotalFactura(),0.01,"Error!!");
	}

}
