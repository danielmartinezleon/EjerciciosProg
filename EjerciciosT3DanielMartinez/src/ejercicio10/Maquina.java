package ejercicio10;

public class Maquina {

	private Ticket t;
	private int cant;
	private double precioTotal;

	public Maquina(Ticket t) {
		this.t = t;
	}

	public Ticket getT() {
		return t;
	}

	public void setT(Ticket t) {
		this.t = t;
	}

	@Override
	public String toString() {
		return "Maquina [t=" + t + "]";
	}

	public double comprarTickets() {
		precioTotal = t.getPrecio() * cant;
		return precioTotal;
	}
	
	public double calcularCambio(double precioTotal) {
		
	}

}
