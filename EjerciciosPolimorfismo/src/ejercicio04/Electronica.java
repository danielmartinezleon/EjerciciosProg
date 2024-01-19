package ejercicio04;

public class Electronica extends Producto {

	private int impuesto;

	public Electronica(double precioUnitario, String nombre, int identificador, int impuesto) {
		super(precioUnitario, nombre, identificador);
		this.impuesto = impuesto;
	}

	public int getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(int impuesto) {
		this.impuesto = impuesto;
	}

	@Override
	public String toString() {
		return "Electronica [impuesto=" + impuesto + "]";
	}

	public double calcularImpuesto(Producto p) {
		double totImp = 0, cien = 100;
		
		totImp = (p.getPrecioUnitario()*impuesto)/cien;
		
		return totImp;
	}

}
