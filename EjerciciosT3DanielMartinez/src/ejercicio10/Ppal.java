package ejercicio10;

import java.util.Scanner;

public class Ppal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Maquina maquina = new Maquina(new Ticket(2.5));
        String aux;
        int opcion;
        int cantidad;
        double montoPagado;
        String contraseña;
        double nuevoPrecio;

        System.out.println("Bienvenido a Metro Sevilla");
        do {
            System.out.println("\n¿Qué desea hacer?");
            System.out.println("-".repeat(30));
            System.out.println("1. Comprar billetes");
            System.out.println("2. Calcular cambio");
            System.out.println("3. Imprimir ticket");
            System.out.println("4. Operario");
            System.out.println("0. Salir");

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
                    System.out.println("Ingrese el monto pagado:");
                    aux = sc.nextLine();
                    montoPagado = Double.parseDouble(aux);
                    System.out.println("Cambio a devolver: $" + maquina.calcularCambio(montoPagado));
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

            aux = sc.nextLine();
            opcion = Integer.parseInt(aux);

            switch (opcion) {
                case 1:
                    System.out.println("Saldo total: $" + maquina.getSaldoTotal());
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

                case 4:
                	System.out.println("Volviendo...");
                    return;

                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
                    break;
            }
        } while (opcion!=0);
    }
}
