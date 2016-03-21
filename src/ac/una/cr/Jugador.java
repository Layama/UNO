package ac.una.cr;

public abstract class Jugador {
	private Baraja baraja = new Baraja();
	abstract Carta tirar(Carta carta);
	abstract Carta comer(Carta carta);
	
	public Baraja getBaraja() {
		return baraja;
	}

	public Carta validarCarta(Carta carta, Carta cartaEnMesa){
		if(carta.getColor().equals(cartaEnMesa.getColor()) || carta.getNumero() == cartaEnMesa.getNumero()){
			return carta;
		}
		return null;
	}
	public Carta realizarMovimiento(Jugador jugador, int turno) {
		for (Carta carta : jugador.getBaraja().getCartas()) {
			Carta cartaElejida = jugador.validarCarta(carta, Mesa.getCartaEnMesa());
			
			if(cartaElejida != null){
				jugador.tirar(cartaElejida);
				Mesa.setCartaEnMesa(cartaElejida);
				
				return cartaElejida;
			}
		}
		
		Carta cartaTomada = Maso.tomarCarta();
		
		while(jugador.validarCarta(cartaTomada, Mesa.getCartaEnMesa()) != null){
			jugador.comer(cartaTomada);
			cartaTomada = Maso.tomarCarta();
			System.out.println("Jugador " + (turno + 1)+ " ha tomado la carta " + cartaTomada);
		}
		
		Mesa.setCartaEnMesa(cartaTomada);
		return cartaTomada;
		
	} 
}
