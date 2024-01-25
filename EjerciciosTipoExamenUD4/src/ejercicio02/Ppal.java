package ejercicio02;

import java.util.Scanner;

public class Ppal {

	public static void main(String[] args) {

		String aux;
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		double porcentaje = 15;
		int cantidad = 0;
		double pago= 0;

		Producto p1 = new Movil(1, 150, 4, "Redmi 10", 0);
		Producto p2 = new Movil(2, 250, 6, "Redmi Note 11", 0);
		Producto p3 = new Espada(3, 300, 2, "Roja", 0, "doble");

		Producto[] lista = new Producto[] { p1, p2, p3 };

		Ventas v1 = new Ventas(lista);

		System.out.println("""
				1. Ver total sin vender
				2. Añadir a la cesta
				3. Pagar
				""");
		do {
			System.out.println(v1.calcularTotalSinVender());
			System.out.println("que producto compra: ");
			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);
			System.out.println("cuantas: ");
			aux = sc.nextLine();
			cantidad = Integer.parseInt(aux);
			
			System.out.println(lista[opcion-1]);
			v1.comprarProducto(opcion, cantidad, porcentaje);
			System.out.println(lista[opcion-1]);
			System.out.println(v1.getTotalRecaudado());
			System.out.println("cuanto dinero paga: ");
			aux=sc.nextLine();
			pago=Double.parseDouble(aux);
			System.out.printf("su vuelta es %.2f€", v1.pagar(v1.getTotalRecaudado(), pago));
		} while (opcion!=0);
		
		

	}

}
