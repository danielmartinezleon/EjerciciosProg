package ejercicio10;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String aux;
		String peli1 = "John Wick 4";
		String peli2 = "The Creator";
		String peli3 = "The Ninja Turtles";
		String peli4 = "Avatar: El Sentido del agua";
		int opcion = 0, cantEntradas = 0;
		double pSalaVIP = 0, pSala3D = 0, pSalaNormal = 0, pSalaInfantil = 0, total = 0;
		System.out.println("Bienvenido al cine, comencemos por poner el precio de cada sala");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Precio para sala VIP:");
		aux=sc.nextLine();
		pSalaVIP=Double.parseDouble(aux);
		System.out.println("Precio para sala 3D:");
		aux=sc.nextLine();
		pSala3D=Double.parseDouble(aux);
		System.out.println("Precio para sala normal:");
		aux=sc.nextLine();
		pSalaNormal=Double.parseDouble(aux);
		System.out.println("Precio para sala infantil:");
		aux=sc.nextLine();
		pSalaInfantil=Double.parseDouble(aux);
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------");
		System.out.println("¿Para qué sala son las entradas?");
		System.out.println("1- Sala VIP ("+peli1+")");
		System.out.println("2- Sala Normal ("+peli2+")");
		System.out.println("3- Sala Infantil ("+peli3+")");
		System.out.println("4- Sala 3D ("+peli4+")");
		
		aux=sc.nextLine();
		opcion=Integer.parseInt(aux);
		
		switch (opcion) {
			
			case 1:
				System.out.println("Ha elegido "+peli1);
				System.out.println("¿Cuántas entradas quiere?");
				aux=sc.nextLine();
				cantEntradas=Integer.parseInt(aux);
				total=cantEntradas*pSalaVIP;
				System.out.printf("Total: %.2f€\n", total);
				break;
			case 2:
				System.out.println("Ha elegido "+peli2);
				System.out.println("¿Cuántas entradas quiere?");
				aux=sc.nextLine();
				cantEntradas=Integer.parseInt(aux);
				total=cantEntradas*pSalaNormal;
				System.out.printf("Total: %.2f€\n", total);
				break;
			case 3:
				System.out.println("Ha elegido "+peli3);
				System.out.println("¿Cuántas entradas quiere?");
				aux=sc.nextLine();
				cantEntradas=Integer.parseInt(aux);
				total=cantEntradas*pSalaInfantil;
				System.out.printf("Total: %.2f€\n", total);
				break;
			case 4:
				System.out.println("Ha elegido "+peli4);
				System.out.println("¿Cuántas entradas quiere?");
				aux=sc.nextLine();
				cantEntradas=Integer.parseInt(aux);
				total=cantEntradas*pSala3D;
				System.out.printf("Total: %.2f€\n", total);
				break;
	
			default:
				System.out.println("Sala no disponible");
				break;
		}
		System.out.println("Gracias y buen día");

	}

}
