package ejercicio1;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Secretaria {

	private List<Alumno> lista;

	public Secretaria(List<Alumno> lista) {
		this.lista = lista;
	}

	public List<Alumno> getLista() {
		return lista;
	}

	public void setLista(List<Alumno> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Secretaria [lista=" + lista + "]";
	}
	
	public Alumno findNombreYApellidos(String nombre, String apellidos){
		
		return lista.stream().filter(alumno -> alumno.getNombre().equalsIgnoreCase(nombre)
				&& alumno.getApellidos().equalsIgnoreCase(apellidos))
		.findAny().get();
	}
	
	public void mostrarLista(List<Alumno> listado) {
		listado.stream().forEach(System.out::println);
	}
	
	public List<Alumno> calcularListaConInicial(String inicial){
		
		return lista.stream()
				.filter(alumno -> alumno.getNombre().startsWith(inicial))
				.toList();
	}
	
	public long calcularTamLista() {
		
		return lista.stream().count();
	}
	
	public List<Alumno> calcularMedia9DAM(){
		double tope = 9;
		String curso = "1DAM";
		return lista.stream()
				.filter(alumno -> alumno.getNotaMedia() > tope &&
				alumno.getNombreCurso().equalsIgnoreCase(curso))
				.toList();
	}
	
	public List<Alumno> devolver3Primeros(int limit){
		
		return lista.stream()
				.limit(limit)
				.toList();
	}
	
	public Alumno devolverMasJoven() {
		
		return lista.stream()
				.min(Comparator.comparing(Alumno::getEdad))
				.get();
		
	}
	
	public Optional<Alumno> devolverPrimero(){
		
		return lista.stream().findFirst();
	}
	
	public List<Alumno> devolverNombresMasDe10(){
		
		return lista.stream()
				.filter(alumno -> alumno.getNombre().length() > 10)
				.toList();
	}
	
	public List<Alumno> devolverInicAYLong6OMenos(){
		String inic = "A";
		
		return lista.stream()
				.filter(alumno -> alumno.getNombre()
						.startsWith(inic)
						&& alumno.getNombre()
						.length() <= 6)
				.toList();
	}
}
