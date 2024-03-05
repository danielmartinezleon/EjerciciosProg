package ejercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ppal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String aux, nombreIngles, significado;
		int id = 0, opcion = 0;
		
		List<Palabra> lista = new ArrayList<Palabra>();
		Palabra p1;
		Diccionario d1 = new Diccionario(lista);
		d1.agregar(new Palabra(1, "For", "Por, Para, Durante"));
		d1.agregar(new Palabra(2, "Apple", "Manzana"));
		d1.agregar(new Palabra(3, "Car", "Coche"));
		
		System.out.println("Bienvendo al diccionario de inglés");
		
		do {
			System.out.println("-".repeat(30));
			System.out.println("""
					¿Qué desea hacer?
					------------------------------
					1- Imprimir diccionario
					2- Buscar una palabra
					3- Agregar palabra
					4- Modificar significado 
					5- Ordenar a la inversa
					6- Borrar una palabra
					0- Salir
					""");
			System.out.println("-".repeat(30));
			aux=sc.nextLine();
			opcion= Integer.parseInt(aux);
			switch (opcion) {
			case 1:
				d1.imprimirLista();
				break;
				
			case 2:
				System.out.println("¿Qué palabra desea buscar?");
				nombreIngles = sc.nextLine();
				System.out.println(d1.findByNombre(nombreIngles));
				break;
				
			case 3:
				System.out.println("Diga el id de la palabra:");
				aux=sc.nextLine();
				id=Integer.parseInt(aux);
				System.out.println("Diga el nombre en inglés de la palabra:");
				nombreIngles=sc.nextLine();
				System.out.println("Diga el significado de la palabra:");
				significado=sc.nextLine();
				p1= new Palabra(id, nombreIngles, significado);
				d1.agregar(p1);
				break;
				
			case 4:
				System.out.println("Diga la palabra a la que va a cambiar el significado:");
				nombreIngles=sc.nextLine();
				System.out.println("Diga su nuevo significado:");
				significado=sc.nextLine();
				d1.modificarSignificado(nombreIngles, significado);
				break;
				
			case 5:
				Collections.sort(d1.getListado(), new OrdenarPorNombreInverso());
				d1.imprimirLista();
				break;
				
			case 6:
				System.out.println("Diga la palabra que desea eliminar:");
				nombreIngles=sc.nextLine();
				d1.eliminarPalabra(nombreIngles);
				break;
				
			case 0:
				System.out.println("Saliendo...");
				break;

			default:
				System.out.println("Opción no disponible");
				break;
			}
			
		} while (opcion != 0);
		System.out.println("Gracias por usar el programa :)");

	}

}
