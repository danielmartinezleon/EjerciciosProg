package ejercicio1;

import java.util.Scanner;

public class Ppal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String aux;
        int num1 = 0, num2 = 0, res = 0, opcion = 0;

        try {
            do {
                System.out.println("""
                        1- Sumar
                        2- Restar
                        3- Multiplicar
                        4- Dividir
                        5- Raíz cuadrada
                        0- Salir
                        """);
                aux = sc.nextLine();
                opcion = Integer.parseInt(aux);

                switch (opcion) {
                    case 1:
                        System.out.println("Diga el primer número: ");
                        aux = sc.nextLine();
                        num1 = Integer.parseInt(aux);
                        System.out.println("Diga el segundo número: ");
                        aux = sc.nextLine();
                        num2 = Integer.parseInt(aux);

                        res = num1 + num2;
                        System.out.println(num1 + " + " + num2 + " = " + res);
                        break;

                    case 2:
                        System.out.println("Diga el primer número: ");
                        aux = sc.nextLine();
                        num1 = Integer.parseInt(aux);
                        System.out.println("Diga el segundo número: ");
                        aux = sc.nextLine();
                        num2 = Integer.parseInt(aux);

                        res = num1 - num2;
                        System.out.println(num1 + " - " + num2 + " = " + res);
                        break;

                    case 3:
                        System.out.println("Diga el primer número: ");
                        aux = sc.nextLine();
                        num1 = Integer.parseInt(aux);
                        System.out.println("Diga el segundo número: ");
                        aux = sc.nextLine();
                        num2 = Integer.parseInt(aux);

                        res = num1 * num2;
                        System.out.println(num1 + " x " + num2 + " = " + res);
                        break;

                    case 4:
                        System.out.println("Diga el primer número: ");
                        aux = sc.nextLine();
                        num1 = Integer.parseInt(aux);
                        System.out.println("Diga el segundo número: ");
                        aux = sc.nextLine();
                        num2 = Integer.parseInt(aux);

                        res = num1 / num2;
                        System.out.println(num1 + " / " + num2 + " = " + res);
                        
                        break;

                    case 5:
                        System.out.println("Diga el número: ");
                        aux = sc.nextLine();
                        num1 = Integer.parseInt(aux);
                        res = (int) Math.sqrt(num1);
                        System.out.println("Raíz cuadrada de " + num1 + " = " + res);
                        
                        break;

                    case 0:
                        System.out.println("Saliendo...");
                        break;

                    default:
                        System.out.println("Opción no disponible");
                        break;
                }
            } while (opcion != 0);

        } catch (NumberFormatException e) {
            System.out.println("Error: Ingreso un formato de número incorrecto.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Se produjo una operación aritmética no válida.");
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } 
    }
}
