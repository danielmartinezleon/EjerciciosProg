package ejercicio04;

public class Venta {
	
	private LineaDeVenta[] ticket;
	
	

	public Venta(LineaDeVenta[] ticket) {
		this.ticket = ticket;
	}

	public void imprimirTicket() {
		System.out.println("Producto |		 Cantidad		 | Subtotal");
		System.out.println("-".repeat(60));
		for (int i = 0; i < ticket.length; i++) {
			ticket[i].imprimirLineaDeVenta();
		}
	}
}
