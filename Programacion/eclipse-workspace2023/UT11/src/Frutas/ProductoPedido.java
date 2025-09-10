package Frutas;

public class ProductoPedido {
	private String codigoPedido;
	private String codigoProducto;
	private String nombreProducto;
	private String descripcion;
	private String temporada;
	private double precioKg;
	private double kg;
	
	public ProductoPedido(String codigoPedido, String codigoProducto, String nombreProducto, String descripcion,
			String temporada, double precioKg, double kg) {
		this.codigoPedido = codigoPedido;
		this.codigoProducto = codigoProducto;
		this.nombreProducto = nombreProducto;
		this.descripcion = descripcion;
		this.temporada = temporada;
		this.precioKg = precioKg;
		this.kg = kg;
	}
	
	public ProductoPedido() {
		this.codigoPedido = "";
		this.codigoProducto = "";
		this.nombreProducto = "";
		this.descripcion = "";
		this.temporada = "";
		this.precioKg = 0;
		this.kg = 0;
	}

	public String getCodigoPedido() {
		return codigoPedido;
	}

	public void setCodigoPedido(String codigoPedido) {
		this.codigoPedido = codigoPedido;
	}

	public String getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTemporada() {
		return temporada;
	}

	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}

	public double getPrecioKg() {
		return precioKg;
	}

	public void setPrecioKg(double precioKg) {
		this.precioKg = precioKg;
	}

	public double getKg() {
		return kg;
	}

	public void setKg(double kg) {
		this.kg = kg;
	}

	@Override
	public String toString() {
		return ("\t"+this.nombreProducto+"\t"+this.precioKg+"€/kg\t"+this.kg+"kg");
	}
	
	
}
