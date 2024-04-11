package ejemplo3;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ppal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String aux;
		LocalDate fecha;
		Reserva r = new Reserva();
		
		try {
						
			System.out.println("Diga una fecha de reserva:");
			
			aux=sc.nextLine();
			fecha=LocalDate.parse(aux);
			
			r.hacerReserva(fecha);
		} catch (DateException e) {
			System.err.println(e.getMessage());
		} catch (RuntimeException e) {
			System.err.println("Introduzca una fecha válida");
		}

	}

}
