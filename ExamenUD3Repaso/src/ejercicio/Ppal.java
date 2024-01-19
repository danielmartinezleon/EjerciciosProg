package ejercicio;

import java.util.Scanner;

public class Ppal {

	public static void main(String[] args) {

		String aux;
		Scanner sc = new Scanner(System.in);
		String direccion;
		int metros2 = 0;
		int estado = 0;
		int id = 1;
		double precioVenta = 0;
		int tam = 10;
		int numVendedores = 4;
		int opcion = 0;
		Piso[] lista = new Piso[tam];
		Inmobiliaria inmo = new Inmobiliaria(lista, numVendedores);
		Piso p;

		System.out.println("Bienvenido a la inmobiliaria");
		System.out.println("-".repeat(30));
		do {
			System.out.println("¿Qué desea hacer?");
			System.out.println("1- agregar piso");
			
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch (opcion) {
			case 1:
				System.out.println("Diga dirección:");
				direccion=sc.nextLine();
				System.out.println("Diga metros cuadrados:");
				aux=sc.nextLine();
				metros2=Integer.parseInt(aux);
				System.out.println("""
						Diga estado:
						1- Nuevo
						2- Seminuevo
						3- A reformar
						""");
				aux=sc.nextLine();
				estado=Integer.parseInt(aux);
				System.out.println("Diga precio de venta:");
				aux=sc.nextLine();
				precioVenta=Double.parseDouble(aux);
				p = new Piso(direccion, metros2, estado, id, precioVenta);
				inmo.agregar(p);
				id++;
				System.out.println();
				inmo.mostrarLista(lista);
				
				break;
				
			case 2:
				
				break;

			default:
				break;
			}
		} while (opcion != 0);

	}

}
