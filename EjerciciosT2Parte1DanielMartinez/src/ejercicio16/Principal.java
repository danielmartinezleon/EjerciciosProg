package ejercicio16;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String trabajador, aux;
		int reset=1;
		double hTrabajadas=0,hExtra=0, pHora=16, pHoraExtra=20, salarioExtra=0, salarioSem=0, sems=4, salarioTot=0, maxSinExtra=40;
		System.out.println("Bienvenido a la calculadora de salarios");
		System.out.println("--------------------------------------------------------------");
		do {
			System.out.println("¿Cómo se llama el trabajador?");
			trabajador=sc.nextLine();
			System.out.println("¿Cuántas horas ha trabajado?");
			aux=sc.nextLine();
			hTrabajadas=Double.parseDouble(aux);
			if (hTrabajadas<=40){
				salarioSem=hTrabajadas*pHora;
				salarioTot=salarioSem*sems;
				System.out.printf("El salario semanal de %s es de %.2f€, y el mensual de %.2f€\n", trabajador, salarioSem, salarioTot);
			}else if (hTrabajadas>40){
				salarioSem=hTrabajadas*pHora;
				hExtra=hTrabajadas-maxSinExtra;
				salarioExtra=hExtra*pHoraExtra;
				salarioTot=salarioSem*sems+salarioExtra;
				System.out.printf("El salario semanal de %s es de %.2f€, más %.0f horas extra, y el mensual de %.2f€\n", trabajador, salarioSem, hExtra, salarioTot);
			}
			System.out.println("Pulse cualquier número para calcular otro salario o pulse 0 para salir");
			aux=sc.nextLine();
			reset=Integer.parseInt(aux);
		}while(reset!=0);
		System.out.println("--------------------------------------------------------------");
		System.out.println("Gracias y buen día");
	}

}
