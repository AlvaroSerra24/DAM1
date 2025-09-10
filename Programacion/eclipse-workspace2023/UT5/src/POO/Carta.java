package POO;

public class Carta {
	
	private int numero;
	private String palo;
	
	//Constructor por defecto
	public Carta() {
		this.numero=0;
		this.palo="";
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	@Override
	public String toString() {
		return numero + " de " + palo;
	}
	public void esxtraerCarta() {
		int dato=0;
		//this.numero=numeroAleatorio entre 1-12 !=8,9
		do {
			dato=(int)(1+Math.random()*12);
		}while(dato==8 || dato==9);
		//this.palo="bastos" o "copas" o "espadas" o "oros"
		String opciones[]= {"bastos","copas","espadas","oros"};
		numero=(int)(Math.random()*4);
		this.palo=opciones[numero];
		
		this.numero=dato;
	}
	
	
}
