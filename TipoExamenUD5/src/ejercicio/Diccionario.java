package ejercicio;

import java.util.Iterator;
import java.util.List;

public class Diccionario {
	
	private List<Palabra> listado;

	public Diccionario(List<Palabra> listado) {
		this.listado = listado;
	}

	public List<Palabra> getListado() {
		return listado;
	}

	public void setListado(List<Palabra> listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "Diccionario [listado=" + listado + "]";
	}
	
	public void agregar(Palabra p) {
		listado.add(p);
	}
	
	public Palabra findByNombre(String nombre) {
		int i = 0;
		boolean encontrado = false;
		
		while (i < listado.size() && !encontrado) {
			Palabra deLista = listado.get(i);
			
			if (deLista.getNombreIngles().equalsIgnoreCase(nombre)) {
				encontrado = true;
			}else {
				i++;
			}
		}
		
		if (encontrado) {
			return listado.get(i);
		}else {
			return null;
		}
	}
	
	public void imprimirLista() {
		
		for (Palabra palabra : listado) {
			System.out.println(palabra);
		}
	}
	
	public void modificarSignificado(String nombre, String significado) {
		findByNombre(nombre).setSignificado(significado);
	}
	
	public void eliminarPalabra(String nombre) {
		listado.remove(findByNombre(nombre));
	}

}
