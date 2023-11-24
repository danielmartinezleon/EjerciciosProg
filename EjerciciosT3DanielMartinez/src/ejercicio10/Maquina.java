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

    public void comprarBilletes(int cantidad) {
        this.cant += cantidad;
        this.precioTotal += t.getPrecio() * cantidad;
        System.out.println(cantidad + " billete(s) comprado(s) correctamente.");
    }

    public double calcularCambio(double montoPagado) {
        return montoPagado - precioTotal;
    }

    public void imprimirTicket() {
        System.out.println("Ticket válido para " + cant + " persona(s). Total a pagar: $" + precioTotal);
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
        System.out.println("Precio de billete actualizado a $" + nuevoPrecio);
    }

    public boolean comprobarContraseña(String input) {
        return input.equals("tucontraseña");
    }
}
