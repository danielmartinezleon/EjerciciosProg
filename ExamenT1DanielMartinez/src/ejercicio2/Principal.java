package ejercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String aux;
		int repros = 0, semanasTop5 = 0, artistas = 0, likes = 0, cien = 100;
		double pagoSemTop5 = 0, pagoXRepro = 0.004, porcenLikes = 0,
				totTop5 = 0, totRepro = 0, totLikes = 0, total = 0, totXArtista = 0,
				iphone = 3000, totPostIphone = 0;
		System.out.println("Bienvenido, vamos a calcular cuantos ingresos ha generado una \n"
				+ "canción en Spotify");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("¿Cuántas reproducciones tiene?");
		aux=sc.nextLine();
		repros=Integer.parseInt(aux);
		System.out.println("¿Cuántas semanas ha estado en el TOP 5?");
		aux=sc.nextLine();
		semanasTop5=Integer.parseInt(aux);
		System.out.println("¿Cuánto se paga por semana en el TOP 5?");
		aux=sc.nextLine();
		pagoSemTop5=Double.parseDouble(aux);
		System.out.println("¿De cuántos artistas se compone?");
		aux=sc.nextLine();
		artistas=Integer.parseInt(aux);
		System.out.println("¿Cuántos likes tiene?");
		aux=sc.nextLine();
		likes=Integer.parseInt(aux);
		System.out.println("¿Qué porcentaje de likes se paga en dólares?");
		aux=sc.nextLine();
		porcenLikes=Double.parseDouble(aux);
		totRepro=repros*pagoXRepro;
		totTop5=semanasTop5*pagoSemTop5;
		totLikes=(likes*porcenLikes)/cien;
		total=totRepro+totTop5+totLikes;
		
		System.out.println("\tCONCEPTO\t||\tSUBTOTAL\t||");
		System.out.println("--------------------------------------------------------");
		System.out.printf("Total generado "
				+ "\npor reproducciones\t||\t%.2f$\n\n"
				+ "Total generado\npor TOP 5\t\t||\t%.2f$\n\n"
				+ "Total generado\npor likes\t\t||\t%.2f$\n"
				+ "\t\t\t\t\t\t\tTOTAL: %.2f$\n", totRepro, totTop5, totLikes, total);
		System.out.println("--------------------------------------------------------");
		totXArtista=total/artistas;
		System.out.printf("Cada artista ganará %.2f$\n", totXArtista);
		totPostIphone=totXArtista-iphone;
		System.out.printf("Si se comprase alguno el iPhone de oro, le quedarían %.2f$\n", totPostIphone);
		System.out.println("--------------------------------------------------------");
		System.out.println("Gracias y buen día");

	}

}
