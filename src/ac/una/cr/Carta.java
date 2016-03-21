package ac.una.cr;

import java.util.Random;

public class Carta {
	private Random rnd = new Random();
	private String colores[] =  {"Azul", "Rojo", "Verde", "Amarillo"};
	private String color = "";
	private int numero = 0;
	
	public Carta(){
		numero = rnd.nextInt(10);
		color = colores[rnd.nextInt(colores.length)];
	}

	@Override
	public String toString() {
		return "Carta: " + numero + " " + color;
	}

	public String getColor() {
		return color;
	}

	public int getNumero() {
		return numero;
	}
}
