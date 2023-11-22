package ejercicio04;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String aux;
		double saldo = 3000, retirada = 0;
		System.out.println("Bienvenido a CaixaBank");
		System.out.println("--------------------------------");
		System.out.printf("Su saldo actual es %.2f€\n", saldo);
		System.out.println("¿Cuánto desea retirar?");
		aux = sc.nextLine();
		retirada = Double.parseDouble(aux);

		if (saldo < retirada) {
			System.out.println("Saldo insuficiente");
		} else {
			saldo -= retirada;
			System.out.printf("Su nuevo saldo es %.2f€\n", saldo);
		}
		System.out.println("Gracias y buen día");
	}

}
