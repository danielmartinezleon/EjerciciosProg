package ejercicio04;

public abstract class Producto {

	private double precioUnitario;
	private String nombre;
	private int identificador;
	
	public Producto(double precioUnitario, String nombre, int identificador) {
		this.precioUnitario = precioUnitario;
		this.nombre = nombre;
		this.identificador = identificador;
	}


	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	@Override
	public String toString() {
		return "Producto [precioUnitario=" + precioUnitario + ", nombre=" + nombre + ", identificador=" + identificador
				+ "]";
	}
	
	
}
