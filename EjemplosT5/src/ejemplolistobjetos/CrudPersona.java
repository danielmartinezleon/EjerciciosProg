package ejemplolistobjetos;

import java.util.Iterator;
import java.util.List;

public class CrudPersona {
	
	private List <Persona> listado;

	public CrudPersona(List<Persona> listado) {
		this.listado = listado;
	}

	public List<Persona> getListado() {
		return listado;
	}

	public void setListado(List<Persona> listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "CrudPersona [listado=" + listado + "]";
	}
	
	public Persona findByDNI(String dni) {
		boolean encontrado = false;
		int i = 0;
		
		while (i < listado.size() && !encontrado) {
			Persona deLista = listado.get(i);
			if(deLista.getDni().equalsIgnoreCase(dni)) {
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
	
	public Persona findByDNIV2(String dni) {
		Persona tem = null;
		boolean salir = false;
		
		for (int i = 0; i < listado.size() && !salir; i++) {
			if(listado.get(i).getDni().equalsIgnoreCase(dni)) {
				tem = listado.get(i);
				salir = true;
			}
		}
		
		return tem;
	}
	
	public void agregar(Persona per) {
		listado.add(per);
	}
	
	public void mostrarLista() {
		for (Persona persona : listado) {
			System.out.println(persona);
		}
	}
	
	public void eliminar(String dni) {
		if(findByDNI(dni)!=null) {
			listado.remove(findByDNI(dni));
		}
	}

}
