package ejemploswitch;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String aux;
		int opcion=0;
		System.out.printf("1-Buenos días\n2-Buenas tardes\n3-Buenas noches\n");
		aux = sc.nextLine();
		opcion = Integer.parseInt(aux);
		
		switch (opcion) {
			case 1: 
				System.out.println("Buenos días");
				break;
			case 2:
				System.out.println("Buenas tardes");
				break;
			case 3:
				System.out.println("Buenas noches");
				break;
			default:
				System.out.println("Opción no válida");
			
		}

	}

}
