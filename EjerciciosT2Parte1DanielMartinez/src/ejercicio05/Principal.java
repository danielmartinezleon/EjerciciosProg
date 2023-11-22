package ejercicio05;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String aux;
		double num = 0, exponente = 0, res = 0, cero = 0, uno = 1, expPosi = 0, menosUno = -1,
				resulDec = 0;

		System.out.println("Bienvenido a la calculadora de potencias");
		System.out.println("*****************************************");
		System.out.println("Dime el número:");
		aux = sc.nextLine();
		num = Double.parseDouble(aux);
		System.out.println("Dime el exponente:");
		aux = sc.nextLine();
		exponente = Double.parseDouble(aux);

		if (exponente == cero) {
			res = 1;
			System.out.printf("El resultado es %.0f\n");
		} else if (exponente < cero) {
			expPosi = exponente * menosUno;
			res = Math.pow(num, expPosi);
			resulDec = uno / res;
			System.out.printf("El resultado es %.0f/%.0f, o %.2f\n", uno, res, resulDec);
		}else {
			res = Math.pow(num, exponente);
			System.out.printf("El resultado es %.0f\n", res);
		}
		System.out.println("Gracias y buen día");
	}

}
