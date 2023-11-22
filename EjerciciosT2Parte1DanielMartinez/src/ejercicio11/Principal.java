package ejercicio11;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String aux;
		String planeta1="Mercurio";
		String planeta2="Venus";
		String planeta3="La Tierra";
		String planeta4="Marte";
		String planeta5="Júpiter";
		String planeta6="Saturno";
		String planeta7="Urano";
		String planeta8="Neptuno";
		
		int opcion=0, cero=0;
		double pesoInicial=0, nuevoPeso=0, mercurio=0.38, venus=0.91,
				tierra=1, marte=0.38, jupiter=2.53, saturno=1.06,
				urano=0.92, neptuno=1.2;
		
		System.out.println("Bienvenido a la calculadora de peso interplanetario");
		System.out.println("----------------------------------------------------");
		System.out.println("Diga su peso (kg):");
		aux=sc.nextLine();
		pesoInicial=Double.parseDouble(aux);
		
		if (pesoInicial<=cero) {
			System.out.println("No puedes pesar números negativos o 0kg");
		}else {
			System.out.printf("Elija en que planeta quiere saber su peso:\n"
					+ "1. %s\n2. %s\n3. %s\n4. %s\n5. %s\n6. %s\n7. %s\n8. %s\n",planeta1,planeta2,
					planeta3,planeta4,planeta5,planeta6,planeta7,planeta8);
			
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch (opcion) {
				case 1:
					nuevoPeso=pesoInicial*mercurio;
					System.out.printf("Su peso en %s es de %.2fkg\n",planeta1,nuevoPeso);
					break;
				case 2:
					nuevoPeso=pesoInicial*venus;
					System.out.printf("Su peso en %s es de %.2fkg\n",planeta2,nuevoPeso);
					break;
				case 3:
					nuevoPeso=pesoInicial*tierra;
					System.out.printf("Su peso en %s es de %.2fkg\n",planeta3,nuevoPeso);
					break;
				case 4:
					nuevoPeso=pesoInicial*marte;
					System.out.printf("Su peso en %s es de %.2fkg\n",planeta4,nuevoPeso);
					break;
				case 5:
					nuevoPeso=pesoInicial*jupiter;
					System.out.printf("Su peso en %s es de %.2fkg\n",planeta5,nuevoPeso);
					break;
				case 6:
					nuevoPeso=pesoInicial*saturno;
					System.out.printf("Su peso en %s es de %.2fkg\n",planeta6,nuevoPeso);
					break;
				case 7:
					nuevoPeso=pesoInicial*urano;
					System.out.printf("Su peso en %s es de %.2fkg\n",planeta7,nuevoPeso);
					break;
				case 8:
					nuevoPeso=pesoInicial*neptuno;
					System.out.printf("Su peso en %s es de %.2fkg\n",planeta8,nuevoPeso);
					break;
	
				default:
					System.out.println("Opción no disponible");
					break;
			}
			System.out.println("Gracias y buen día");
		}
	}

}
