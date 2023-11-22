package ejercicio09;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String aux;

		int dia = 0, cant = 0, miercoles = 1, cien = 100;
		double precio = 0, descuento = 0, totDescuento = 0, subtotal = 0, total = 0;
		System.out.println("Bienvenido al cine");
		System.out.println("--------------------");
		System.out.println("¿Cuánto cuesta la entrada?");
		aux = sc.nextLine();
		precio = Double.parseDouble(aux);
		System.out.println("¿Cuántas quiere?");
		aux = sc.nextLine();
		cant = Integer.parseInt(aux);
		System.out.println("¿Qué porcentaje de descuento hay el día del espectador?");
		aux = sc.nextLine();
		descuento = Double.parseDouble(aux);
		System.out.println("¿Hoy es miércoles? \n" + "1-Si\n" + "Cualquier otro-No");
		aux = sc.nextLine();
		dia = Integer.parseInt(aux);
		if (dia == miercoles) {
			subtotal = precio * cant;
			totDescuento = (subtotal * descuento) / cien;
			total = subtotal - totDescuento;
			System.out.printf("Hoy es el día del espectador, hay un %.0f%% de descuento,\n"
					+ "se te queda en %.0f€\n", descuento, total);
		}else {
			total = precio*cant;
			System.out.printf("Hoy no es el día del espectador, se te queda en %.0f€\n", total);
		}
		System.out.println("--------------------");
		System.out.println("Gracias y buen día");
		

	}

}
