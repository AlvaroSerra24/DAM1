package Musica;

public class Grupo {
	private String codigog;
	private String nombre;
	private int año;
	private String tipo;
	
	public Grupo() {

		this.codigog = "";
		this.nombre = "";
		this.año = 0;
		this.tipo = "";
	}
	
	public Grupo(String codigo, String nombre, int año, String tipo) {

		this.codigog = codigo;
		this.nombre = nombre;
		this.año = año;
		this.tipo = tipo;
	}
	public String getCodigo() {
		return codigog;
	}
	public void setCodigo(String codigo) {
		this.codigog = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return nombre+" el cual se creo en "+año+" el codigo es "+codigog+"\n";
	}
	
}
