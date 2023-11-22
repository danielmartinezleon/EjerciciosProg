package ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String nombre, fecha, empleado, nomP="patatas medianas", 
				nomB="bebidas medianas", nomH="Hamburguesa Mc Royal";
		String aux;
		double prod1=0.0;
		double pProd1=4.0;
		double tProd1=0.0;
		double prod2=0.0;
		double pProd2=2.5;
		double tProd2=0.0;
		double prod3=0.0;
		double pProd3=8.0;
		double tProd3=0.0;
		double total=0.0;
		double pago=0.0;
		double dev=0.0;
		
		System.out.println("(Antes de abrir) ¿Qué empleado eres?");
		empleado=sc.nextLine();
		System.out.println("Hola, estimado cliente, mi nombre es "+empleado+" "
				+ "y le doy la bienvenida a McDonals \n¿Cómo se llama usted?");
		nombre=sc.nextLine();
		System.out.println("Encantado "+nombre+" ¿Cuántas "+nomP+" se va a llevar?");
		aux=sc.nextLine();
		prod1=Double.parseDouble(aux);
		System.out.println("¿Cuántas "+nomB+"?");
		aux=sc.nextLine();
		prod2=Double.parseDouble(aux);
		System.out.println("¿Cuantas "+nomH+"?");
		aux=sc.nextLine();
		prod3=Double.parseDouble(aux);
		System.out.println("¿Cuánto paga?");
		aux=sc.nextLine();
		pago=Double.parseDouble(aux);
		System.out.println("¿A qué fecha estamos? (dd/mm/aaaa)");
		fecha=sc.nextLine();
		System.out.println("Atendido por: "+empleado);
		System.out.println("Fecha: "+fecha);
		System.out.println("\tCantidad\t|\tProducto\t|\tPrecio Unidad   |\tSubtotal");
		System.out.println("----------------------------------------------------------------------------------------");
		tProd1=prod1*pProd1;
		System.out.printf("\t%.0f\t\t|%s\t|\t%.2f€\t\t|\t%.2f€\n",prod1,nomP,pProd1,tProd1);
		tProd2=prod2*pProd2;
		System.out.printf("\t%.0f\t\t|%s\t|\t%.2f€\t\t|\t%.2f€\n",prod2,nomB,pProd2,tProd2);
		tProd3=prod3*pProd3;
		System.out.printf("\t%.0f\t\t|%s\t|\t%.2f€\t\t|\t%.2f€\n",prod3,nomH,pProd3,tProd3);
		System.out.println("----------------------------------------------------------------------------------------");
		total=tProd1+tProd2+tProd3;
		dev=pago-total;
		System.out.printf("Pagado: %.2f€\n",pago);
		System.out.printf("Total: %.2f€\n",total);
		System.out.printf("Devolución: %.2f€",dev);

	}

	}
