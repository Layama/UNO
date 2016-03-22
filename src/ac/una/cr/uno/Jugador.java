package ac.una.cr.uno;

public abstract class Jugador {
	private Baraja baraja = new Baraja();

	public abstract Carta tirar(Carta carta);

	public abstract Carta comer(Carta carta);

	public abstract Carta realizarMovimiento(Jugador jugador, int turno);

	public Baraja getBaraja() {
		return baraja;
	}

	public Carta validarCarta(Carta carta, Carta cartaEnMesa) {
		if (carta.getColor().equals(cartaEnMesa.getColor()) || carta.getNumero() == cartaEnMesa.getNumero()) {
			return carta;
		}
		return null;
	}

}
