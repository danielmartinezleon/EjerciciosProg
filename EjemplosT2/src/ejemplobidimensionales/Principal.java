package ejemplobidimensionales;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		int fil = 0, col = 0, desde = 0, hasta = 0;
		int[][] array2D;
		Scanner sc = new Scanner(System.in);
		String aux;
		Random rnd = new Random(System.nanoTime());
		
		System.out.println("Diga cuantas filas: ");
		aux = sc.nextLine();
		fil = Integer.parseInt(aux);
		System.out.println("Diga cuantas columnas: ");
		aux = sc.nextLine();
		col = Integer.parseInt(aux);
		
		System.out.println("Diga desde: ");
		aux = sc.nextLine();
		desde= Integer.parseInt(aux);
		

		System.out.println("Diga hasta: ");
		aux = sc.nextLine();
		hasta= Integer.parseInt(aux);
		
		array2D = new int[fil][col];
		

		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[i].length; j++) {
				array2D[i][j] = rnd.nextInt(hasta - desde + 1) + desde;;
			}
		}

		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[i].length; j++) {
				System.out.print(array2D[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
