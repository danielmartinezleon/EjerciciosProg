package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String aux;
		double dividendo = 0, divisor = 0, cociente = 0, cero = 0;
		System.out.println("Bienvenido, vamos a hacer una división");
		System.out.println("----------------------------------------");
		System.out.println("Diga el dividendo:");
		aux = sc.nextLine();
		dividendo = Double.parseDouble(aux);
		System.out.println("Diga el divisor:");
		aux = sc.nextLine();
		divisor = Double.parseDouble(aux);
		
		if (divisor==cero) {
			System.out.printf("ERROR, no se puede dividir entre %.0f\n", cero);
		}else {
			cociente = dividendo/divisor;
			System.out.printf("%.0f entre %.0f da %.2f\n", dividendo, divisor, cociente);
		}
		System.out.println("Gracias y buen día");

	}

}
