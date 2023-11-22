package ejemplo1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String aux;
		String nombre;
		String calle;
		int edad = 0;
		double notaMedia = 0;
		Alumno a1;
		
		System.out.println("Diga nombre");
		nombre=sc.nextLine();
		System.out.println("Diga edad");
		aux=sc.nextLine();
		edad=Integer.parseInt(aux);
		System.out.println("Diga nota media");
		aux=sc.nextLine();
		notaMedia=Double.parseDouble(aux);
		System.out.println("Diga su calle");
		calle=sc.nextLine();

		a1 = new Alumno(nombre, edad, notaMedia);
		
		a1.mostrarDatos(calle);

	}

}
