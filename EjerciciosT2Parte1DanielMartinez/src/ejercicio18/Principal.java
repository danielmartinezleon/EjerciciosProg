package ejercicio18;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String aux;
		int opcion=0;
		double saldo=0, reintegro=0, entradas=0, pEntradas=0, totEntradas=0, ingreso=0;
		
		System.out.println("¿Qué saldo inicial tiene?");
		aux=sc.nextLine();
		saldo=Double.parseDouble(aux);
		System.out.println("¿Qué precio tienen las entradas?");
		aux=sc.nextLine();
		pEntradas=Double.parseDouble(aux);
		
		System.out.println("Bienvenido al cajero automático");
		System.out.println("----------------------------------");
		do {
			System.out.println("¿Qué desea hacer?");
			System.out.println("----------------------------------");
			System.out.println("1- Ver saldo actual");
			System.out.println("2- Retirar dinero");
			System.out.println("3- Comprar entradas concierto ("+pEntradas+"€)");
			System.out.println("4- Ingresar dinero");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			switch (opcion) {
				case 1:
					System.out.printf("Su saldo actual es de %.2f€\n", saldo);
					break;
				case 2:
					System.out.println("¿Cuánto desea retirar?");
					aux=sc.nextLine();
					reintegro=Double.parseDouble(aux);
					saldo-=reintegro;
					System.out.printf("Su nuevo saldo es de %.2f€\n", saldo);
					break;
				case 3:
					System.out.println("¿Cuántas entradas desea comprar?");
					aux=sc.nextLine();
					entradas=Double.parseDouble(aux);
					totEntradas=entradas*pEntradas;
					saldo-=totEntradas;
					System.out.printf("Su saldo despues de comprar %.0f entradas es de %.2f€\n",entradas, saldo);
					break;
				case 4:
					System.out.println("¿Cuánto desea ingresar?");
					aux=sc.nextLine();
					ingreso=Double.parseDouble(aux);
					saldo+=ingreso;
					System.out.printf("Su nuevo saldo es de %.2f€\n", saldo);
					break;
				default:
					System.out.println("Opción no disponible");
			}
			System.out.println("----------------------------------");
			System.out.println("Si quiere realizar otra operación pulse cualquier número o pulse 0 para salir");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
		}while (opcion!=0);
		System.out.println("Gracias por usar el programa");
		

	}

}
