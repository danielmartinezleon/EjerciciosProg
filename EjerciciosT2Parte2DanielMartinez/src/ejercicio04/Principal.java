package ejercicio04;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String aux;
		Random rnd = new Random(System.nanoTime());
		int hasta = 0, desde = 0, opcion = 0, suma = 0, tam = 0;
		double media = 0;
		int[] numeros;

		System.out.println("Bienvenido al array aleatorio");
		System.out.println("-----------------------------------");
		System.out.println("¿De qué tamaño quiere el array?");
		aux = sc.nextLine();
		tam = Integer.parseInt(aux);
		numeros = new int[tam];
		System.out.println("Mínimo número aleatorio:");
		aux = sc.nextLine();
		desde = Integer.parseInt(aux);
		System.out.println("Máximo número aleatorio:");
		aux = sc.nextLine();
		hasta = Integer.parseInt(aux);

		do {
			System.out.println("""
					¿Qué desea hacer?
					--------------------------------
					1- Rellenar array de aleatorios
					2- Ver número seleccionado
					3- Mostrar suma de todos
					4- Mostrar media
					0- Salir
					""");
			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);

			switch (opcion) {
			case 1:
				for (int i = 0; i < numeros.length; i++) {
					numeros[i] = rnd.nextInt(hasta - desde + 1) + desde;
				}
				System.out.println("Array rellenado satisfactoriamente\n");
				break;

			case 2:
				System.out.println("Diga el número que desea ver:");
				aux = sc.nextLine();
				opcion = Integer.parseInt(aux);
				System.out.println("El número es: " + numeros[opcion - 1]+"\n");
				break;

			case 3:
				for (int i = 0; i < numeros.length; i++) {
					suma += numeros[i];
				}
				System.out.println("La suma de todos los elementos del array es: " + suma+"\n");
				break;

			case 4:
				media = (double)suma / numeros.length;
				System.out.printf("La media del total es: %.2f\n\n", media);
				break;
				
			case 0:
				System.out.println("Saliendo...");
				break;

			default:
				System.out.println("Opción no disponible\n");
				break;
			}

			System.out.println("Pulse 0 para salir o cualquier número para continuar");
			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);
		} while (opcion != 0);

	}

}
