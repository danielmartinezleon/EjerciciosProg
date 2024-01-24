package ejercicio02;

public class Producto implements IImpuesto{

	private String nombre;
	private double totIVA;
	
	public Producto(String nombre, double totIVA) {
		this.nombre = nombre;
		this.totIVA = totIVA;
	}
	
	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public double getTotIVA() {
		return totIVA;
	}




	public void setTotIVA(double totIVA) {
		this.totIVA = totIVA;
	}


	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", totIVA=" + totIVA + "]";
	}

	public double calcularIva(double precio, int iva) {
		int cien = 100;
		totIVA = (precio*iva)/cien;
		return totIVA;
	}
	
	

	
	public double calcularIrpf(double sueldo) {
		
		return 0;
	}

}
