package ejercicio;

public class LineaDeVenta {
	
	private Producto prod;
	private int cantidad;
	
	public LineaDeVenta(Producto prod, int cantidad) {
		this.prod = prod;
		this.cantidad = cantidad;
	}

	public Producto getProd() {
		return prod;
	}

	public void setProd(Producto prod) {
		this.prod = prod;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "LineaDeVenta [prod=" + prod + ", cantidad=" + cantidad + "]";
	}
	
	public double calcularPrecioDeUno(Producto p) {
		return p.calcularPVP();
	}
	
	public double calcularTotalLinea() {
		return calcularPrecioDeUno(prod)*cantidad;
	}
	
	public double calcularLineaSinProd() {
		return prod.calcularPVP()*cantidad;
	}

}
