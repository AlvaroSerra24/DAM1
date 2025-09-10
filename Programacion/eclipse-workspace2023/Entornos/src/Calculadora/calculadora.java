package Calculadora;

public class calculadora {
	private int num1=1;
	private int num2=2;
	/**
	* Constructor de la clase Calculadora.
	*
	* @param num1 El primer número.
	* @param num2 El segundo número.
	*/
	public calculadora(int num1, int num2) {
	this.num1 = num1;
	this.num2 = num2;
	}
	/**
	* Suma los números.
	*
	* @return La suma de num1 y num2.
	*/
	
	public int suma() {
		return num1 + num2;
	}
	/**
	* Resta los números.
	*
	* @return La resta de num1 y num2.
	*/
	public int resta() {
		return num1 - num2;
	}
	/**
	* Multiplica los números.
	*
	* @return El producto de num1 y num2.
	*/
	public int multiplicar() {
		return num1 * num2;
	}
	/**
	* Divide los números.
	*
	* @return El cociente de num1 y num2.
	* @throws ArithmeticException si num2 es 0.
	*/
	public int dividir() {
		if (num2 == 0) {
			throw new
			ArithmeticException("División por cero");
		}
		return num1 / num2;
	}
	// Métodos getters y setters para num1 y num2
	public int getNum1() {
		return num1;
	}
		
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
		}
}
