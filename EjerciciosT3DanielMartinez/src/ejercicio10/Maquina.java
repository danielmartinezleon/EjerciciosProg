package ejercicio10;

public class Maquina {
    private Ticket t;
    private int cant;
    private double precioTotal;
    private String password;
    
    
    public Maquina(Ticket t, int cant, double precioTotal, String password) {
		this.t = t;
		this.cant = cant;
		this.precioTotal = precioTotal;
		this.password = password;
	}

	public Ticket getT() {
        return t;
    }

    public void setT(Ticket t) {
        this.t = t;
    }

    public int getCant() {
		return cant;
	}

	public void setCant(int cant) {
		this.cant = cant;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void comprarBilletes(int cantidad) {
        cant += cantidad;
        precioTotal += t.getPrecio() * cantidad;
        System.out.println(cantidad + " billete(s) comprado(s) correctamente.");
    }

    public double calcularCambio(double dineroPagado) {
        return dineroPagado - precioTotal;
    }

    public void imprimirTicket() {
        System.out.printf("Ticket válido para %d persona(s). Total a pagar: %.2f€\n", cant, precioTotal);
    }

    public double getSaldoTotal() {
        return precioTotal;
    }

    public void reiniciarSaldoTotal() {
        cant = 0;
        precioTotal = 0;
    }

    public void cambiarPrecioBillete(double nuevoPrecio) {
        t.setPrecio(nuevoPrecio);
        System.out.printf("Precio de billete actualizado a %.2f€\n", nuevoPrecio);
    }

    public boolean comprobarContraseña(String input) {
        return input.equalsIgnoreCase(password);
    }
}
