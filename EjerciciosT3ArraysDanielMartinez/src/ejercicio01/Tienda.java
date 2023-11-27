package ejercicio01;

import java.util.Arrays;

public class Tienda {

	private Producto[] lista;
	private double pvp;
	private int numProd;

	public Tienda(Producto[] lista, double pvp, int numProd) {
		this.lista = lista;
		this.pvp = pvp;
		this.numProd = numProd;
	}

	public Producto[] getLista() {
		return lista;
	}

	public void setLista(Producto[] lista) {
		this.lista = lista;
	}

	public double getPvp() {
		return pvp;
	}

	public void setPvp(double pvp) {
		this.pvp = pvp;
	}

	public int getNumProd() {
		return numProd;
	}

	public void setNumProd(int numProd) {
		this.numProd = numProd;
	}

	@Override
	public String toString() {
		return "Tienda [lista=" + Arrays.toString(lista) + ", pvp=" + pvp + ", numProd=" + numProd + "]";
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

}
