package ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ppal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String aux;
		int opcion = 0;
		double duracion = 0;
        List<Cancion> lista = new ArrayList<Cancion>();

        lista.add(new Cancion("Cancion1", "Autor1", 4.5, "Pop"));
        lista.add(new Cancion("Cancion2", "Autor2", 3.8, "Rock"));
        lista.add(new Cancion("Cancion3", "Autor1", 5.2, "Pop"));
        lista.add(new Cancion("Cancion4", "Autor3", 2.9, "Pop"));
        lista.add(new Cancion("Cancion4", "Autor1", 2.9, "Rock"));
        
        Playlist p = new Playlist(lista);
        
        do {
        	System.out.println("\nMenú:");
            System.out.println("1. Buscar canción por nombre");
            System.out.println("2. Buscar canción por autor");
            System.out.println("3. Contar canciones de un género");
            System.out.println("4. Verificar que todas las canciones duran más de una duración dada");
            System.out.println("5. Calcular número de intérpretes distintos");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            
            aux=sc.nextLine();
            opcion=Integer.parseInt(aux);
            
            switch (opcion) {
			case 1:
				System.out.println("Diga el nombre de la canción:");
				aux=sc.nextLine();
				p.mostrarLista(p.findByNombre(aux));
				break;
				
			case 2:
				System.out.println("Diga el nombre del autor:");
				aux=sc.nextLine();
				p.mostrarLista(p.findByAutor(aux));
				break;
				
			case 3:
				System.out.println("Diga el género:");
				aux=sc.nextLine();
				System.out.println("De ese género hay "+p.contarCancionesPorGenero(aux)+" y son:");
				p.mostrarLista(p.findByGenero(aux));
				break;
				
			case 4:
				System.out.println("Diga la duración;");
				aux=sc.nextLine();
				duracion=Double.parseDouble(aux);
				p.mostrarLista(p.findByMayorDuracion(duracion));
				break;
				
			case 5:
				System.out.println("Hay "+p.contarInterpretesDistintos()+" intérpretes distintos");
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
