package gimnasioPendiente;

public class actividadReservada {
	private String nombreActividad;
	private double hora;
	private String códigoMonitor;
	private int nMax;
	private int nPar;
	public actividadReservada(String nombreActividad, double hora, String códigoMonitor, int nMax, int nPar) {
		this.nombreActividad = nombreActividad;
		this.hora = hora;
		this.códigoMonitor = códigoMonitor;
		this.nMax = nMax;
		this.nPar = nPar;
	}
	
	public actividadReservada() {
		this.nombreActividad = "";
		this.hora = 0;
		this.códigoMonitor = "";
		this.nMax = 0;
		this.nPar = 0;
	}
	
	public String getNombreActividad() {
		return nombreActividad;
	}
	public void setNombreActividad(String nombreActividad) {
		this.nombreActividad = nombreActividad;
	}
	public double getHora() {
		return hora;
	}
	public void setHora(double hora) {
		this.hora = hora;
	}
	public String getCódigoMonitor() {
		return códigoMonitor;
	}
	public void setCódigoMonitor(String códigoMonitor) {
		this.códigoMonitor = códigoMonitor;
	}
	public int getnMax() {
		return nMax;
	}
	public void setnMax(int nMax) {
		this.nMax = nMax;
	}
	public int getnPar() {
		return nPar;
	}
	public void setnPar(int nPar) {
		this.nPar = nPar;
	}
	@Override
	public String toString() {
		return "actividadReservada [nombreActividad=" + nombreActividad + ", hora=" + hora + ", códigoMonitor="
				+ códigoMonitor + ", nMax=" + nMax + ", nPar=" + nPar + "]";
	}
	
	
	
}
