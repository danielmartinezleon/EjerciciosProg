package ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ppal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String aux;
		String nombre;
		String apellidos;
		int opcion = 0;

		List<Alumno> lista = new ArrayList<Alumno>();

		lista.add(new Alumno("Pilar", "Aguilar", "1DAM", 9.1, 25));
		lista.add(new Alumno("Daniel", "Martinez", "1DAM", 9.4, 24));
		lista.add(new Alumno("Marisa", "Lozano", "1DAM", 3.4, 35));
		lista.add(new Alumno("Antonio", "Luque", "1AYF", 4, 27));
		lista.add(new Alumno("Fran", "Sanchez", "1COM", 8, 18));

		Secretaria s = new Secretaria(lista);

		do {
			System.out.println("""
					1. Obtener todos los alumnos de la lista usando filter.
					2. Mostrar todos los alumnos imprimiéndolos con forEach ().
					3. Imprimir todos los alumnos cuyo nombre empiece con una letra determinada (puede ser leída por teclado).
					4. Dar el tamaño de la lista usando count ().
					5. Obtener los alumnos con nota media mayor de 9 en el curso 1DAM.
					6. Imprimir los 3 primeros alumnos de la lista usando limit ().
					7. Obtener el alumno de menor edad.
					8. Obtener el primer alumno de la lista con findFirst().
					9. Obtener una nueva lista con los alumnos cuya longitud de la cadena de su nombre sea mayor a 10 letras.
					10. Obtener los alumnos que empiecen por la letra A y la longitud de su nombre sea menor o igual a 6.
					0. Salir.
					""");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch (opcion) {
			case 1:
				System.out.println("Diga nombre:");
				nombre=sc.nextLine();
				System.out.println("Diga apellido:");
				apellidos=sc.nextLine();
				System.out.println(s.findNombreYApellidos(nombre, apellidos));
				break;
				
			case 2:
				s.mostrarLista(s.getLista());
				break;
				
			case 3:
				System.out.println("Diga la inicial:");
				aux=sc.nextLine();
				s.mostrarLista(s.calcularListaConInicial(aux));
				break;
				
			case 4:
				System.out.println(s.calcularTamLista());
				break;
				
			case 5:
				s.mostrarLista(s.calcularMedia9DAM());
				break;
				
			case 6:
				System.out.println("Dime cuantos quieres ver:");
				aux=sc.nextLine();
				opcion=Integer.parseInt(aux);
				s.mostrarLista(s.devolver3Primeros(opcion));
				break;
				
			case 7:
				System.out.println(s.devolverMasJoven());
				break;
				
			case 8:
				System.out.println(s.devolverPrimero());
				break;
				
			case 9:
				System.out.println(s.devolverNombresMasDe10());
				break;
				
			case 10:
				System.out.println(s.devolverInicAYLong6OMenos());
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
