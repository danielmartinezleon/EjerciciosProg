package ejemplowhile;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String aux;
		int num = 0, tope = 0;
		System.out.println("Diga el tope:");
		aux = sc.nextLine();
		tope = Integer.parseInt(aux);

		while (num <= tope) {
			System.out.println(num);
			num++;
		}

	}

}
