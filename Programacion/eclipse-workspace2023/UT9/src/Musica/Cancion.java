package Musica;

public class Cancion {
	private String codigoc;
	private String dico;
	private String nombre;
	private String duracion;
	
	public Cancion(String codigoc, String dico, String nombre, String duracion) {
		this.codigoc = codigoc;
		this.dico = dico;
		this.nombre = nombre;
		this.duracion = duracion;
	}

	public Cancion() {
		this.codigoc = "";
		this.dico = "";
		this.nombre = "";
		this.duracion = "";
	}

	public String getCodigoc() {
		return codigoc;
	}

	public void setCodigoc(String codigoc) {
		this.codigoc = codigoc;
	}

	public String getDico() {
		return dico;
	}

	public void setDico(String dico) {
		this.dico = dico;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return nombre+" del disco "+dico+" dura "+duracion+"\n";
	}
	
	
}
