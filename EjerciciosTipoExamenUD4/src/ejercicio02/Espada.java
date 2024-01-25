package ejercicio02;

public class Espada extends Producto {

	private String tipoEspada;

	public Espada(int id, double precioBase, int cantidad, String nombre, double pvp, String tipoEspada) {
		super(id, precioBase, cantidad, nombre);
		this.tipoEspada = tipoEspada;
	}

	public String getTipoEspada() {
		return tipoEspada;
	}

	public void setTipoEspada(String tipoEspada) {
		this.tipoEspada = tipoEspada;
	}

	@Override
	public String toString() {
		return super.toString()+" Espada [tipoEspada=" + tipoEspada + "]";
	}

	public double calcularPVP(double porcentaje) {
		int cien = 100;
		double pvp = 0;
		double espadaDoble = 50;
		
		if (tipoEspada.equalsIgnoreCase("doble")) {
			pvp = super.getPrecioBase()+((super.getPrecioBase()*porcentaje)/cien)+espadaDoble;
		}else {
			pvp = super.getPrecioBase()+(super.getPrecioBase()*porcentaje)/cien;
		}

		return pvp;
	}

}
