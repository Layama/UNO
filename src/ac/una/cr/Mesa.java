package ac.una.cr;

public class Mesa {
	private Carta cartaInicial = Maso.tomarCarta();

	public Carta getCartaEnMesa() {
		return cartaInicial;
	}
	public void setCartaEnMesa(Carta cartaInicial) {
		this.cartaInicial = cartaInicial;
	}
}
