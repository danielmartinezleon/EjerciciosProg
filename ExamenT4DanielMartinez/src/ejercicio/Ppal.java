package ejercicio;

import java.util.Scanner;

public class Ppal {

	public static void main(String[] args) {
		
		String aux;
		Scanner sc = new Scanner(System.in);
		
		int opcion = 0;
		boolean navidad = false;
		double precioMin = 4;
		
		Vehiculo v1 = new Vehiculo("IB6040CY", 100, false);
		Vehiculo v2 = new Furgoneta("8787JSC", 80, true, 8);
		Vehiculo v3 = new Moto("8350HCT", 120, false, 200);

		Vehiculo[] listado = new Vehiculo[] {v1, v2, v3};
		
		Parking p = new Parking("Condes de Bustillo, 17", listado);
		
		do {
			System.out.println("""
					Bienvenido al Parking
					¿Qué desea hacer?
					-----------------------
					1. Mostrar lista de vehículos
					2. Calcular el precio de aparcar un vehículo
					3. Mostrar recaudado por motos
					4. Calcular el precio de aparcar un vehículo en Navidad
					""");
			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);
			switch (opcion) {
			case 1:
				p.mostrarListado();
				break;
				
			case 2:
				System.out.println("Diga la matrícula del vehículo:");
				aux = sc.nextLine();
				System.out.printf("El precio de este vehículo es: %.2f€\n", p.calcularPrecioUnVehiculo(p.findByMatricula(aux), precioMin));
				break;
				
			case 3:
				System.out.printf("Lo recaudado sólo por motos es: %.2f€\n", p.calcularSoloMotos(precioMin));
				break;
				
			case 4:
				System.out.println("""
						¿Es navidad?
						1- Si
						Cualquier otro número - No
						""");
				aux = sc.nextLine();
				opcion = Integer.parseInt(aux);
				if(opcion==1) {
					navidad = true;
				}
				
				if(navidad) {
					System.out.println("¿De qué vehículo?");
					p.mostrarListado();
					aux = sc.nextLine();
					System.out.printf("El precio de este vehículo es: %.2f€\n", p.calcularPrecioNavidad(p.findByMatricula(aux), navidad, precioMin));
				}
				
				
				break;

			default:
				System.out.println("Opción no disponible");
				break;
			}
		} while (opcion != 0);
	}

}
