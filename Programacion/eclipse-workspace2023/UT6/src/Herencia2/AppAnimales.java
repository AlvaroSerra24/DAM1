package Herencia2;

public class AppAnimales {
	public static void main(String[] args) {
		Animal misAnimales[]=new Animal[4];
		
		misAnimales[0]=new Perro("Lori","22453525","Border collie", 4, "Gris", "Ladrido", true);
		misAnimales[1]=new Perro("cooper","28423084","Border collie",4,"negro","Ladrido", true);
		misAnimales[2]=new Gato("Tina","14290821840","Rag doll",4,"blanco","Maullido");
		misAnimales[3]=new Perro("Berta", "82904203","Pastor aleman",4,"Marron","Ladrido",true);
		
		for(int i=0;i<misAnimales.length;i++) {
			System.out.println(misAnimales[i].getNombre()+" hace "+misAnimales[i].emitirSonido());
		}
	}
}
