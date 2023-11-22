package crud;

import java.util.Arrays;

import model.Producto;

public class CrudProducto {

	private Producto[] lista;

	public CrudProducto(Producto[] lista) {
		this.lista = lista;
	}

	public Producto[] getLista() {
		return lista;
	}

	public void setLista(Producto[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "CrudProducto [lista=" + Arrays.toString(lista) + "]";
	}

	/* Añade un producto a la lista en la posición dada, no comprueba */
	public void add(Producto p, int posicion) {
		lista[posicion] = p;
	}

	public void editPrecio(String codigo, double precioN) {
		int index = findByIdV2(codigo);

		if (index >= 0) {
			lista[index].setPrecioUnitario(precioN);
		}
	}

	public Producto findById(String codigo) {
		int i = 0;
		boolean encontrado = false;

		while (i < lista.length && !encontrado) {
			Producto deLista = lista[i];
			if (deLista.getCodigo().equalsIgnoreCase(codigo))
				encontrado = true;
			else
				i++;
		}

		if (encontrado) {
			return lista[i];
		} else {
			return null;
		}
	}

	public int findByIdV2(String codigo) {
		int i = 0;
		boolean encontrado = false;

		while (i < lista.length && !encontrado) {
			Producto deLista = lista[i];
			if (deLista.getCodigo().equalsIgnoreCase(codigo))
				encontrado = true;
			else
				i++;
		}

		if (encontrado) {
			return i;
		} else {
			return -1;
		}
	}

}
