package ejercicio02;

import java.util.Arrays;

public class Ventas {

	private Producto[] productos;
	private double totalRecaudado;

	public Ventas(Producto[] productos) {
		this.productos = productos;
	}

	public Producto[] getProductos() {
		return productos;
	}

	public void setProductos(Producto[] productos) {
		this.productos = productos;
	}

	public double getTotalRecaudado() {
		return totalRecaudado;
	}

	public void setTotalRecaudado(double totalRecaudado) {
		this.totalRecaudado = totalRecaudado;
	}

	@Override
	public String toString() {
		return "Ventas [productos=" + Arrays.toString(productos) + "]";
	}

	public int calcularTotalSinVender() {
		int totSinVender = 0;

		for (int i = 0; i < productos.length; i++) {
			if (productos[i].getCantidad() > 0) {
				totSinVender += productos[i].getCantidad();
			}
		}

		return totSinVender;
	}

	public int findById(int codigo) {
		int i = 0;
		boolean encontrado = false;

		while (i < productos.length && !encontrado) {
			Producto deLista = productos[i];

			if (deLista.getId() == codigo) {
				encontrado = true;
			} else {
				i++;
			}
		}
		if (encontrado) {
			return i;
		} else {
			return -1;
		}
	}

	public void comprarProducto(int id, int cant, double porcentaje) {
		int index = findById(id);

		if (index >= 0 && productos[index].getCantidad() > 0) {
			productos[index].setCantidad((productos[index].getCantidad()) - cant);
			if(productos[index] instanceof Movil) {
				totalRecaudado+= ((Movil)productos[index]).calcularPVP(porcentaje) * cant;
			}else if(productos[index] instanceof Espada) {
				totalRecaudado+= ((Espada)productos[index]).calcularPVP(porcentaje) * cant;
				System.out.println("¡Cuidadín al sacarla de la bolsa, que hace pupa!");
			}
		} else {
			System.out.println("No hay stock");
		}
	}
	
	public double pagar(double total, double pago) {
		double cambio = 0;
		
		if(pago>total)
		cambio= pago-total;
		
		return cambio;
	}

}
