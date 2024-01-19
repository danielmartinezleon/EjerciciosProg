package ejercicio04;

public class Venta {
	
	private LineaDeVenta[] ticket;
	
	

	public Venta(LineaDeVenta[] ticket) {
		this.ticket = ticket;
	}

	public void imprimirTicket() {
		for (int i = 0; i < ticket.length; i++) {
			ticket[i].imprimirLineaDeVenta();
		}
	}
}
