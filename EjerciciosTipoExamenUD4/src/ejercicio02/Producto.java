package ejercicio02;

public abstract class Producto implements IVenta{
	
	private int id;
	private double precioBase;
	private int cantidad;
	private String nombre;
	
	public Producto(int id, double precioBase, int cantidad, String nombre) {
		this.id = id;
		this.precioBase = precioBase;
		this.cantidad = cantidad;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", precioBase=" + precioBase + ", cantidad=" + cantidad + ", nombre=" + nombre
				+ "]";
	}
	
	public double calcularPVP(double porcentaje) {
		return 0;
	}
	
	
	
}