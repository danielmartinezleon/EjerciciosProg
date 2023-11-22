package ejercicio06;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String aux;
		int cantNotas = 3;
		double nota1 = 0, nota2 = 0, nota3 = 0, media = 0, limiteAprobado = 5;

		System.out.println("Vamos a ver la media de 3 notas");
		System.out.println("--------------------------------");
		System.out.println("Diga la primera nota:");
		aux = sc.nextLine();
		nota1 = Double.parseDouble(aux);
		System.out.println("Diga la segunda nota:");
		aux = sc.nextLine();
		nota2 = Double.parseDouble(aux);
		System.out.println("Diga la tercera nota:");
		aux = sc.nextLine();
		nota3 = Double.parseDouble(aux);
		media = (nota1 + nota2 + nota3) / cantNotas;
		
		if (media >= limiteAprobado) {
			System.out.printf("Tu media es %.2f. estas aprobado\n", media);
		}else {
			System.out.printf("Tu media es %.2f. estas suspenso\n", media);
		}
		System.out.println("--------------------------------");
		System.out.println("Gracias y buen día");

	}

}
