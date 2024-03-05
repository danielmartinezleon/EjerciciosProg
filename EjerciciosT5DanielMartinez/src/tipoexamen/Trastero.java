package tipoexamen;

public class Trastero implements Comparable<Trastero>{
	
	private double capacidad;
	private String direccion;
	private int numero;
	private double precio;
	private boolean ocupado;
	
	public Trastero(double capacidad, String direccion, int numero, double precio, boolean ocupado) {
		this.capacidad = capacidad;
		this.direccion = direccion;
		this.numero = numero;
		this.precio = precio;
		this.ocupado = ocupado;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	@Override
	public String toString() {
		return "Trastero [capacidad=" + capacidad + ", direccion=" + direccion + ", numero=" + numero + ", precio="
				+ precio + ", ocupado=" + ocupado + "]";
	}

	@Override
	public int compareTo(Trastero o) {

		if(this.getNumero() < o.getNumero()) {
			return -1;
		}else if (this.getNumero() > o.getNumero()) {
			return 1;
		}
		
		return 0;
	}
	
	

}
