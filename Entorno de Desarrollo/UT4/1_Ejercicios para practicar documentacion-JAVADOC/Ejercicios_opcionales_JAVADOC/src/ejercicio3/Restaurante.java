package ejercicio3;

public class Restaurante {
    private String nombre;
    private Plato[] menu;

    public Restaurante(String nombre, Plato[] menu) {
        this.nombre = nombre;
        this.menu = menu;
    }

    public String getNombre() {
        return nombre;
    }

    public Plato[] getMenu() {
        return menu;
    }
}
