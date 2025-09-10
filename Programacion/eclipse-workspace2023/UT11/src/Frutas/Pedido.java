package Frutas;

public class Pedido {
	private String codigoPedido;
	private String dniCliente;
	private String descuento;
	private String turno;
	
	public Pedido(String codigoPedido, String dniCliente, String descuento, String turno) {
		this.codigoPedido = codigoPedido;
		this.dniCliente = dniCliente;
		this.descuento = descuento;
		this.turno = turno;
	}
	
	public Pedido() {
		this.codigoPedido = "";
		this.dniCliente = "";
		this.descuento = "";
		this.turno = "";
	}

	public String getCodigoPedido() {
		return codigoPedido;
	}

	public void setCodigoPedido(String codigoPedido) {
		this.codigoPedido = codigoPedido;
	}

	public String getDniCliente() {
		return dniCliente;
	}

	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}

	public String getDescuento() {
		return descuento;
	}

	public void setDescuento(String descuento) {
		this.descuento = descuento;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Pedido [codigoPedido=" + codigoPedido + ", dniCliente=" + dniCliente + ", descuento=" + descuento
				+ ", turno=" + turno + "]";
	}
	
	
}
