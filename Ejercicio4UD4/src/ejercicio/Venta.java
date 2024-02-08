package ejercicio;

import java.util.Arrays;

public class Venta {
	
	private LineaDeVenta[] listado;

	public Venta(LineaDeVenta[] listado) {
		this.listado = listado;
	}

	public LineaDeVenta[] getListado() {
		return listado;
	}

	public void setListado(LineaDeVenta[] listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "Venta [listado=" + Arrays.toString(listado) + "]";
	}
	
	public double calcularTotal() {
		double total = 0;
		
		for (int i = 0; i < listado.length; i++) {
			total+=listado[i].calcularLineaSinProd();
		}
		return total;
	}
	public void imprimirTicket() {
		System.out.println("Producto\tPrecio Ud\tCantidad\t\tSubtotal");
		System.out.println("*".repeat(70));
		for (int i = 0; i < listado.length; i++) {
			System.out.print(listado[i].getProd().getNombre());
			System.out.print("\t\t"+listado[i].getProd().getpUnitario());
			System.out.print("\t\t"+listado[i].getCantidad());
			System.out.print("\t\t"+listado[i].calcularLineaSinProd());
		}
	}
	
	public void mostrarProdsAlimentacion() {
		for (int i = 0; i < listado.length; i++) {
			System.out.println(listado[i].getProd().getNombre());
			if(listado[i].getProd() instanceof Alimentacion) {
				((Alimentacion)listado[i].getProd()).mostrarCaducaEn2Dias();
			}
		}
	}
}
