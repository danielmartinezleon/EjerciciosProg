package ejercicio07;

import java.util.Random;

public class Moneda {

	public Moneda() {

	}

	public boolean lanzarMoneda(int desde, int hasta) {
		Random rnd = new Random(System.nanoTime());
		int lanzamiento = 0;

		lanzamiento = rnd.nextInt(hasta - desde + 1) + desde;

		if (lanzamiento == 1) {
			return true;
		} else {
			return false;
		}
	}

}
