package Ejemplo1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String aux;
		int num1 = 0, num2 = 0, tope = 5;
		System.out.println("Diga número 1");
		aux = sc.nextLine();
		num1 = Integer.parseInt(aux);
		/*System.out.println("Diga número 2");
		aux = sc.nextLine();
		num2 = Integer.parseInt(aux);*/
		
		if (num1>=tope) {
			System.out.println("Aprobado");
		}else {
			System.out.println("Suspendido");
		}
		System.out.println("Nos vemos");

	}

}
