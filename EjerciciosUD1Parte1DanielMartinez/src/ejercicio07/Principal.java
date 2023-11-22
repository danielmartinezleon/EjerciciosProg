package ejercicio07;

public class Principal {

	public static void main(String[] args) {

		double consumos100Km = 7.5, precioGasolina = 1.80, 
				kmViaje = 300.0, totGastado = 0.0, conv = 100.0,
				cambioUni = 0.0;
		
		
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("|||Bienvenido a la calculadora de gasto de combustible|||");
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
		cambioUni = kmViaje / conv;
		totGastado = (cambioUni * consumos100Km) * precioGasolina;
		System.out.printf("Si mi nuevo coche consume %.1fL de Gasolina cada %.0fKm,"
				+ "\nvamos a hacer un viaje de %.0fKm y el precio de la gasolina \n"
				+ "está a %.2f€, en total hemos gastado %.2f€\n", consumos100Km, conv, kmViaje, precioGasolina, totGastado);
		System.out.println("\n|||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("|||||||||||||||||||Gracias y buen viaje||||||||||||||||||");
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

	}

}
