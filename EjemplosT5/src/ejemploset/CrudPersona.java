package ejemploset;

import java.util.Set;

public class CrudPersona {

	private Set<Persona> listado;

	public CrudPersona(Set<Persona> listado) {
		this.listado = listado;
	}

	public Set<Persona> getListado() {
		return listado;
	}

	public void setListado(Set<Persona> listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "CrudPersona [listado=" + listado + "]";
	}
	
	public Persona findByDni(String dni) {
		for (Persona persona : listado) {
			if(persona.getDni().equalsIgnoreCase(dni)) {
				return persona;
			}
		}
		return null;
	}
	
	public void imprimirPersona(Persona p) {
		if(p != null) {
			System.out.println(p);
		}else {
			System.out.println("Persona no disponible");
		}
	}
	
	public void imprimirLista() {
		for (Persona persona : listado) {
			System.out.println(persona);
		}
	}
}
