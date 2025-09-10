package VideoClub;

public class Alquiler {
	private DVD dvd;
	private int tiempo;
	
	public Alquiler(DVD dvd, int tiempo) {
		super();
		this.dvd = dvd;
		this.tiempo = tiempo;
	}
	
	public Alquiler() {
		this.dvd=new DVD();
		this.tiempo=0;
	}

	public DVD getDvd() {
		return dvd;
	}

	public void setDvd(DVD dvd) {
		this.dvd = dvd;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
	
	@Override
	public String toString() {
		return "Alquiler [dvd=" + dvd + ", tiempo=" + tiempo + "]";
	}

	public static void main(String[] args) {
		DVD mulan=new DVD("Mulan", DVD.INFANTIL);
		Alquiler a=new Alquiler(mulan, 3);
		System.out.println(a);
	}
}
