/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author luism
 */
public class CalculatorTest {
    
    /**
     * Prueba el método add de la clase Calculator.
     * Verifica si la suma de dos números es correcta.
     */
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3)); // Verifica que 2 + 3 es igual a 5
    }

    /**
     * Prueba el método subtract de la clase Calculator.
     * Verifica si la resta de dos números es correcta.
     */
    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(4, 3)); // Verifica que 4 - 3 es igual a 1
    }

    // Pruebas para los métodos de multiplicar y dividir con comentarios Javadoc similares...
}

