package ejercicio02;

import java.util.List;

public class CRUDSocio {
	
	private List<Socio> listado;

	public CRUDSocio(List<Socio> listado) {
		this.listado = listado;
	}

	public List<Socio> getListado() {
		return listado;
	}

	public void setListado(List<Socio> listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "CRUDSocio [listado=" + listado + "]";
	}
	
	public void agregar(Socio s) {
		listado.add(s);
	}
	
	public int findByDNI(String dni) {
		boolean encontrado = false;
		int i = 0;
		
		while (i < listado.size() && !encontrado) {
			Socio deLista = listado.get(i);
			if(deLista.getDni().equalsIgnoreCase(dni)) {
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
	
	public void editarCuota(String dni, double nuevaCuota) {
		int index = findByDNI(dni);
		
		if (index >= 0) {
			listado.get(index).setCuota(nuevaCuota);
		}
	}
	
	public void mostrarSocio(String dni) {
		int index = findByDNI(dni);
		
		if (index >= 0) {
			System.out.println(listado.get(index));
		}else {
			System.out.println("Socio no disponible");
		}
	}
	
	public void eliminarSocio(String dni) {
		int index = findByDNI(dni);
		
		if (index >= 0) {
			listado.remove(index);
		}
	}
	
	public void mostrarListado() {
		for (int i = 0; i < listado.size(); i++) {
			System.out.println(listado.get(i));
		}
	}

}
