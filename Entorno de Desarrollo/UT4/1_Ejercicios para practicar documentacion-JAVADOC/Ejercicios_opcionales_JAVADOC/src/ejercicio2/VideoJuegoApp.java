package ejercicio2;

public class VideoJuegoApp {

	public static void main(String[] args) {
		Jugador jugador = new Jugador("Alex");
		Videojuego juego = new Videojuego("Super Juego Aventura");

		juego.asignarJugador(jugador);
		jugador.incrementarPuntuacion(100);

		System.out.println("Jugador: " + juego.getJugador().getNombre());
		System.out.println("Puntuación: " + juego.getJugador().getPuntuacion());
		System.out.println("Jugando: " + juego.getTitulo());
	}

}
