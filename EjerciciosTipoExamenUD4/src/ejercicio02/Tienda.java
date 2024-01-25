package ejercicio02;

import java.util.Arrays;

public class Tienda implements ITienda{
	
	private Producto[] stock;

	public Tienda(Producto[] stock) {
		this.stock = stock;
	}

	public Producto[] getStock() {
		return stock;
	}

	public void setStock(Producto[] stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Tienda [stock=" + Arrays.toString(stock) + "]";
	}
	
	public Producto[] findByPorVender() {
		int i = 0;
		Producto[] porVender = new Producto[stock.length]; 
		
		while (i < stock.length) {
			if(!stock[i].isVendido()) {
				porVender[i] = stock[i];
			}
		}
		
		return porVender;
	}
	
	public double calcularTotalVendido() {
		double totalRecaudado = 0;
		
		for (int i = 0; i < stock.length; i++) {
			if(stock[i].isVendido()) {
				totalRecaudado+=stock[i]
			}
		}
	}

	@Override
	public void calcularPVP(double porcentaje) {
		
		
	}

	

}
