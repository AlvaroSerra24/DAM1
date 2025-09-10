package Banco;

public class Cuenta {
	private String IBAN;
	private String cuenta; 
	private String codigoTitular;
	private String codigoAutorizado;
	private double saldo;
	
	public Cuenta(String iBAN, String cuenta, String codigoTitular, String codigoAutorizado, double saldo) {
		this.IBAN = iBAN;
		this.cuenta = cuenta;
		this.codigoTitular = codigoTitular;
		this.codigoAutorizado = codigoAutorizado;
		this.saldo = saldo;
	}
	
	public Cuenta() {
		this.IBAN = "";
		this.cuenta = "";
		this.codigoTitular = "";
		this.codigoAutorizado = "";
		this.saldo = 0;
	}
	public String getIBAN() {
		return IBAN;
	}
	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}
	public String getCuenta() {
		return cuenta;
	}
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	public String getCodigoTitular() {
		return codigoTitular;
	}
	public void setCodigoTitular(String codigoTitular) {
		this.codigoTitular = codigoTitular;
	}
	public String getCodigoAutorizado() {
		return codigoAutorizado;
	}
	public void setCodigoAutorizado(String codigoAutorizado) {
		this.codigoAutorizado = codigoAutorizado;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
