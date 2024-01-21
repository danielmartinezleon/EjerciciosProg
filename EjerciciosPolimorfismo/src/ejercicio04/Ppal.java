package ejercicio04;

public class Ppal {

	public static void main(String[] args) {
		
		int tam = 3;
		Producto p1 = new Alimentacion(5.5, "patatas", 1, 1);
		Producto p2 = new Alimentacion(3, "peras", 2, 3);
		Producto p3 = new Electronica(200, "Mac", 3, 20);
		
		LineaDeVenta l1 = new LineaDeVenta(p1, 3, 0);
		LineaDeVenta l2 = new LineaDeVenta(p2, 7, 0);
		LineaDeVenta l3 = new LineaDeVenta(p3, 1, 0);
		LineaDeVenta[] ticket = new LineaDeVenta[tam];
		ticket[0] = l1;
		ticket[1] = l2;
		ticket[2] = l3;
		
		l1.calcularPrecio();
		l2.calcularPrecio();
		l3.calcularPrecio();
		
		Venta v = new Venta(ticket);
		v.imprimirTicket();
	}

}
