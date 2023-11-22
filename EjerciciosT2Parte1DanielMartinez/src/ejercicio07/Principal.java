package ejercicio07;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String aux;
		int cantProd = 0, cien = 100;
		double precio = 0, porcen = 0, descuento = 0, subtotal = 0, total = 0;
		System.out.println("Bienvenido a la calculadora de descuentos");
		System.out.println("-------------------------------------------");
		System.out.println("Diga el precio del producto:");
		aux = sc.nextLine();
		precio = Double.parseDouble(aux);
		System.out.println("Diga la cantidad:");
		aux = sc.nextLine();
		cantProd = Integer.parseInt(aux);
		System.out.println("Diga el porcentaje de descuento:");
		aux = sc.nextLine();
		porcen = Double.parseDouble(aux);

		subtotal = precio * cantProd;

		if (subtotal > cien) {
			descuento = (subtotal * porcen) / cien;
			total = subtotal - descuento;
			System.out.printf("Su compra sería de %.2f€, pero tiene un %.0f%% de descuento,\n"
					+ "se le quedaría en %.2f€\n", subtotal, porcen, total);
		}else {
			total = subtotal;
			System.out.printf("Su compra sería de %.2f€, no tiene descuento así que ese es el total\n", total);
		}
		System.out.println("-------------------------------------------");
		System.out.println("Gracias y un buen día");

	}

}
