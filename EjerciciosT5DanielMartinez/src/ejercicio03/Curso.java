package ejercicio03;

import java.util.Iterator;

public class Curso {

	private CrudAlumno ca;

	public Curso(CrudAlumno ca) {
		this.ca = ca;
	}

	public CrudAlumno getCa() {
		return ca;
	}

	public void setCa(CrudAlumno ca) {
		this.ca = ca;
	}

	@Override
	public String toString() {
		return "Curso [ca=" + ca + "]";
	}

	public double calcularMediaCurso() {
		double mediaCurso = 0;
		Iterator<Alumno> it = ca.getListado().iterator();
		Alumno a = null;

		while (it.hasNext()) {
			a = it.next();
			mediaCurso += a.getNotaMedia();
		}
		mediaCurso = mediaCurso / ca.getListado().size();

		return mediaCurso;
	}

	public int calcularTotSuspensos() {
		int totalSuspensos = 0;
		Iterator<Alumno> it = ca.getListado().iterator();
		Alumno a = null;
		
		while (it.hasNext()) {
			a = it.next();
			if(a.getNotaMedia() < 5) {
				totalSuspensos++;
			}
			
		}
		return totalSuspensos;
	}
	
	public double calcularMediaSuspensos() {
		double mediaSuspensos = 0;
		Iterator<Alumno> it = ca.getListado().iterator();
		Alumno a = null;

		while (it.hasNext()) {
			a = it.next();
			if(a.getNotaMedia() < 5) {
				mediaSuspensos += a.getNotaMedia();
			}
		}
		mediaSuspensos = mediaSuspensos / calcularTotSuspensos();

		return mediaSuspensos;
	}
	
}
