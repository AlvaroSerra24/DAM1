package productos;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.processing.SupportedSourceVersion;

public class Programa {
	private ArrayList<Producto>productos;
	
	public Programa() {
		this.productos=new ArrayList<Producto>();
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	
	public static void main(String[] args) {
		Programa p=new Programa();
		
		p.getProductos().add(new Producto("1", "HP Laptop", 0.5, 2500, "portátil"));
		p.getProductos().add(new Producto("2","Teclado logitech",0.15,25,"teclado"));
		p.getProductos().add(new Producto("3", "Raton logitech", 0.25, 15, "ratón"));
		p.getProductos().add(new Producto("4", "Samsung Galaxy Note 20", 0.1, 1000, "telefono"));
		p.getProductos().add(new Producto("5", "Iphone 7", 0.1, 1000, "telefono"));
		p.getProductos().add(new Producto("6", "Disco SSD", 0.2, 300, "disco"));
		
		System.out.println("1) Nombres de Ptoductos vendidos: ");
		p.getProductos().stream().forEach(n->System.out.println(n.getNombre()));
		
		System.out.println("2) Cuantos productos que empiecen por H");
		long cont=p.getProductos().stream().filter(prod->prod.getNombre().startsWith("H")).count();
		System.out.println("Empiezan por H: "+cont);
		
		System.out.println("3) Nombre de los productos vendidos de mas de mil euros");
		p.getProductos().stream().filter(prod->prod.getPrecio()>=1000).forEach(n->System.out.println(n.getNombre()));
		
		System.out.println("4) Nombre, peso y precio de los productos que pesan menos de 0,5Kg");
		p.getProductos().stream().filter(n->n.getPeso()<0.5).forEach(n->System.out.println(n.getNombre()+" "+n.getPeso()+" "+n.getPrecio()));
		
		System.out.println("5) Total de los productos vendidos");
		double suma=p.getProductos().stream().mapToDouble(n->n.getPrecio()).sum();
		System.out.println("Total: "+suma+"€");
		
		System.out.println("6) Lista nueva con los telefonos vendidos");
		List<Producto>nueva=p.getProductos().stream().filter(n->n.getCatgoria().equals("telefono")).toList();
		nueva.forEach(System.out::println);
		
		System.out.println("7) Lista de los productos que superen los 500€");
		List<Double>precios=p.getProductos().stream().filter(n->n.getPrecio()>500).map(n->n.getPrecio()).toList();
		precios.forEach(System.out::println);
		
		System.out.println("8) Precio del producto vendido más caro");
		double max=p.getProductos().stream().mapToDouble(n->n.getPrecio()).max().getAsDouble();
		System.out.println("El prcio más caro es: "+max);
		
		System.out.println("9) Precio del producto vendido más barato");
		double min=p.getProductos().stream().mapToDouble(n->n.getPrecio()).min().getAsDouble();
		System.out.println("El prcio más caro es: "+min);
		
		System.out.println("10) Nombres de productos en mayúscula de menos de 100€ y menos de 0,5Kg");
		p.getProductos().stream().filter(n->n.getPrecio()<100 && n.getPeso()<0.5).forEach(n->System.out.println(n.getNombre().toUpperCase()));
		
		System.out.println("1) Nombres de Ptoductos vendidos: ");
		for(Producto n: p.getProductos()) {
			System.out.println(n.getNombre());
		}
		
		System.out.println("2) Cuantos productos que empiecen por H");
		int cont2=0;
		for(Producto n: p.getProductos()) {
			if(n.getNombre().startsWith("H")) {
				cont2++;
			}
		}
		System.out.println("Empiezan por H: "+cont2);
		
		System.out.println("3) Nombre de los productos vendidos de mas de mil euros");
		for(Producto n: p.getProductos()){
			if(n.getPrecio()>=1000) {
				System.out.println(n.getNombre());
			}
		}
		
		System.out.println("4) Nombre, peso y precio de los productos que pesan menos de 0,5Kg");
		for(Producto n: p.getProductos()) {
			if(n.getPeso()<0.5) {
				System.out.println(n.getNombre()+" "+n.getPeso()+" "+n.getPrecio());
			}
		}
		
		System.out.println("5) Total de los productos vendidos");
		double suma2=0;
		for(Producto n: p.getProductos()) {
			suma2=suma2+n.getPrecio();
		}
		System.out.println("Total: "+suma2+"€");
		
		System.out.println("6) Lista nueva con los telefonos vendidos");
		List<Producto>nueva2=new ArrayList<Producto>();
		for(Producto n:p.getProductos()) {
			if(n.getCatgoria().equals("telefono")) {
				nueva2.add(n);
			}
		}
		System.out.println(nueva2);
		
		System.out.println("7) Lista de los productos que superen los 500€");
		List<Double>precios2=new ArrayList<Double>();
		for(Producto n:p.getProductos()) {
			if(n.getPrecio()>500) {
				precios2.add(n.getPrecio());
			}
		}
		System.out.println(precios2);
		
		System.out.println("8) Precio del producto vendido más caro");
		double max2=0;
		for(Producto n:p.getProductos()) {
			if(n.getPrecio()>max2) {
				max2=n.getPrecio();
			}
		}
		System.out.println(max2);
		
		System.out.println("9) Precio del producto vendido más barato");
		double min2=0;
		int contn=0;
		for(Producto n:p.getProductos()) {
			if(contn==0) {
				min2=n.getPrecio();
				contn++;
			}else {
				if(n.getPrecio()<min2) {
					min2=n.getPrecio();
				}
			}
		}
		System.out.println(min2);
		
		System.out.println("10) Nombres de productos en mayúscula de menos de 100€ y menos de 0,5Kg");
		for(Producto n:p.getProductos()) {
			if(n.getPrecio()<100 && n.getPeso()<0.5) {
				System.out.println(n.getNombre().toUpperCase());
			}
		}
	}
}