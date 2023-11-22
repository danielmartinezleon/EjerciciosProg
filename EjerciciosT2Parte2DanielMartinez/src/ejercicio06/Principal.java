package ejercicio06;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String aux;
		int tam = 6;
		double desde = 0, hasta = 0;
		double[] sueldos = new double[tam];
		String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio" };
		Random rnd = new Random(System.nanoTime());

		System.out.println("¿Qué es lo mínimo que cobras?");
		aux = sc.nextLine();
		desde = Double.parseDouble(aux);
		System.out.println("¿Qué es lo máximo que cobras?");
		aux = sc.nextLine();
		hasta = Double.parseDouble(aux);

		for (int i = 0; i < sueldos.length; i++) {
			sueldos[i] = rnd.nextDouble(hasta - desde + 1) + desde;
		}
		
		for (int i = 0; i < meses.length; i++) {
			System.out.print(meses[i]+"\t\t");
		}
		System.out.println("\n---------------------------------------------------------------------------------------");
		
		for (int i = 0; i < sueldos.length; i++) {
			System.out.printf("%.2f€\t\t", sueldos[i]);
		}

	}

}
