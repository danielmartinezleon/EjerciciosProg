package tipoexamen;

import java.util.ArrayList;
import java.util.List;

public class Oficina {

	private List<Trastero> listado;

	public Oficina(List<Trastero> listado) {
		this.listado = listado;
	}

	public List<Trastero> getListado() {
		return listado;
	}

	public void setListado(List<Trastero> listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "Oficina [listado=" + listado + "]";
	}

	public void agregar(Trastero t) {
		listado.add(t);
	}

	public List<Trastero> findByPrecio(double precio) {
		List<Trastero> p = new ArrayList<Trastero>();
		for (Trastero trastero : p) {
			if (trastero.getPrecio() == precio) {
				p.add(trastero);
			}
		}
		return p;
	}

	public Trastero findByNumero(int num) {
		for (Trastero trastero : listado) {
			if (trastero.getNumero() == num) {
				return trastero;
			}
		}
		return null;
	}

	public Trastero buscarMasCaro() {
		Trastero t = null;
		for (Trastero trastero : listado) {
			if (trastero.getPrecio() > t.getPrecio()) {
				t = trastero;
			}
		}
		return t;
	}

	public void eliminarTrastero(int num) {
		listado.remove(findByNumero(num));
	}
	
	public void editarPrecio(int num, double nuevoPrecio) {
		findByNumero(num).setPrecio(nuevoPrecio);
	}
	
	public void mostrarNoOcupados() {
		for (Trastero trastero : listado) {
			if (!trastero.isOcupado()) {
				System.out.println(trastero);
			}
		}
	}
}
