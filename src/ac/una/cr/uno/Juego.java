package ac.una.cr.uno;

import java.util.Random;

public class Juego {
	private Jugador[] jugadores;
	private Random rnd = new Random();
	private int turno;

	public Juego() {
	}

	public Juego(int cantidad) {
		if (cantidad >= 2) {
			jugadores = new JugadorAutomatico[cantidad];
			for (int i = 0; i < jugadores.length; i++) {
				jugadores[i] = new JugadorAutomatico();
				turno = rnd.nextInt(jugadores.length);
			}
			jugar();
		} else {
			System.out.println("Número de jugadores no válidos!");
		}
	}

	private void turno(Jugador jugador) {
		Carta carta = jugador.realizarMovimiento(jugador, turno);
		System.out.println("Jugador " + (turno + 1) + " ha tirado la carta " + carta);
	}

	public void jugar() {
		System.out.println("Carta en Mesa: " + Mesa.getCartaEnMesa());
		System.out.println("===========================================");
		for (;; turno++) {

			turno(jugadores[turno]);

			if (jugadores[turno].getBaraja().getCartas().isEmpty()) {
				System.out.println("Jugador " + (turno + 1) + " ¡Ha ganado!");
				System.exit(0);
			} else if (jugadores[turno].getBaraja().getCartas().size() == 1) {
				System.out.println("Jugador " + (turno + 1) + " dice ¡UNO!");
			}
			if ((turno + 1) == jugadores.length) {
				turno = -1;
			}
		}
	}
}