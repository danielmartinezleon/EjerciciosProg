package ejercicio06;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String aux;
		Scanner sc = new Scanner(System.in);

		int numCuenta = 0;
		int puntos = 0;
		int opcion = 0;
		int tam = 0;
		double saldoInicial = 0;
		double comisionEmpresa = 0;
		double comisionPagada = 0;
		double regaloJoven = 0;
		double totalRegalado = 0;
		double mantenimiento = 0;
		double totalSucursal = 0;
		double operar = 0;
		Cuenta[] cuentas;
		Cuenta c1;

		System.out.println("¿Cuánto se le cobra por reintegro a las empresas?");
		aux = sc.nextLine();
		comisionEmpresa = Double.parseDouble(aux);
		System.out.println("¿Cuánto se cobra de mantenimiento a las cuentas corrientes?");
		aux = sc.nextLine();
		mantenimiento = Double.parseDouble(aux);
		System.out.println("¿Cuánto se les regala a las cuentas jóvenes por ingreso?");
		aux = sc.nextLine();
		regaloJoven = Double.parseDouble(aux);
		System.out.println("¿Cuántas cuentas habrá en el banco?");
		aux = sc.nextLine();
		tam = Integer.parseInt(aux);
		cuentas = new Cuenta[tam];
		Oficina ofi = new Oficina(cuentas);

		do {
			System.out.println();
			System.out.println("""
					Bienvenido a Bancos Hot Wheels
					**********************************
					¿Qué desea hacer?
					------------------
					1. Dar de alta una cuenta
					2. Ingresar
					3. Reintegrar
					4. Ver total impuestos pagados
					5. Ver total regalado a jóvenes
					6. Cobrar mantenimiento a cuenta corriente
					7. Ver saldo de todas las cuentas
					8. Calcular total oficina
					0. Salir
					""");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			switch (opcion) {
			case 1:
				System.out.println("Diga el número de cuenta:");
				aux=sc.nextLine();
				numCuenta=Integer.parseInt(aux);
				System.out.println("Diga el saldo inicial:");
				aux=sc.nextLine();
				saldoInicial=Double.parseDouble(aux);
				
				System.out.println("""
						¿Qué tipo de cuenta es?
						-----------------------
						1. Cuenta Corriente
						2. Cuenta Joven
						3. Cuenta de Empresa
						0. Salir
						""");
				aux=sc.nextLine();
				opcion=Integer.parseInt(aux);
				switch (opcion) {
				case 1:
					c1= new CuentaCorriente(numCuenta, saldoInicial, mantenimiento, puntos);
					ofi.add(c1);
					break;
				case 2:
					c1= new CuentaJoven(numCuenta, saldoInicial, regaloJoven);
					ofi.add(c1);
					break;
				case 3:
					c1= new CuentaEmpresa(numCuenta, saldoInicial, comisionEmpresa);
					ofi.add(c1);
					break;
				case 0:
					System.out.println("Saliendo...");
					break;

				default:
					System.out.println("Opción no disponible");
					break;
				}
				
				break;
			case 2:
				System.out.println("¿Cuánto desea ingresar?");
				aux=sc.nextLine();
				operar=Double.parseDouble(aux);
				
				System.out.println("¿A qué cuenta desea ingresarlo?");
				ofi.imprimirCuentas();
				aux=sc.nextLine();
				opcion=Integer.parseInt(aux);
				
				if (cuentas[opcion-1] instanceof CuentaCorriente) {
					((CuentaCorriente)cuentas[opcion-1]).ingresar(cuentas[opcion-1], operar);
				}else if (cuentas[opcion-1] instanceof CuentaJoven) {
					((CuentaJoven)cuentas[opcion-1]).ingresar(cuentas[opcion-1], operar);
					((CuentaJoven)cuentas[opcion-1]).calcularTotal(cuentas[opcion-1]);
					totalRegalado += ofi.calcularTotalRegalado();
				}else if (cuentas[opcion-1] instanceof CuentaEmpresa) {
					((CuentaEmpresa)cuentas[opcion-1]).ingresar(cuentas[opcion-1], operar);
				}else {
					System.out.println("Cuenta no disponible");
				}
				break;
			case 3:
				System.out.println("¿Cuánto desea reintegrar?");
				aux=sc.nextLine();
				operar=Double.parseDouble(aux);
				
				System.out.println("¿A qué cuenta desea reintegrarlo?");
				ofi.imprimirCuentas();
				aux=sc.nextLine();
				opcion=Integer.parseInt(aux);
				
				if (cuentas[opcion-1] instanceof CuentaCorriente) {
					((CuentaCorriente)cuentas[opcion-1]).reintegrar(cuentas[opcion-1], operar);
				}else if (cuentas[opcion-1] instanceof CuentaJoven) {
					((CuentaJoven)cuentas[opcion-1]).reintegrar(cuentas[opcion-1], operar);
				}else if (cuentas[opcion-1] instanceof CuentaEmpresa) {
					((CuentaEmpresa)cuentas[opcion-1]).reintegrar(cuentas[opcion-1], operar);
					((CuentaEmpresa)cuentas[opcion-1]).calcularTotal(cuentas[opcion-1]);
					comisionPagada += ofi.calcularImpuestosEmpresas();
				}else {
					System.out.println("Cuenta no disponible");
				}
				break;
			case 4:
				System.out.printf("El total de impuestos pagados es: %.2f€\n", comisionPagada);
				break;
			case 5:
				System.out.printf("El total regalado a cuentas jóvenes es: %.2f€\n", totalRegalado);
				break;
			case 6:
				for (int i = 0; i < cuentas.length; i++) {
					if (cuentas[i] instanceof CuentaCorriente) {
						((CuentaCorriente)cuentas[i]).calcularTotal(cuentas[i]);
					}
				}
				System.out.println("Mantenimiento cobrado correctamente a cuentas corrientes");
				break;
			case 7:
				//ofi.imprimirSaldo();
				ofi.imprimirCuentas();
				break;
			case 8:
				totalSucursal = 0;
				totalSucursal += ofi.calcularTotalOficina();
				System.out.printf("El total de dinero en la sucursal es: %.2f€\n", totalSucursal);
				break;
			case 0:
				System.out.println("Gracias y buen día");
				break;

			default:
				System.out.println("Opción no disponible");
				break;
			}

		} while (opcion != 0);

	}

}
