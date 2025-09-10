package Ejercicio1;

public class Direccion {
	private String NombreCalle;
	private String Portal;
	private int Piso;
	private String Puerta;
	private int CodigoPostal;
	public Direccion(String nombreCalle, String portal,int piso, String puerta, int codigoPostal) {
		NombreCalle = nombreCalle;
		Portal = portal;
		Piso = piso;
		Puerta = puerta;
		CodigoPostal = codigoPostal;
	}
	
	public Direccion() {
		this.NombreCalle="";
		this.Portal="";
		this.Piso=0;
		this.Puerta="";
		this.CodigoPostal=0;
	}

	public String getNombreCalle() {
		return NombreCalle;
	}

	public void setNombreCalle(String nombreCalle) {
		NombreCalle = nombreCalle;
	}

	public String getPortal() {
		return Portal;
	}

	public void setPortal(String portal) {
		Portal = portal;
	}

	public int getPiso() {
		return Piso;
	}

	public void setPiso(int piso) {
		Piso = piso;
	}

	public String getPuerta() {
		return Puerta;
	}

	public void setPuerta(String puerta) {
		Puerta = puerta;
	}

	public int getCodigoPostal() {
		return CodigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		CodigoPostal = codigoPostal;
	}

	@Override
	public String toString() {
		return "C/" + NombreCalle + ", Portal :" + Portal + ", Piso :" + Piso + ", Puerta :" + Puerta
				+ ", CP :" + CodigoPostal;
	}
	
	
}
