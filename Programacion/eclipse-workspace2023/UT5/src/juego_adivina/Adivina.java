package juego_adivina;

import java.util.Scanner;

public class Adivina {
	String secreta;
	String aux="";
	//constructor sin parámetros
	Adivina(){
		this.secreta="islote";
	}
	//constructor con parámetros
	Adivina(String cadena){
		this.secreta=cadena;
	}
	
	//Imprime secreta con _ en lugar de vocal
	public String imprimirSinVocales() {
		//tambien replaceAll()
		for(int i=0;i<secreta.length();i++) {
			if(secreta.charAt(i)=='i' || secreta.charAt(i)=='u' || secreta.charAt(i)=='o' || secreta.charAt(i)=='e' || secreta.charAt(i)=='a') {
				aux=aux+"_";
			}else {
				aux=aux+secreta.charAt(i);
			}
		}
		return aux;
	}
	//Getters y setters
	
	public String getSecreta() {
		return secreta;
	}
	public void setSecreta(String secreta) {
		this.secreta = secreta;
	}
	public String getAux() {
		return aux;
	}
	public void setAux(String aux) {
		this.aux = aux;
	}
	
	//Devuelve verdadero si la vocal v está en secreta
	public  boolean vocalEncontrada(String v) {
			return this.secreta.contains(v);
	}
	
	//Imprime secreta con vocal/vocales en su sitio
	public String imprimir(String vocal) {
		char vprint=vocal.charAt(0);
		for(int i=0;i<secreta.length();i++) {
			if(secreta.charAt(i)==vprint) {
				aux=aux.substring(0,i)+vocal+aux.substring(i+1);
			}
		}
		System.out.println("Muy bien: "+aux);
		return aux;
	}
}
