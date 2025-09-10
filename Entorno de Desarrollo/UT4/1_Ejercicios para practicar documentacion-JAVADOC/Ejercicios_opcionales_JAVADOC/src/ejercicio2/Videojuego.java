package ejercicio2;

public class Videojuego {
    private String titulo;
    private Jugador jugador;

    public Videojuego(String titulo) {
        this.titulo = titulo;
        this.jugador = null;
    }

    public void asignarJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public String getTitulo() {
        return titulo;
    }

    public Jugador getJugador() {
        return jugador;
    }
}
