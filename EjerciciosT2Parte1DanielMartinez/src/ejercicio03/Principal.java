package ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String aux;
		int num1 = 0, par = 2, cero = 0;

		System.out.println("Bienvenido a la calculadora de pares");
		System.out.println("**************************************");
		System.out.println("Diga el primer número:");
		aux = sc.nextLine();
		num1 = Integer.parseInt(aux);

		if (num1 % par == cero) {
			System.out.println("Es par");
		}else {
			System.out.println("Es impar");
		}
		System.out.println("Gracias y buen día");
	}

}
