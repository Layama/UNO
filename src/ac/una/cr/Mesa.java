package ac.una.cr;

public class Mesa {
	private static Carta cartaEnMesa = Maso.tomarCarta();

	public static Carta getCartaEnMesa() {
		return cartaEnMesa;
	}
	public static void setCartaEnMesa(Carta carta) {
		cartaEnMesa = carta;
	}
}
