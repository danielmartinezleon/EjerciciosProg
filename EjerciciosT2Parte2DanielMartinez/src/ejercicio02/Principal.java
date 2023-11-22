package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String aux;
		int tam = 0, num = 0, doble = 2;
		int[] numeros;

		System.out.println("Bienvenido al array de números automáticos (el doble del índice)");
		System.out.println("-----------------------------------------------");
		System.out.println("¿Cuántos quiere generar?");
		aux = sc.nextLine();
		tam = Integer.parseInt(aux);
		numeros = new int[tam];

		for (int i = 0; i < numeros.length; i++) {
			num = (i + 1) * doble;
			numeros[i] = num;
		}

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("El doble de " + (i + 1) + " es " + numeros[i]);
		}
		System.out.println("-----------------------------------------------");
		System.out.println("Gracias y buen día");
	}

}
