package ejercicio06;

public class Principal {

	public static void main(String[] args) {

		double precioProd = 100, precioFinal = 0, porcenDesc = 20, totDesc = 0, conv = 100;

		System.out.println("Bienvenido a las rebajas del Corte Inglés");
		System.out.println("###########################################");
		totDesc = (precioProd * porcenDesc) / conv;
		precioFinal = precioProd - totDesc;
		System.out.printf("Su producto cuesta %.2f€, pero tiene un descuento "
				+ "\ndel %.0f por ciento, así que el precio final es de %.2f€\n", precioProd, porcenDesc, precioFinal);
		System.out.println("Gracias y tenga un buen día ;)");
	}

}
