package ejercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ppal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String aux;
		String palo;
		List<Carta> baraja = new ArrayList<Carta>();
		baraja.add(new Carta("As", "Oros", 1));
		baraja.add(new Carta("Tres", "Copas", 3));
		baraja.add(new Carta("Cuatro", "Bastos", 4));
		baraja.add(new Carta("Sota", "Bastos", 10));
		baraja.add(new Carta("Caballo", "Espadas", 11));
		baraja.add(new Carta("Rey", "Copas", 12));
		baraja.add(new Carta("Dos", "Oros", 2));
		Mazo m = new Mazo(baraja);
		int num = 0;
		int opcion = 0;

		System.out.println("Bienvenido a la Brisca en Java");

		do {
			System.out.println("-".repeat(40));
			System.out.println("""
					¿Qué desea hacer?
					----------------------------------------
					1- Buscar una carta
					2- Mostrar las que valen 0
					3- Calcular puntuación del mazo
					4- Modificar nombre de una carta
					5- Mostrar mazo
					6- Ordenar por palo
					7- Ordenar por puntuación
					0- Salir
					----------------------------------------
					""");
			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);
			switch (opcion) {
			case 1:
				System.out.println("Diga el número:");
				aux = sc.nextLine();
				num = Integer.parseInt(aux);
				System.out.println("Diga el palo:");
				palo = sc.nextLine();

				System.out.println(m.findByNumYPalo(num, palo));
				break;

			case 2:
				m.mostrarValorCero();
				break;

			case 3:
				System.out.println("El valor total es: " + m.calcularValorTotal());
				break;

			case 4:
				System.out.println("Diga el número:");
				aux = sc.nextLine();
				num = Integer.parseInt(aux);
				System.out.println("Diga el palo:");
				palo = sc.nextLine();
				System.out.println("Diga el nuevo nombre:");
				aux = sc.nextLine();
				m.modificarNombre(num, palo, aux);
				break;
				
			case 5:
				m.mostrarLista();
				break;
				
			case 6:
				Collections.sort(m.getBaraja());
				m.mostrarLista();
				break;
				
			case 7:
				Collections.sort(m.getBaraja(), new OrdenarPorPuntuacion());
				m.mostrarLista();
				break;
				
			case 0:
				System.out.println("Saliendo...");
				break;

			default:
				System.out.println("Opción no disponible");
				break;
			}
		} while (opcion != 0);
	}

}
