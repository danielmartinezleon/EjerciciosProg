package ejercicio13;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String aux;
		int num = 0, opcion = 0, tope = 10, multiplicador = 1, result = 0;

		System.out.println("Bienvenido al programa de tablas de multiplicar");
		System.out.println("------------------------------------------------");
		do {
			multiplicador = 0;
			System.out.println("¿De qué número quiere hacer la tabla de multiplicar?");
			aux = sc.nextLine();
			num = Integer.parseInt(aux);

			while (multiplicador <= tope) {
				result = num * multiplicador;
				System.out.printf("%d x %d = %d\n", num, multiplicador, result);
				multiplicador++;
			}
			System.out.println("Pulse 0 para salir o cualquier número para hacer otra");
			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);

		} while (opcion != 0);
		System.out.println("------------------------------------------------");
		System.out.println("Gracias y buen día");

	}

}
