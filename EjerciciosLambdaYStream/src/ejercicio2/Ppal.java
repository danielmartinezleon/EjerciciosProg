package ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ppal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String aux;
		int opcion = 0;
		
		List<String> lista = new ArrayList<String>();
		lista.add("Daniel");
		lista.add("Pilar");
		lista.add("Angel");
		lista.add("Fran");
		lista.add("Candi");
		lista.add("Carlos");
		lista.add("Joaquin");
		
		Gestion g = new Gestion(lista);
		
		do {
			System.out.println("""
					1. Ordenar las cadenas por orden alfabético.
					2. Buscar una cadena dada por teclado.
					3. Crear un nuevo String formado por la primera letra de cada palabra que contiene la lista.
					4. Borrar las palabras que tengan longitud impar de letras.
					5. Pasar todas las palabras a mayúsculas
					0. Salir.
					""");
			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);
			
			switch (opcion) {
			case 1:
				System.out.println("Antes:");
				g.mostrarLista(g.getLista());
				System.out.println("\nDespues:");
				g.ordenarAlfabeticamente();
				g.mostrarLista(g.ordenarAlfabeticamente());
				break;
				
			case 2:
				System.out.println("Diga la palabra: ");
				aux = sc.nextLine();
				System.out.println(g.findByTexto(aux)+ " se ha encontrado");
				break;
				
			case 3:
				System.out.println(g.crearPalabra());
				break;
				
			case 4: 
				g.borrarImpares();
				g.mostrarLista(g.getLista());
				break;
				
			case 5:
				g.pasarAMayus();
				g.mostrarLista(g.getLista());
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
