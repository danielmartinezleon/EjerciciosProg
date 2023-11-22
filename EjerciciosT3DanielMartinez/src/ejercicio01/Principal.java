package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String aux;
		String asignatura;
		String fecha;
		int aula = 0;
		Cabecera cab1;
		
		System.out.println("Bienbenido al creador de cabeceras para exámenes");
		System.out.println("************************************************");
		System.out.println("Diga la asignatura: ");
		asignatura=sc.nextLine();
		System.out.println("Diga la fecha (dd-mm-aaaa): ");
		fecha=sc.nextLine();
		System.out.println("Diga el número del aula: ");
		aux=sc.nextLine();
		aula=Integer.parseInt(aux);
		cab1=new Cabecera(asignatura, fecha, aula);
		cab1.imprimirCabecera();

	}

}
