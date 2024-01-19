package ejercicio;

import java.util.Arrays;

public class Inmobiliaria {

	private Piso[] lista;
	private int numVendedores;
	private int numPisos;

	public Inmobiliaria(Piso[] lista, int numVendedores) {
		this.lista = lista;
		this.numVendedores = numVendedores;
	}

	public Piso[] getLista() {
		return lista;
	}

	public void setLista(Piso[] lista) {
		this.lista = lista;
	}

	public int getNumVendedores() {
		return numVendedores;
	}

	public void setNumVendedores(int numVendedores) {
		this.numVendedores = numVendedores;
	}

	@Override
	public String toString() {
		return "Inmobiliaria [lista=" + Arrays.toString(lista) + ", numVendedores=" + numVendedores + "]";
	}

	public void agregar(Piso p) {
		lista[numPisos] = p;
		numPisos++;
	}

	public int findById(int codigo) {
		int i = 0;
		boolean encontrado = false;

		while (i < lista.length && !encontrado) {
			Piso deLista = lista[i];

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

	public Piso[] findByEstado(int codigo) {
		Piso[] deLista = new Piso[numPisos];
		int i = 0;
		while (i < numPisos) {
			if (lista[i].getEstado() == codigo) {
				deLista[i] = lista[i];
			} else {
				i++;
			}
		}

		return deLista;
	} 

	public double calcularPVP(int id, double porcen) {
		double total = 0, totPorcen = 0, cien = 100;
		int index = findById(id);

		if (index >= 0) {
			totPorcen = (lista[index].getPrecioVenta() * porcen) * cien;
			total = lista[index].getPrecioVenta() + totPorcen;
		}
		return total;
	}

	public void editarPrecio(int codigo, double nuevoPrecio) {
		int index = findById(codigo);

		if (index >= 0) {
			lista[index].setPrecioVenta(nuevoPrecio);
		}
	}
	
	public void mostrarLista(Piso[] lista) {
		for (int i = 0; i < lista.length; i++) {
			if(lista[i]!=null) {
				System.out.println(lista[i]);
			}
		}
	}
	
	public double calcularPrecioM2() {
		
	}
}
