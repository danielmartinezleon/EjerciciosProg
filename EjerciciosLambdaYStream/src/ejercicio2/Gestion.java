package ejercicio2;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import ejercicio1.Alumno;

public class Gestion {

	private List<String> lista;

	public Gestion(List<String> lista) {
		this.lista = lista;
	}

	public List<String> getLista() {
		return lista;
	}

	public void setLista(List<String> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Gestion [lista=" + lista + "]";
	}
	
	public List<String> ordenarAlfabeticamente(){
		
		lista = lista.stream()
				.sorted().collect(Collectors.toList());
		
		return lista;

	}
	
	public String findByTexto(String texto) {
		
		return lista.stream()
                .filter(s -> s.equalsIgnoreCase(texto))
                .findFirst()
                .orElse(null);
	}
	
	public String crearPalabra() {
		
		return lista.stream()
                .flatMap(s -> List.of(s.split("\s+")).stream())
                .map(s -> s.substring(0, 1))
                .collect(Collectors.joining());
	}
	
	public void borrarImpares() {
	    lista = lista.stream()
	                 .filter(s -> s.length() % 2 == 0)
	                 .collect(Collectors.toList());
	}
	
	public void pasarAMayus() {
	    lista = lista.stream()
	                 .map(String::toUpperCase)
	                 .collect(Collectors.toList());
	}
	
	public void mostrarLista(List<String> listado) {
		listado.stream().forEach(System.out::println);
	}
}
