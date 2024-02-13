package ejercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ppal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String aux;
		String nombre;
		String apellidos;
		String dni;
		double cuota = 0;
		List<Socio> listado = new ArrayList<>();
		Socio s;
		Club club = new Club(listado);
		int opcion = 0;

		listado.add(new Socio("Daniel", "Martínez", "53769410X", 100));
		listado.add(new Socio("Ángel", "Naranjo", "123456789A", 80));

		System.out.println("BIENVENIDO AL CLUB DE CAMPO");
		do {
			System.out.println("""
					¿Qué desea hacer?
					1- Añadir un socio 
					2- Buscar a un socio 
					3- Mostrar lista de socios
					4- Editar cuota de un socio
					5- Eliminar a un socio
					0- Salir
					""");
			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);
			switch (opcion) {
			case 1:
				System.out.println("¿Cuál es su nombre?");
				nombre=sc.nextLine();
				System.out.println("¿Cuáles son sus apellidos?");
				apellidos=sc.nextLine();
				System.out.println("¿Cuál es su DNI?");
				dni= sc.nextLine();
				System.out.println("¿Cuál es su cuota?");
				aux=sc.nextLine();
				cuota=Double.parseDouble(aux);
				s = new Socio(nombre, apellidos, dni, cuota);
				club.agregar(s);
				break;
				
			case 2:
				System.out.println("Diga el DNI del socio a buscar:");
				dni=sc.nextLine();
				club.mostrarSocio(dni);
				break;
				
			case 3:
				club.mostrarListado();
				break;
				
			case 4:
				System.out.println("Diga el DNI del socio cuya cuota va a cambiar:");
				dni=sc.nextLine();
				System.out.println("Diga su nueva cuota:");
				aux=sc.nextLine();
				cuota=Double.parseDouble(aux);
				club.editarCuota(dni, cuota);
				break;
				
			case 5:
				System.out.println("Diga el DNI del socio a eliminar:");
				dni=sc.nextLine();
				club.eliminarSocio(dni);
				break;
				
			case 0:
				System.out.println("Saliendo...");
				break;
				
			default:
				System.out.println("Opción no disponible");
				break;
			}
		} while (opcion != 0);
		System.out.println("-".repeat(70));
		System.out.println("Gracias por usar el programa :)");

	}

}
