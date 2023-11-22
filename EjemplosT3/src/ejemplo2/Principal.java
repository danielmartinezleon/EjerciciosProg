package ejemplo2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String aux, nombre;
		double notaProg = 0, notaBD = 0;
		Alumno a1;

		System.out.println("Diga nombre: ");
		nombre = sc.nextLine();
		System.out.println("Diga nota programación: ");
		aux = sc.nextLine();
		notaProg = Double.parseDouble(aux);
		System.out.println("Diga nota base de datos: ");
		aux = sc.nextLine();
		notaBD = Double.parseDouble(aux);

		a1 = new Alumno(nombre, notaProg, notaBD);
		a1.imprimirMedia(a1.calcularMedia());

	}

}
