package ejercicio04;

import java.util.Iterator;
import java.util.Map;

public class Agenda {
	
	private Map<Contacto, Integer> listado;

	public Agenda(Map<Contacto, Integer> listado) {
		this.listado = listado;
	}

	public Map<Contacto, Integer> getListado() {
		return listado;
	}

	public void setListado(Map<Contacto, Integer> listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "Agenda [listado=" + listado + "]";
	}
	
	public Contacto findByNombre(String nombre) {
        for (Contacto contacto : listado.keySet()) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                return contacto;
            }
        }
        return null;
    }

	public void agregar(Contacto c, int t) {
		listado.put(c, t);
	}
	
	public void editarNombre(String nombre, String nuevoNombre) {
		findByNombre(nombre).setNombre(nuevoNombre);
	}
	
	public void eliminarContacto(String nombre) {
		listado.remove(findByNombre(nombre));
	}
	
	public void mostrarLista() {
		Iterator<Integer> itr = listado.values().iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
	}
}
