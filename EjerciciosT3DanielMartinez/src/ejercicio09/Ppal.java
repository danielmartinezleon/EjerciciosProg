package ejercicio09;

import java.util.Random;
import java.util.Scanner;

public class Ppal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String aux;
		Random rnd = new Random(System.nanoTime());
		int opcion = 0, hasta = 9, desde = 0, cupon = 0, tam = 5;
		int [] cuponUsuario = new int [tam];
		int [] cuponGanador = new int [tam];
		Loteria lt= new Loteria(cuponUsuario, cuponGanador);

		do {
			
		
		System.out.println("""
				Bienvenido a la lotería ¿Qué desea hacer?
				-----------------------------------------------
				1- Elegir mi cupón
				2- Comprar un cupón aleatorio
				3- Hacer sorteo y comprobar ganador
				0- Salir
				""");
		aux = sc.nextLine();
		opcion = Integer.parseInt(aux);
		
		switch (opcion) {
		case 1:
			System.out.println("Diga los números de su cupón: ");
			for (int i = 0; i < cuponUsuario.length; i++) {
			    aux = sc.nextLine();
			    cupon = Integer.parseInt(aux);
			    cuponUsuario[i] = cupon;
			}
			lt.crearCupon(cuponUsuario);
			break;
		case 2:
			lt.generarCuponUsuario(desde, hasta);
			System.out.println("Cupón comprado");
			break;
		case 3:
			lt.generarCuponGanador(desde, hasta);
			lt.comprobarGanador();
			lt.imprimirGanador();
			break;
			
		case 0:
			System.out.println("Saliendo del programa...");
			break;

		default:
			System.out.println("Opción no disponible");
			break;
		}
		}while(opcion!=0);
		System.out.println("-----------------------------------------------");
		System.out.println("Gracias por usar el programa");

	}

}
