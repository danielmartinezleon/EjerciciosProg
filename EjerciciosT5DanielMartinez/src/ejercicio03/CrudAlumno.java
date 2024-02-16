package ejercicio03;

import java.util.Iterator;
import java.util.Set;

public class CrudAlumno {
	
	private Set<Alumno> listado;

	public CrudAlumno(Set<Alumno> listado) {
		this.listado = listado;
	}

	public Set<Alumno> getListado() {
		return listado;
	}

	public void setListado(Set<Alumno> listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "CrudAlumno [listado=" + listado + "]";
	}
	
	public Alumno findByID(int id) {
		Iterator<Alumno> it = listado.iterator();
		boolean encontrado = false;
		Alumno a = null;
		
		while (it.hasNext() && !encontrado) {
			a = it.next();
			if (a.getId() == id) {
				encontrado = true;
			}
		}
		
		if(encontrado) {
			return a;
		}else {
			return null;
		}
		
	}
	
	public void mostrarAlumno(int id) {
		if(findByID(id) != null) {
			System.out.println(findByID(id));
		}else {
			System.out.println("Ese alumno no existe");
		}
	}
	
	public void mostrarLista() {
		for (Alumno alumno : listado) {
			System.out.println(alumno);
		}
	}
	
	public void editarNotaMedia(int id, double nuevaNota) {
		findByID(id).setNotaMedia(nuevaNota);
	}
	
	public void agregarAlumno(Alumno a) {
		listado.add(a);
	}
	
	public void eliminarAlumno(int id) {
		listado.remove(findByID(id));
	}

}
