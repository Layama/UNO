package ac.una.cr.uno;

import java.util.ArrayList;
import java.util.List;

public class Baraja {
	private List<Carta> cartas = new ArrayList<>();
	
	public Baraja(){
		for (int i = 0; i < 9; i++) {
			cartas.add(Maso.tomarCarta());
		}
	}

	public List<Carta> getCartas() {
		return cartas;
	}
}
