package productos;

public class Producto {
	private String codigo;
	private String nombre;
	private double peso;
	private double precio;
	private String catgoria;
	
	public Producto(String codigo, String nombre, double peso, double precio, String catgoria) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.peso = peso;
		this.precio = precio;
		this.catgoria = catgoria;
	}
	
	public Producto() {
		this.codigo = "";
		this.nombre = "";
		this.peso = 0;
		this.precio = 0;
		this.catgoria = "";
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getCatgoria() {
		return catgoria;
	}

	public void setCatgoria(String catgoria) {
		this.catgoria = catgoria;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", peso=" + peso + ", precio=" + precio
				+ ", catgoria=" + catgoria + "]";
	}
	
}
