package Examen;

public class Oferta {
	private String codProducto;
	private String nombre;
	private String categoría;
	private int puntos;
	
	public Oferta(String codProducto, String nombre, String categoría, int puntos) {
		this.codProducto = codProducto;
		this.nombre = nombre;
		this.categoría = categoría;
		this.puntos = puntos;
	}

	public Oferta() {
		this.codProducto = "";
		this.nombre = "";
		this.categoría = "";
		this.puntos = 0;
	}

	public String getCodProducto() {
		return codProducto;
	}

	public void setCodProducto(String codProducto) {
		this.codProducto = codProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoría() {
		return categoría;
	}

	public void setCategoría(String categoría) {
		this.categoría = categoría;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	@Override
	public String toString() {
		return "Oferta [codProducto=" + codProducto + ", nombre=" + nombre + ", categoría=" + categoría + ", puntos="
				+ puntos + "]";
	}
}
