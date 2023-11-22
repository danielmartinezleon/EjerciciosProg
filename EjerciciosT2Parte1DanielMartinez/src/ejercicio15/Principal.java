package ejercicio15;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String alumno, aux;
		int suspensas=0, contador=0, asignaturas=6, diez=10, cinco=5;
		double nota=0, sumaNotas=0, media = 0;
		
		System.out.println("Bienvenido al calculador de medias");
		System.out.println("***************************************************");
		System.out.println("¿Cómo se llama el alumno?");
		alumno=sc.nextLine();
		do {
			System.out.println("Diga la nota");
			aux=sc.nextLine();
			nota=Double.parseDouble(aux);
			if(nota<=diez) {
				if (nota<cinco) {
					suspensas++;
				}
				
			sumaNotas+=nota;
			contador++;
		}else {
			System.out.println("La nota debe ser menor o igual a 10, pruebe de nuevo");
		}

	}while (contador<asignaturas);
	media=sumaNotas/contador;
	
	System.out.printf("La media de %s es de %.2f, y tiene %d suspensas\n", alumno, media, suspensas);
	System.out.println("***************************************************");
	System.out.println("Gracias y buen día");

}
}