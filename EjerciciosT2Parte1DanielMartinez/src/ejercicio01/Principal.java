package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String aux;
		int num1 = 0, num2 = 0;
		
		System.out.println("Bienvenido, vamos a comprobar que número es mayor entre dos opciones");
		System.out.println("*********************************************************************");
		System.out.println("Diga el primer número:");
		aux = sc.nextLine();
		num1 = Integer.parseInt(aux);
		System.out.println("Diga el segundo número:");
		aux = sc.nextLine();
		num2 = Integer.parseInt(aux);
		
		if (num1>num2) {
			System.out.println(num1+" es mayor que "+num2);
		}else if (num2>num1) {
			System.out.println(num2+" es mayor que "+num1);
		}else {
			System.out.println("Son iguales");
		}
		System.out.println("Gracias y buen día");
	}

}
