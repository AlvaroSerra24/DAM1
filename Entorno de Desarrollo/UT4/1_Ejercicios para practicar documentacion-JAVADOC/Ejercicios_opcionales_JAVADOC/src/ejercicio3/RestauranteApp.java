package ejercicio3;

public class RestauranteApp {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Carlos", 30);
		Plato[] menu = { new Plato("Hamburguesa", 8.50), new Plato("Ensalada", 5.00) };
		Restaurante restaurante = new Restaurante("Buen Sabor", menu);

		System.out.println("Bienvenido al restaurante " + restaurante.getNombre());
		System.out.println("Menú del día:");
		for (Plato plato : restaurante.getMenu()) {
			System.out.println(plato.getNombre() + " - $" + plato.getPrecio());
		}
		System.out.println("Cliente: " + cliente.getNombre() + ", Edad: " + cliente.getEdad());
	}

}
