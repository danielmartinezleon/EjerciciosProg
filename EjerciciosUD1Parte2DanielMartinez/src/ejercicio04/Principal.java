package ejercicio04;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String aux;
		int edad = 0, diasXAnio = 365, tot = 0;
		System.out.println("Bienvenido, pasemos tus años a días");
		System.out.println("--------------------------------------");
		System.out.println("¿Cuántos años tienes?");
		aux = sc.nextLine();
		edad = Integer.parseInt(aux);
		tot = edad * diasXAnio;
		System.out.printf("Si tienes %d años, tienes %d dias\n", edad, tot);
		System.out.println("Buen día y gracias");

	}

}
