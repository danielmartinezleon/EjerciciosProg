package ejercicio;

import java.util.Arrays;

/**
 * @author danim
 */

public class Inmobiliaria {

	Piso[] lista;
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

	public void add(Piso p) {
		lista[numPisos] = p;
		numPisos++;
	}

	public double calcularPrecioFinalVenta(double porcen, int id) {
		double total = 0, totPorcen = 0, cien = 100;
		int index = findByIdV2(id);
		if(index >=0) {
		totPorcen = (lista[index].getPrecioVenta() * porcen) / cien;
		total = lista[index].getPrecioVenta() + totPorcen;
		lista[index].setPvp(total);
		}
		return total;
			
		}
	
		
		public int findByIdV2(int codigo) {
			int i = 0;
			boolean encontrado = false;
			
			while (i < lista.length && !encontrado) {
				Piso deLista = lista[i];
				
				if(deLista.getId() == codigo) {
					encontrado = true;
				}else {
					i++;
				}
			}
			if (encontrado) {
				return i;
			}else {
				return -1;
			}
	}
	
	
	
	public int findByEstadov2(int estado) {
		int i = 0;
		boolean encontrado = false;
		
		while (i < lista.length && !encontrado) {
			Piso deLista = lista[i];
			
			if(deLista.getEstado() == estado) {
				encontrado = true;
			}else {
				i++;
			}
		}
		if (encontrado) {
			return i;
		}else {
			return -1;
		}
	}
	
	
	public void editPrecio(int id, double nuevoPrecio){
		int index = findByIdV2(id);
		if (index >= 0) {
			lista[index].setPrecioVenta(nuevoPrecio);
		}
	}
	
	public double calcularPrecioM2(int id) {
		double precioM2=0;
		int index = findByIdV2(id);
		if (index >= 0) {
			precioM2 = lista[index].getPvp() / lista[index].getMetros2();
		}
		
		return precioM2;
	}
	
	public double totInmoSeminuevos(int estado) {
		double totInmoSeminuevos = 0;
		
		int index = findByEstadov2(estado);
		if (index >= 0) {
			while(index < lista.length) {
				totInmoSeminuevos+=lista[index].getPvp();
			}
		}
		
		return totInmoSeminuevos;
	}
	
	public double calcularGananciaVendedores() {
		double gananciaVendedores = 0;
		for (int i = 0; i < lista.length; i++) {
			gananciaVendedores+=lista[i].getPvp();
		}
		
		return gananciaVendedores;
	}
	

}
