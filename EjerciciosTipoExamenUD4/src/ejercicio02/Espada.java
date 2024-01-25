package ejercicio02;

public class Espada extends Producto{

	private String tipoEspada;

	public Espada(double precioBase, int cantidad, String nombre, boolean vendido, String tipoEspada) {
		super(precioBase, cantidad, nombre, vendido);
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
		return "Espada [tipoEspada=" + tipoEspada + "]";
	}
	
	
	
}
