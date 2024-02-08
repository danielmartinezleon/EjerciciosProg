package ejercicio;

public class Electronica extends Producto{
	
	private double porcenImpuesto;

	public Electronica(String nombre, int identificador, double pUnitario, double porcenImpuesto) {
		super(nombre, identificador, pUnitario);
		this.porcenImpuesto = porcenImpuesto;
	}

	public double getPorcenImpuesto() {
		return porcenImpuesto;
	}

	public void setPorcenImpuesto(double porcenImpuesto) {
		this.porcenImpuesto = porcenImpuesto;
	}

	@Override
	public String toString() {
		return super.toString()+" Electronica [porcenImpuesto=" + porcenImpuesto + "]";
	}

	@Override
	public double calcularPVP() {
		double cien = 100;
		
		return super.getpUnitario()+((super.getpUnitario()*porcenImpuesto)/cien);
	}
	
	

}
