package ejercicio10;

import java.util.Scanner;

public class Ppal {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        int cantidad;
        double dineroPagado;
        String contraseña;
        double nuevoPrecio;
        double precioTicket = 2.5;
        Ticket t = new Ticket(precioTicket);
        Maquina maquina = new Maquina(t, 0, 0.0, "12345");
        String aux;
      

        System.out.println("Bienvenido a Metro Sevilla");
        do {
            System.out.println("\n¿Qué desea hacer?");
            System.out.println("-".repeat(30));
            System.out.println("1. Comprar billetes");
            System.out.println("2. Calcular cambio");
            System.out.println("3. Imprimir ticket");
            System.out.println("4. Operario");
            System.out.println("0. Salir");
            System.out.println("-".repeat(30));
            
            aux = sc.nextLine();
            opcion = Integer.parseInt(aux);

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la cantidad de billetes a comprar:");
                    aux = sc.nextLine();
                    cantidad = Integer.parseInt(aux);
                    maquina.comprarBilletes(cantidad);
                    break;

                case 2:
                    System.out.println("Ingrese el dinero pagado:");
                    aux = sc.nextLine();
                    dineroPagado = Double.parseDouble(aux);
                    System.out.printf("Cambio a devolver: %.2f€", maquina.calcularCambio(dineroPagado));
                    break;

                case 3:
                    maquina.imprimirTicket();
                    break;

                case 4:
                    System.out.println("Ingrese la contraseña de operario:");
                    contraseña = sc.nextLine();
                    if (maquina.comprobarContraseña(contraseña)) {
                        menuOperario(maquina, sc);
                    } else {
                        System.out.println("Contraseña incorrecta. Acceso denegado.");
                    }
                    break;

                case 0:
                	System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
                    break;
            }
        } while (opcion!=0);
        System.out.println("Gracias por usar el programa");
    }

	private static void menuOperario(Maquina maquina, Scanner sc) {
		String aux;
		int opcion;
		double nuevoPrecio;

		do {
			System.out.println("\nMenú de Operario:");
			System.out.println("-".repeat(30));
			System.out.println("1. Consultar saldo total");
			System.out.println("2. Reiniciar contador de saldo total");
			System.out.println("3. Cambiar precio de billete");
			System.out.println("0. Volver al menú principal");
			System.out.println("-".repeat(30));

			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);

			switch (opcion) {
			case 1:
				System.out.printf("Saldo total: %.2f€\n", maquina.getSaldoTotal());
				break;

			case 2:
				maquina.reiniciarSaldoTotal();
				System.out.println("Contador de saldo total reiniciado.");
				break;

			case 3:
				System.out.println("Ingrese el nuevo precio de billete:");
				aux = sc.nextLine();
				nuevoPrecio = Double.parseDouble(aux);
				maquina.cambiarPrecioBillete(nuevoPrecio);
				break;

			case 0:
				System.out.println("Volviendo...");
				return;

			default:
				System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
				break;
			}
		} while (opcion != 0);
	}
}
