package ejercicio04;

public class LineaDeVenta {
	
	private Producto producto;
	private int cantidad;
	private double subtotal;
	
	public LineaDeVenta(Producto producto, int cantidad, double subtotal) {
		this.producto = producto;
		this.cantidad = cantidad;
		this.subtotal = subtotal;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	@Override
	public String toString() {
		return "LineaDeVenta [producto=" + producto + ", cantidad=" + cantidad + ", subtotal=" + subtotal + "]";
	}
	
	public double calcularPrecio() {
		
		if(producto instanceof Electronica) {
			subtotal = cantidad * producto.getPrecioUnitario() +
					((Electronica)producto).calcularImpuesto(producto);
		}else {
			subtotal = producto.getPrecioUnitario() * cantidad;
		}
		
		return subtotal;
	}
	
	public void imprimirLineaDeVenta() {
		System.out.println("-"+producto.getNombre()+"        "+cantidad+"        "+subtotal);
		
		if(producto instanceof Alimentacion) {
			if(((Alimentacion)producto).comprobarCaducidad(producto)) {
				System.out.println("A "+producto.getNombre()+" le faltan 2 días para caducar");
			};
		}
	}
	
	

}
