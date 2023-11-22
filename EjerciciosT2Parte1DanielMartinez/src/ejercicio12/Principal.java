package ejercicio12;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String aux;
		int opcion = 0, exponente = 2;
		double peso = 0, altura = 0, imc = 0;

		System.out.println("Bienvenido a la calculadora de IMC");
		System.out.println("***********************************");
		System.out.println("¿Cuánto pesa?");
		aux = sc.nextLine();
		peso = Double.parseDouble(aux);
		System.out.println("¿Cuál es su altura? (m)");
		aux = sc.nextLine();
		altura = Double.parseDouble(aux);

		imc = peso / Math.pow(altura, exponente);
		System.out.printf("Su IMC es de %.2f, elija en que rango está para diagnóstico\n", imc);
		System.out.println("1. Menos de 16");
		System.out.println("2. Entre 16 y 17");
		System.out.println("3. Entre 17 y 18");
		System.out.println("4. Entre 18 y 25");
		System.out.println("5. Entre 25 y 30");
		System.out.println("6. Entre 30 y 35");
		System.out.println("7. Entre 35 y 40");
		System.out.println("8. Más de 40");
		
		aux = sc.nextLine();
		opcion = Integer.parseInt(aux);
		
		switch (opcion) {
			case 1:
				System.out.println("Criterio de ingreso en hospital");
				break;
			case 2:
				System.out.println("Infrapeso");
				break;
			case 3:
				System.out.println("Bajo peso");
				break;
			case 4:
				System.out.println("Peso normal (saludable)");
				break;
			case 5:
				System.out.println("Sobrepeso (obesidad de grado I)");
				break;
			case 6:
				System.out.println("Sobrepeso crónico (obesidad de grado II)");
				break;
			case 7:
				System.out.println("Obesidad premórbida (obesidad de grado III)");
				break;
			case 8:
				System.out.println("Obesidad mórbida (obesidad de grado IV)");
				break;
			default:
				System.out.println("Opción no disponible");
				break;
		}
		System.out.println("***********************************");
		System.out.println("Gracias y buen día");
	}

}
