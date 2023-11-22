package ejercicio05;

public class Principal {

	public static void main(String[] args) {

		double euroALibra = 1.15, euro = 50, libra = 27, libraAEuro = 0.87, totLibra = 0, totEuro = 0;
		System.out.println("Bienvenido a la aplicación de cambio de divisas");
		System.out.println("************************************************");
		totLibra = euro * libraAEuro;
		totEuro = libra * euroALibra;
		System.out.printf("En esta ocasión cambiaremos %.0f euros a libras y %.0f libras a euros\n", euro, libra);
		System.out.printf("Cambio:\n-%.0f euros en libras: %.2f £\n-%.0f libras en euros: %.2f €\n", euro, totLibra, libra, totEuro);
		System.out.println("Gracias y buen día");

	}

}
