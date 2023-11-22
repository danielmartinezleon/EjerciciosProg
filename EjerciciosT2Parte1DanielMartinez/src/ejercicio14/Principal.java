package ejercicio14;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String aux;
		int tope = 10, num = 0, resultsum = 0, result = 1, op = 0;
		System.out.println("Bienvenido al sumador y multiplicador de 10 números");
		System.out.println("-----------------------------------------------------");

		do {

			for (int i = 0; i < tope; i++) {
				System.out.println("Diga un número:");
				aux = sc.nextLine();
				num = Integer.parseInt(aux);
				resultsum += num;
				result *= num;
			}
			System.out.printf("La suma de los %d números es %d, y el producto %d\n", tope, resultsum, result);
			System.out.println("Quiere volver a hacerlo? ");
			System.out.println("Cualquier número - Si");
			System.out.println("0 - No");
			aux = sc.nextLine();
			op = Integer.parseInt(aux);
			
		} while (op != 0);
		System.out.println("-----------------------------------------------------");
		System.out.println("Adiós y buen día");
	}

}
