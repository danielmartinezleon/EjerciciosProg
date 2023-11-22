package ejercicio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*
		 * 1. Hace unos años visité la fábrica de Coca Cola, en el polígono del
		 * aeropuerto, aquí en Sevilla. Me llamó la atención el tamaño tan grande de los
		 * depósitos que usaban para almacenar este preciado líquido, pero solo me
		 * dieron como datos medidas del tamaño y no del volumen (litros que contenían).
		 * Nos dijo el guía que los depósitos venían de EEUU y allí usan unidades de
		 * medida diferentes. Los depósitos son cilindros perfectos. Pedir al usuario la
		 * altura y el radio (serán en yardas que es la unidad usada en EEUU). El
		 * programa debe calcular el volumen en litros que puede contener un depósito.
		 * Recuerda que: 1 m3 son 1000 litros 1 yarda son 0.9144 metros La fórmula del
		 * volumen de un cilindro es V= * radio2 * altura Se debe dar el resultado con
		 * dos decimales y en "bonito".
		 */
		
		Scanner sc = new Scanner(System.in);
		String aux;
		double yardaAMetro = 0.9144, altura = 0, altM = 0, radio = 0, 
				radioM = 0, conv = 1000, metroCubicos = 0, litros = 0,
				exponente = 2;
		System.out.println("Bienvenido, vamos a calcular el volumen de un \n"
				+ "depósito cilíndrico");
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("¿Cuántas yardas de altura tiene?");
		aux=sc.nextLine();
		altura=Double.parseDouble(aux);
		System.out.println("¿Cuántas yardas de radio tiene?");
		aux=sc.nextLine();
		radio=Double.parseDouble(aux);
		altM=altura*yardaAMetro;
		radioM=radio*yardaAMetro;
		metroCubicos=Math.PI*Math.pow(radioM, exponente)*altM;
		litros=metroCubicos*conv;
		System.out.printf("Para un cilindro de %.2f yardas de alto y %.2f yardas\n"
				+ "de radio, tiene un volumen de %.2f m^3, es decir, %.2fL\n",altura, radio,
				metroCubicos, litros);
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("Gracias y buen día");
	}

}
