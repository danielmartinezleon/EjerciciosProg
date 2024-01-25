package ejercicio02;

public class Movil extends Producto{

	public Movil(int id, double precioBase, int cantidad, String nombre, double pvp) {
		super(id, precioBase, cantidad, nombre);
		// TODO Auto-generated constructor stub
	}
	
	public double calcularPVP(double porcentaje) {
		double pvp = 0;
		int cien = 100;
		
		pvp = super.getPrecioBase()+(super.getPrecioBase()*porcentaje)/cien;

		return pvp;
	}
	

}
