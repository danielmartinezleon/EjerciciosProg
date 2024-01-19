package ejercicio;

public class Piso {

	private String direccion;
	private int metros2;
	private int estado;
	private int id;
	private double precioVenta;
	
	public Piso(String direccion, int metros2, int estado, int id, double precioVenta) {
		this.direccion = direccion;
		this.metros2 = metros2;
		this.estado = estado;
		this.id = id;
		this.precioVenta = precioVenta;
	}
	
	public Piso() {
		
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getMetros2() {
		return metros2;
	}

	public void setMetros2(int metros2) {
		this.metros2 = metros2;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	@Override
	public String toString() {
		return "Piso [direccion=" + direccion + ", metros2=" + metros2 + ", estado=" + estado + ", id=" + id
				+ ", precioVenta=" + precioVenta + "]";
	}
	
	
}
