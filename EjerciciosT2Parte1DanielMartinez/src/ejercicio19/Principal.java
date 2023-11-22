package ejercicio19;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String aux;
		int opcion=0;
		double num1=0, num2=0, result=0, par=2;
		
		System.out.println("Bienvenido a la calculadora");
		System.out.println("----------------------------------");
		do {
			System.out.println("¿Qué desea hacer?");
			System.out.println("----------------------------------");
			System.out.println("1 - Sumar");
			System.out.println("2 - Restar");
			System.out.println("3 - Multiplicar");
			System.out.println("4 - Dividir");
			System.out.println("5 - Comprobar pares");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			switch (opcion) {
				case 1:
					System.out.println("Diga el primer número:");
					aux=sc.nextLine();
					num1=Double.parseDouble(aux);
					System.out.println("Diga el segundo número:");
					aux=sc.nextLine();
					num2=Double.parseDouble(aux);
					result=num1+num2;
					System.out.printf("%.2f + %.2f da %.2f\n", num1, num2, result);
					break;
				case 2:
					System.out.println("Diga el primer número:");
					aux=sc.nextLine();
					num1=Double.parseDouble(aux);
					System.out.println("Diga el segundo número:");
					aux=sc.nextLine();
					num2=Double.parseDouble(aux);
					result=num1-num2;
					System.out.printf("%.2f - %.2f da %.2f\n", num1, num2, result);
					break;
				case 3:
					System.out.println("Diga el primer número:");
					aux=sc.nextLine();
					num1=Double.parseDouble(aux);
					System.out.println("Diga el segundo número:");
					aux=sc.nextLine();
					num2=Double.parseDouble(aux);
					result=num1*num2;
					System.out.printf("%.2f x %.2f da %.2f\n", num1, num2, result);
					break;
				case 4:
					System.out.println("Diga el primer número:");
					aux=sc.nextLine();
					num1=Double.parseDouble(aux);
					System.out.println("Diga el segundo número:");
					aux=sc.nextLine();
					num2=Double.parseDouble(aux);
					result=num1/num2;
					System.out.printf("%.2f entre %.2f da %.2f\n", num1, num2, result);
					break;
				case 5:
					System.out.println("Diga un número");
					aux=sc.nextLine();
					num1=Double.parseDouble(aux);
					if (num1%par==0) {
						System.out.println("Es par");
					}else {
						System.out.println("Es impar");
					}
				default:
					System.out.println("Opción no disponible");
			}
			System.out.println("----------------------------------");
			System.out.println("Si quiere realizar otro cálculo pulse cualquier número o pulse 0 para salir");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
		}while (opcion!=0);
		System.out.println("Gracias por usar el programa");
		

	}


	}

