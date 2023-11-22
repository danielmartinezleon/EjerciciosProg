package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String aux;
		double espacio = 0, espacioInicial = 0, tiempo = 0, velocidad = 0;

		System.out.println("Bienvenido, vamos a calcular el espacio recorrido de un objeto");
		System.out.println("-----------------------------------------------------");
		System.out.println("¿Qué espacio inicial recorre?");
		aux = sc.nextLine();
		espacioInicial = Double.parseDouble(aux);
		System.out.println("¿A que velocidad va? (m/s)");
		aux = sc.nextLine();
		velocidad = Double.parseDouble(aux);
		System.out.println("¿Cuánto tiempo ha pasado? (segundos)");
		aux = sc.nextLine();
		tiempo = Double.parseDouble(aux);
		espacio = espacioInicial + (velocidad * tiempo);
		System.out.printf("Se ha desplazado %.2fm\n", espacio);
		System.out.println("-----------------------------------------------------");
		System.out.println("Gracias y buen día");

	}

}
