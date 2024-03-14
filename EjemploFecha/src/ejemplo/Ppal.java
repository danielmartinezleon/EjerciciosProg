package ejemplo;

import java.time.LocalDate;
import java.util.Scanner;

public class Ppal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String aux;
		String fecha = "2024-03-03";
		LocalDate hoy = LocalDate.now();
		LocalDate miNacimiento = LocalDate.of(1999, 07, 11);
		LocalDate cambio;
		
		System.out.println(hoy);
		System.out.println(miNacimiento);
		cambio = LocalDate.parse(fecha);
		System.out.println(cambio);
		

	}

}
