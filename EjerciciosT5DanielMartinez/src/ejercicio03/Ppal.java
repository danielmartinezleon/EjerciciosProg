package ejercicio03;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ppal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String aux;
		String nombre;
		String apellidos;
		int id = 0;
		double notaMedia = 0;
		int opcion = 0;
		Set<Alumno> listado = new HashSet<Alumno>();
		CrudAlumno ca = new CrudAlumno(listado);
		Curso cur = new Curso(ca);
		Alumno a;

		ca.agregarAlumno(new Alumno("Ángel", "Naranjo", 3, 9));
		ca.agregarAlumno(new Alumno("Daniel", "Martinez", 1, 8.5));
		ca.agregarAlumno(new Alumno("Paco", "Perez", 5, 6));

		do {
			System.out.println("""
					¿Qué desea hacer?
					------------------------------
					1- Mostrar lista de alumnos
					2- Mostrar un solo alumno
					3- Agregar alumno
					4- Eliminar alumno
					5- Editar media de un alumno
					6- Mostrar media del curso 
					7- Mostrar cantidad de suspensos
					8- Mostrar media de los suspensos
					0- Salir
					""");
			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);
			
			switch (opcion) {
			case 1:
				ca.mostrarLista();
				break;
				
			case 2:
				System.out.println("Diga el id del alumno que quiere ver:");
				aux=sc.nextLine();
				id=Integer.parseInt(aux);
				ca.mostrarAlumno(id);
				break;
				
			case 3:
				System.out.println("Diga el nombre:");
				nombre=sc.nextLine();
				System.out.println("Diga los apellidos:");
				apellidos=sc.nextLine();
				System.out.println("Diga el id que se le va a asignar:");
				aux=sc.nextLine();
				id=Integer.parseInt(aux);
				System.out.println("Diga cuál es su nota media:");
				aux=sc.nextLine();
				notaMedia=Double.parseDouble(aux);
				a= new Alumno(nombre, apellidos, id, notaMedia);
				ca.agregarAlumno(a);
				break;
				
			case 4:
				System.out.println("Diga el id del alumno que va a eliminar:");
				aux=sc.nextLine();
				id=Integer.parseInt(aux);
				ca.eliminarAlumno(id);
				break;
				
			case 5:
				System.out.println("Diga el id del alumno cuya media va a editar:");
				aux=sc.nextLine();
				id=Integer.parseInt(aux);
				System.out.println("Diga la nueva media:");
				aux=sc.nextLine();
				notaMedia = Double.parseDouble(aux);
				ca.editarNotaMedia(id, notaMedia);
				break;
				
			case 6:
				System.out.println("La media del curso es: "+cur.calcularMediaCurso());
				break;
				
			case 7:
				System.out.println("El total de suspensos es: "+cur.calcularTotSuspensos());
				break;
				
			case 8:
				System.out.println("La nota media de los suspensos es: "+cur.calcularMediaSuspensos());
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
