package ejercicio1;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		int desde = 0, hasta = 0, tam = 8, opcion = 0, cero = 0, total = 0, 
				mil = 1000, menosDeMil = 0, totalAndalucia = 2500000, cien = 100, 
				suma = 0, mayor = 0;
		double porcen = 0, media = 0;
		int[] votos = new int[tam];
		String[] provincias = { "Sevilla", "Huelva", "Granada", "Jaén", "Córdoba", "Málaga", "Cádiz", "Almeria" };
		String partido = "Programadores Reunidos Independientes Nacionales y Territoriales";
		Scanner sc = new Scanner(System.in);
		String aux;
		Random rnd = new Random(System.nanoTime());

		System.out.println("Bienvenido al programa de votos de " + partido);
		System.out.println(
				"----------------------------------------------------------------------------------------");
		do {
			System.out.println("""
					\n¿Qué desea hacer?
					---------------------------
					1- Generar votos
					2- Mostrar votos por provincia
					3- Mostrar total de votos
					4- Mostrar provincias con menos de mil votos
					5- Mostrar porcentaje de votos
					6- Sumar votos a provincia
					7- Media de votos
					8- Provincia con más votos
					0- Salir
					""");
			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);

			switch (opcion) {
			case 1:
				System.out.println("¿Cuál es el mínimo de votos?");
				aux = sc.nextLine();
				desde = Integer.parseInt(aux);
				System.out.println("¿Cuál es el máximo de votos?");
				aux = sc.nextLine();
				hasta = Integer.parseInt(aux);

				for (int i = 0; i < votos.length; i++) {
					votos[i] = rnd.nextInt(hasta - desde + 1) + desde;
				}
				System.out.println("Votación generada correctamente");
				break;

			case 2:
				for (int i = 0; i < provincias.length; i++) {
					System.out.print(provincias[i] + "\t\t");
				}
				System.out.println(
						"\n-------------------------------------------------------------------------------------------------------------------------------------");
				for (int i = 0; i < votos.length; i++) {
					System.out.print(votos[i] + "\t\t");
				}
				System.out.println();
				break;

			case 3:
				total = 0;
				for (int i = 0; i < votos.length; i++) {
					total+=votos[i];
				}
				System.out.printf("El total de votos es %d\n", total);
				break;
				
			case 4:
				for (int i = 0; i < votos.length; i++) {
					if (votos[i] < mil) {
						menosDeMil++;
					}
				}
				System.out.printf("Ha habido %d provincias con menos de %d votos\n", menosDeMil, mil);
				break;
				
			case 5:
				porcen = (double)(total * cien) / totalAndalucia;
				System.out.printf("El porcentaje de votos de los %d votantes andaluces para %s es de: %.2f%%\n", totalAndalucia, partido, porcen);
				break;
				
			case 6:
				System.out.println("Diga a que provincia quiere sumar votos:");
				for (int i = 0; i < provincias.length; i++) {
					System.out.println((i+1)+" - "+provincias[i]);
				}
				aux = sc.nextLine();
				opcion = Integer.parseInt(aux);
				System.out.println("¿Cuántos votos quieres sumarle?");
				aux = sc.nextLine();
				suma = Integer.parseInt(aux);
				
				votos[opcion-1]+=suma;
				
				System.out.println("De acuerdo, la votación quedaría así:");
				for (int i = 0; i < provincias.length; i++) {
					System.out.print(provincias[i] + "\t\t");
				}
				System.out.println(
						"\n-------------------------------------------------------------------------------------------------------------------------------------");
				for (int i = 0; i < votos.length; i++) {
					System.out.print(votos[i] + "\t\t");
				}
				System.out.println();
				
				break;
				
			case 7:
				total = cero;
				for (int i = 0; i < votos.length; i++) {
					total+=votos[i];
				}
				media = (double)total / votos.length;
				System.out.printf("La media por provincia es de %.2f votos\n", media);
				break;
				
			case 8:
				for (int i = 0; i < votos.length; i++) {
					if (i == 0) {
						mayor = votos[i];
					}
					
					if (mayor < votos[i]) {
						mayor = votos[i];
					}
				}
				System.out.printf("La provincia más votada tiene: %d votos\n", mayor);
				break;
				
			case 0:
				System.out.println("Saliendo...");
				break;

			default:
				System.out.println("Opción no disponible");
				break;
			}
		} while (opcion != cero);

	}

}
