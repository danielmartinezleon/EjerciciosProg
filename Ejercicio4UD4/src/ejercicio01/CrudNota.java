package ejercicio01;

import java.util.List;

public class CrudNota {
	
	private List<Nota> lista;

	public CrudNota(List<Nota> lista) {
		this.lista = lista;
	}

	public List<Nota> getLista() {
		return lista;
	}

	public void setLista(List<Nota> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "CrudNota [lista=" + lista + "]";
	}
	
	public Nota findById(int id) {
		int i = 0;
		boolean encontrado = false;
		
		while (i < lista.size() && !encontrado) {
			Nota deLista = lista.get(i);
			
			if (deLista.getId() == id) {
				encontrado = true;
			}else {
				i++;
			}
		}
		
		if (encontrado) {
			return lista.get(i);
		}else {
			return null;
		}
	}
	
	public void agregar(Nota n) {
		lista.add(n);
	}

}
