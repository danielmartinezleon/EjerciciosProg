package ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String aux;
		double millasM = 0, conv = 1852, tot = 0;

		System.out.println("Bienvenido ¿Cuántas millas marinas quiere pasar a metros?");
		System.out.println("-----------------------------------------------------------");
		aux = sc.nextLine();
		millasM = Double.parseDouble(aux);
		tot = millasM * conv;
		System.out.printf("%.2f millas marinas serían %.2fm\n", millasM, tot);
		System.out.println("Gracias y que vaya bien");

	}

}
