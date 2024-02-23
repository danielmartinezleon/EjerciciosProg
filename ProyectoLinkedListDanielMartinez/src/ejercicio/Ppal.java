package ejercicio;

import java.util.LinkedList;
import java.util.Scanner;

public class Ppal {

	public static void main(String[] args) {
		
		/*
		 * Vamos a usar la API LinkedList y vamos a gestionar una playlist de canciones
		 * por lo que las vamos a buscar por el nombre de la cancion, buscar las canciones
		 * del mismo artista, añadir una canción, añadirla en la posición deseada, añadir
		 * al principio y al final de la lista, escuchar una canción, escuchar la primera
		 * y la última, escuchar la primera y última y borrarlas después.
		 * */

		Scanner sc = new Scanner(System.in);
		String aux, artista, titulo;
		double duracion = 0;
		int opcion = 0;
		LinkedList<Cancion> lista = new LinkedList<>();
		Playlist playlist = new Playlist(lista);
		Cancion c;

		playlist.agregarCancion(new Cancion("Bad Bunny", "Efecto", 3.33));
		playlist.agregarCancion(new Cancion("Hugh Jackman, Zac Efron", "The Other Side", 3.34));
		playlist.agregarCancion(new Cancion("Lewis Capaldi", "Bruises", 3.40));
		playlist.agregarCancion(new Cancion("Lewis Capaldi", "Someone You Loved", 3.05));
		playlist.agregarCancion(new Cancion("Lewis Capaldi", "Before You Go", 3.35));

		System.out.println("Bienvenido a Spotify");
		do {
			System.out.println("-".repeat(30));
			System.out.println("¿Qué desea hacer?");
			System.out.println("-".repeat(30));
			System.out.println("""
					1. Mostrar lista
					2. Añadir canción
					3. Añadir canción al principio
					4. Añadir canción al final
					5. Añadir canción en una posición concreta
					6. Escuchar canción
					7. Escuchar primera
					8. Escuchar última
					9. Eliminar canción
					10. Eliminar primera
					11. Eliminar última
					12. Escuchar primera y después eliminarla
					13. Escuchar última y después eliminarla
					14. Ver todas las canciones de un artista
					0. Salir
					""");
			System.out.println("-".repeat(30));
			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);

			switch (opcion) {
			case 1:
				playlist.mostrarLista();
				break;

			case 2:
				System.out.println("Diga el nombre del artista: ");
				artista = sc.nextLine();
				System.out.println("Diga el titulo de la canción: ");
				titulo = sc.nextLine();
				System.out.println("Diga cuánto dura: ");
				aux = sc.nextLine();
				duracion = Double.parseDouble(aux);
				c = new Cancion(artista, titulo, duracion);
				playlist.agregarCancion(c);
				break;
				
			case 3:
				System.out.println("Diga el nombre del artista: ");
				artista = sc.nextLine();
				System.out.println("Diga el titulo de la canción: ");
				titulo = sc.nextLine();
				System.out.println("Diga cuánto dura: ");
				aux = sc.nextLine();
				duracion = Double.parseDouble(aux);
				c = new Cancion(artista, titulo, duracion);
				playlist.agregarAlPrincipio(c);
				break;
				
			case 4:
				System.out.println("Diga el nombre del artista: ");
				artista = sc.nextLine();
				System.out.println("Diga el titulo de la canción: ");
				titulo = sc.nextLine();
				System.out.println("Diga cuánto dura: ");
				aux = sc.nextLine();
				duracion = Double.parseDouble(aux);
				c = new Cancion(artista, titulo, duracion);
				playlist.agregarAlFinal(c);
				break;
				
			case 5:
				System.out.println("Diga el nombre del artista: ");
				artista = sc.nextLine();
				System.out.println("Diga el titulo de la canción: ");
				titulo = sc.nextLine();
				System.out.println("Diga cuánto dura: ");
				aux = sc.nextLine();
				duracion = Double.parseDouble(aux);
				c = new Cancion(artista, titulo, duracion);
				System.out.println("Diga la posición donde la desea agregar");
				aux=sc.nextLine();
				opcion = Integer.parseInt(aux);
				playlist.agregarConPosicion(opcion, c);
				break;
				
			case 6:
				System.out.println("Diga qué canción desea escuchar: ");
				playlist.mostrarLista();
				aux=sc.nextLine();
				opcion = Integer.parseInt(aux);
				playlist.escuchar(opcion);
				break;
				
			case 7:
				playlist.escucharPrimera();
				break;
				
			case 8:
				playlist.escucharUltima();
				break;
				
			case 9:
				System.out.println("Diga el titulo de la canción que desea eliminar: ");
				playlist.mostrarLista();
				titulo=sc.nextLine();
				playlist.eliminar(titulo);
				break;
				
			case 10:
				playlist.eliminarPrimera();
				break;
				
			case 11:
				playlist.eliminarUltima();
				break;
				
			case 12:
				playlist.escucharPrimeraYBorrar();
				break;
				
			case 13:
				playlist.escucharUltimaYBorrar();
				break;
				
			case 14:
				System.out.println("Diga de qué artista quiere ver las canciones: ");
				artista=sc.nextLine();
				playlist.mostrarDeUnArtista(artista);
				break;
				
			case 0:
				System.out.println("Saliendo...");
				break;

			default:
				System.out.println("Opción no disponible");
				break;
			}
		} while (opcion != 0);

	}

}
