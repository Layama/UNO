package ac.una.cr;

public abstract class Jugador {
	private Baraja baraja = new Baraja();
	Carta tirar(Carta carta) {
		
		return null;
	}
	

	Carta comer(Carta carta) {
		
		
		return carta;
	}
	
	public Baraja getBaraja() {
		return baraja;
	}
	public void setBaraja(Baraja baraja) {
		this.baraja = baraja;
	}

	public Carta validarCarta(Carta carta, Carta cartaEnMesa){
		if(carta.getColor().equals(cartaEnMesa.getColor()) || carta.getNumero() == cartaEnMesa.getNumero()){
			return carta;
		}
		
		return null;
	} 
}
