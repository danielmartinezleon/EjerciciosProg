package ejercicio2;

import java.util.Scanner;

public class Ppal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String aux;
		double celsius = 0;
		double fahrenheit = 0;
		int opcion = 0;
		boolean salir = false;

		do {
			try {
				System.out.println("Diga cuántos grados Celsius quiere pasar a Fahrenheit:");
				aux = sc.nextLine();
				celsius = Double.parseDouble(aux);
				if (celsius < -273) {
					throw new NoMenosDeMenos273("No puede haber temperaturas menores a -273 ºC");
				} else {
					fahrenheit = (celsius * 9 / 5) + 32;
				}

				System.out.println(celsius + " Celsius son " + fahrenheit + " Fahrenheit");
				System.out.println("-".repeat(30));
				System.out.println("Pulse cualquier número para volver a hacerlo o 0 para salir");
				aux = sc.nextLine();
				opcion = Integer.parseInt(aux);
				if (opcion == 0) {
					salir = true;
				}
			} catch (NumberFormatException e) {
				System.err.println("Error: Introduzca un número válido.");
			} catch (NoMenosDeMenos273 e) {
				System.err.println(e.getMessage());
			}
		} while (!salir);

		sc.close();
	}
}
