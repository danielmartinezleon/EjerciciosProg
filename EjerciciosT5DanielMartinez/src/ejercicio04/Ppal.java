package ejercicio04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ppal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String aux;
		String nombre;
		int telefono = 0;
		int opcion = 0;
		Map<Contacto, Integer> listado= new HashMap<>();
		
		Agenda a = new Agenda(listado);
		
		a.agregar(new Contacto("Daniel", 637651990), 637651990);
		a.agregar(new Contacto("Angel", 656123456), 656123456);
		a.agregar(new Contacto("Luismi", 678909888), 678909888);
		
		System.out.println("Bienvenido a la agenda telefónica");
		do {
			System.out.println("""
					¿Qué desea hacer?
					------------------
					1- Mostrar lista
					2- Añadir contacto
					3- Editar nombre contacto
					4- Eliminar contacto
					5- Mostrar un contacto
					0- Salir
					""");
			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);
			
			switch (opcion) {
			case 1:
				a.imprimirAgenda();
				break;
				
			case 2:
				System.out.println("Diga el nombre:");
				nombre=sc.nextLine();
				System.out.println("Diga el teléfono:");
				aux=sc.nextLine();
				telefono=Integer.parseInt(aux);
				a.agregar(new Contacto(nombre, telefono), telefono);
				break;
				
			case 3:
				System.out.println("Diga a quien le quiere cambiar el nombre:");
				nombre= sc.nextLine();
				System.out.println("Diga el nuevo nombre:");
				aux = sc.nextLine();
				a.editarNombre(nombre, aux);
				break;
				
			case 4:
				System.out.println("Diga el contacto que desea eliminar:");
				nombre=sc.nextLine();
				a.eliminarContacto(nombre);
				break;
				
			case 5:
				System.out.println("Diga el nombre del contacto que desea mostrar:");
				nombre=sc.nextLine();
				a.imprimirUnContacto(nombre);
				break;
				
			case 0:
				System.out.println("Saliendo...");
				break;

			default:
				System.out.println("Opcion no disponible");
				break;
			}
			
		} while (opcion != 0);

	}

}
