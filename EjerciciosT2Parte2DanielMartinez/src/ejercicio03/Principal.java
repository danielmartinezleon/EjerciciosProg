package ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String aux;
		int tam = 0, cero = 0, cantCero = 0, total = 0;
		double media = 0;
		int[] numeros;

		System.out.println("Bienvenido al array de números leidos por teclado");
		System.out.println("--------------------------------------------------");
		System.out.println("¿Cuántos números serán?");
		aux = sc.nextLine();
		tam = Integer.parseInt(aux);
		numeros = new int[tam];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Diga el número " + (i + 1) + ":");
			aux = sc.nextLine();
			numeros[i] = Integer.parseInt(aux);
			total += numeros[i];

			if (numeros[i] == cero) {
				cantCero++;
			}
		}

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("-Número " + (i+1)+": "+numeros[i]);
		}
		media = (double)total / numeros.length;
		System.out.printf("La media es %.2f\n", media);
		System.out.println("Hay " + cantCero + " ceros");
		System.out.println("--------------------------------------------------");
		System.out.println("Gracias y buen día");
	}

}
