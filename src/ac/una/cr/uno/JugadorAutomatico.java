package ac.una.cr.uno;

public class JugadorAutomatico extends Jugador {

	@Override
	public Carta tirar(Carta carta) {
		getBaraja().getCartas().remove(carta);

		return carta;
	}

	@Override
	public Carta comer(Carta carta) {
		getBaraja().getCartas().add(carta);
		return carta;
	}

	public Carta validarCarta(Carta carta, Carta cartaInicial) {
		if (carta.getColor().equals(cartaInicial.getColor()) || carta.getNumero() == cartaInicial.getNumero()) {
			return carta;
		}

		return null;
	}

	@Override
	public Carta realizarMovimiento(Jugador jugador, int turno) {
		for (Carta carta : jugador.getBaraja().getCartas()) {
			Carta cartaElejida = jugador.validarCarta(carta, Mesa.getCartaEnMesa());

			if (cartaElejida != null) {
				jugador.tirar(cartaElejida);
				Mesa.setCartaEnMesa(cartaElejida);

				return cartaElejida;
			}
		}

		Carta cartaTomada = Maso.tomarCarta();

		while (jugador.validarCarta(cartaTomada, Mesa.getCartaEnMesa()) != null) {
			jugador.comer(cartaTomada);
			cartaTomada = Maso.tomarCarta();
			System.out.println("Jugador " + (turno + 1) + " ha tomado la carta " + cartaTomada);
		}

		Mesa.setCartaEnMesa(cartaTomada);
		return cartaTomada;

	}
}
