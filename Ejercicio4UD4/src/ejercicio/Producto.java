package ejercicio;

public abstract class Producto {
	
	private String nombre;
	private int identificador;
	private double pUnitario;
	
	public Producto(String nombre, int identificador, double pUnitario) {
		this.nombre = nombre;
		this.identificador = identificador;
		this.pUnitario = pUnitario;
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

	public double getpUnitario() {
		return pUnitario;
	}

	public void setpUnitario(double pUnitario) {
		this.pUnitario = pUnitario;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", identificador=" + identificador + ", pUnitario=" + pUnitario + "]";
	}
	
	public abstract double calcularPVP();

}
