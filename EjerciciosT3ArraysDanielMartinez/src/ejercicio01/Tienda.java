package ejercicio01;

import java.util.Arrays;

public class Tienda {

	private Producto[] lista;
	private int numProd;
	private double inversion;

	public Tienda(Producto[] lista, int numProd, double inversion) {
		this.lista = lista;
		this.numProd = numProd;
		this.inversion = inversion;
	}

	public Producto[] getLista() {
		return lista;
	}

	public void setLista(Producto[] lista) {
		this.lista = lista;
	}

	public double getInversion() {
		return inversion;
	}

	public void setInversion(double inversion) {
		this.inversion = inversion;
	}

	public int getNumProd() {
		return numProd;
	}

	public void setNumProd(int numProd) {
		this.numProd = numProd;
	}

	@Override
	public String toString() {
		return "Tienda [lista=" + Arrays.toString(lista) + ", numProd=" + numProd + ", inversion=" + inversion + "]";
	}

	public void agregar(Producto p) {
		lista[numProd] = p;
		numProd++;
	}

	public void imprimirLista() {
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
	}

	public boolean comprobarFragil(Producto p) {
		if (p.isFragil()) {
			return true;
		} else {
			return false;
		}
	}

	public double calcularInversion() {
		for (int i = 0; i < lista.length; i++) {
			inversion+=lista[i].getpBase();
		}
		return inversion;
	}
	
	

}
