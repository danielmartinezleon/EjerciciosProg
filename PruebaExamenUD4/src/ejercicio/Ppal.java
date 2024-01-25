package ejercicio;

import java.util.Scanner;

public class Ppal {

	public static void main(String[] args) {
		
		String aux;
		Scanner sc = new Scanner(System.in);
		
		Vehiculo v1 = new Vehiculo("IB6040CY", 4, 1997, true);
		Vehiculo v2 = new Batmovil("8787JSC", 3, 2016, true, 4);
		Vehiculo v3 = new PatineteVolador("8365HCT", 1, 2019, true, 50);
		
		Vehiculo [] vehiculos = new Vehiculo[] {v1, v2, v3};
		
		Alquiler a1 = new Alquiler(vehiculos);
		
		System.out.println("diga la matricula que busca: ");
		aux = sc.nextLine();
		System.out.println(a1.findByMatricula(aux));
		System.out.println(a1.calcularAlquilerUnVehiculo(a1.findByMatricula(aux)));
		a1.mostrarListado();
		
		System.out.println(a1.calcularTotalRecaudado());
		System.out.println(a1.calcularTotalBatmovil());

	}

}
