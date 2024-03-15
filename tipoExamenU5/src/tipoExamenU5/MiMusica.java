package tipoExamenU5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MiMusica {
	
	private List<Cancion> lista;

	public MiMusica(List<Cancion> lista) {
		this.lista = lista;
	}

	public List<Cancion> getLista() {
		return lista;
	}

	public void setLista(List<Cancion> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "MiMusica [lista=" + lista + "]";
	}
	
	public List<Cancion> mostrarGratis() {
		Cancion c = null;
		List<Cancion> cancionesGratis = new ArrayList<Cancion>();
		Iterator<Cancion> it = lista.iterator();
		
		while (it.hasNext()) {
			c = it.next();
			if (c.isGratis()) {
				cancionesGratis.add(c);
			}
		}
		
		return cancionesGratis;
	}
	
	public List<Cancion> mostrarMayorDuracion() {
		List<Cancion> masLargas = new ArrayList<Cancion>();
		Cancion c = null;
		
		for (Cancion cancion : lista) {
			if (cancion.getDuracion() > c.getDuracion()) {
				c = cancion;
				masLargas.add(c);
			}
		}
		return masLargas;
	}
	
	public List<Cancion> buscarPorInterprete(String interprete) {
		List<Cancion> mismoInterprete = new ArrayList<Cancion>();
		
		for (Cancion cancion : lista) {
			if (cancion.getInterprete().equalsIgnoreCase(interprete)) {
				mismoInterprete.add(cancion);
			}
		}
		return mismoInterprete;
	}
	
	public List<Cancion> buscarPorEscuchas() {
		List<Cancion> masEscuchadas = new ArrayList<Cancion>();
		Cancion c = null;
		
		for (Cancion cancion : masEscuchadas) {
			if (cancion.getVecesEscuchada() > c.getVecesEscuchada()) {
				c = cancion;
				masEscuchadas.add(c);
			}
		}
		return masEscuchadas;
	}
	
	public Cancion findById(int id) {
		
		for (Cancion cancion : lista) {
			if (cancion.getId() == id) {
				return cancion;
			}
		}
		return null;
	}
	
	public void editarPago(int id, int opcion) {
		int gratis = 1;
		int pago = 2;
		
		if (opcion == gratis) {
			findById(id).setGratis(true);
		}else if(opcion == pago) {
			findById(id).setGratis(false);
		}
	}

}
