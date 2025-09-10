package json;

public class libro {
	private String nombre;
	private String autor;
	private String año;
	private long paginas;
	
	public libro(String nombre, String autor, String año, long paginas) {
		this.nombre = nombre;
		this.autor = autor;
		this.año = año;
		this.paginas = paginas;
	}
	
	public libro() {
		this.nombre = "";
		this.autor = "";
		this.año = "";
		this.paginas = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAño() {
		return año;
	}

	public void setAño(String año) {
		this.año = año;
	}

	public long getPaginas() {
		return paginas;
	}

	public void setPaginas(long paginas) {
		this.paginas = paginas;
	}

	@Override
	public String toString() {
		return "libro [nombre=" + nombre + ", autor=" + autor + ", año=" + año + ", paginas=" + paginas + "]";
	}
	
	
}
