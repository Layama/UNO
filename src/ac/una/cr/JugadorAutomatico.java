package ac.una.cr;

public class JugadorAutomatico extends Jugador{

	@Override
	Carta tirar(Carta carta) {
		getBaraja().getCartas().remove(carta);
		
		return carta;
	}
	
	@Override
	Carta comer(Carta carta) {
		getBaraja().getCartas().add(carta);
		return carta;
	}
	
	public Carta validarCarta(Carta carta, Carta cartaInicial){
		if(carta.getColor().equals(cartaInicial.getColor()) || carta.getNumero() == cartaInicial.getNumero()){
			return carta;
		}
		
		return null;
	} 
}
