package ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String aux;
		int num = 0;
		Operaciones op1 = new Operaciones();

		System.out.println("Bienvenido al comprobador de postivos y pares");
		System.out.println("***********************************************");
		System.out.println("Diga el número: ");
		aux = sc.nextLine();
		num = Integer.parseInt(aux);
		op1.comprobarPositivo(num);
		op1.comprobarPar(num);
		System.out.println("***********************************************");
		System.out.println("Gracias y buenos días");

	}

}
