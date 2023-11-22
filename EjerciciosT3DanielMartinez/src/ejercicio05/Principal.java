package ejercicio05;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String aux, frase;
		int cant;
		Copiado c1;
		
		System.out.println("Bienvenido a la copiadora de frases");
		System.out.println("************************************");
		System.out.println("¿Qué frase quiere copiar?");
		frase=sc.nextLine();
		c1= new Copiado(frase);
		System.out.println("¿Cuántas veces?");
		aux=sc.nextLine();
		cant=Integer.parseInt(aux);
		c1.imprimirFraseXVeces(cant);

	}

}
