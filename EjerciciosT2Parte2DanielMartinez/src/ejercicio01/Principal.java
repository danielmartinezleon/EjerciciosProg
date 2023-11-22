package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String aux;
		int tam = 0;
		String[] nombres;

		System.out.println("Hola, vamos a hacer un array de nombres");
		System.out.println("----------------------------------------");
		System.out.println("¿Cuántos nombres quieres guardar?");
		aux = sc.nextLine();
		tam = Integer.parseInt(aux);
		nombres = new String[tam];

		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Diga el nombre " + (i + 1) + ":");
			nombres[i] = sc.nextLine();
		}

		System.out.println("Los nombres guardados son:");

		for (int i = 0; i < nombres.length; i++) {
			System.out.println("-" + nombres[i]);
		}
		System.out.println("----------------------------------------");
		System.out.println("Gracias y buen día");
	}

}
