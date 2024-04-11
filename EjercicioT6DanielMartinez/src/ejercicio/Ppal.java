package ejercicio;

import java.util.Scanner;

public class Ppal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String aux;
		double recaudacion = 0;
		int operaciones = 0;
		int opcion = 0;
		boolean acabar = false;
		Caja c = new Caja(4760.5);
		
		
		do {
			try {
				System.out.println("Diga el código para activar la caja");
				aux = sc.nextLine();
				c.logearCodigo(aux);
				
				System.out.println("Diga el total recaudado:");
				aux = sc.nextLine();
				recaudacion = Double.parseDouble(aux);
				c.comprobarRecaudacion(recaudacion);
				
				System.out.println("Diga cuántas operaciones se han hecho:");
				aux = sc.nextLine();
				operaciones = Integer.parseInt(aux);
				c.comprobarOperaciones(opcion);
				
				System.out.println("Pulse cualquier número para hacerlo otra vez o 0 para salir");
				aux = sc.nextLine();
				opcion = Integer.parseInt(aux);
				if (opcion == 0) {
					acabar = true;
				}
				
				
			} catch (WorkerCodeException e) {
				System.err.println(e.getMessage());
			} catch (CashException e) {
				System.err.println(e.getMessage());
			} catch (TotalOperationsException e) {
				System.err.println(e.getMessage());
			}
		} while (!acabar);
		

	}

}
