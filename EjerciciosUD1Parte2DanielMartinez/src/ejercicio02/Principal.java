package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		String aux;
		int valor = 0, doble = 0, triple = 0, mult1 = 2, mult2 = 3;
		System.out.println("Bienvenido, hagamos el doble y triple de un "
				+ "valor");
		System.out.println("*********************************************************");
		aux=sc.nextLine();
		valor=Integer.parseInt(aux);
		doble=valor*mult1;
		triple=valor*mult2;
		System.out.printf("El doble de %d es %d, y el triple %d\n", valor, doble, triple);
		System.out.println("Gracias y buen día");

	}

}
