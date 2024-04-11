package ejemplo3;

import java.time.LocalDate;

public class Reserva {
	
	public Reserva() {
		
	}
	
	public void hacerReserva(LocalDate fecha) throws DateException{

		if (fecha.isBefore(LocalDate.now())) {
			throw new DateException("No puedes reservar más atrás de hoy");
		}else {
			System.out.println("¡Reserva realizada!");
		}
	}

}
