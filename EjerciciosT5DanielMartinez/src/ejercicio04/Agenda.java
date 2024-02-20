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
        Contacto contacto = findByNombre(nombre);
        if (contacto != null) {
            contacto.setNombre(nuevoNombre);
            System.out.println("El nombre de " + nombre + " ha cambiado a " + nuevoNombre);
        } else {
            System.out.println("El contacto con el nombre " + nombre + " no existe en la agenda.");
        }
    }
	
	public void eliminarContacto(String nombre) {
		//listado.remove(findByNombre(nombre));
		Contacto contacto = findByNombre(nombre);
		if (contacto != null) {
			listado.remove(contacto);
			System.out.println("Contacto eliminado");
		}else {
			System.out.println("El contacto "+nombre+" no existe en la agenda");
		}
	}

	public void imprimirAgenda() {
        System.out.println("AGENDA:");
        System.out.println("-".repeat(40));
        for (Map.Entry<Contacto, Integer> entry : listado.entrySet()) {
            Contacto contacto = entry.getKey();
            Integer telefono = entry.getValue();
            System.out.println("Nombre: " + contacto.getNombre() + ", Teléfono: " + telefono);
        }
        System.out.println("-".repeat(40));
    }
	
	public void imprimirUnContacto(String nombre) {
		Contacto contacto = findByNombre(nombre);
		if (contacto != null) {
			System.out.println(contacto);
		}else {
			System.out.println("El contacto "+nombre+" no existe en la agenda");
		}

	}

}
