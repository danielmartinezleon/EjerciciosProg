package ejercicio3;

import java.util.List;

public class Playlist {
	
	private List<Cancion> lista;

	public Playlist(List<Cancion> lista) {
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
		return "Playlist [lista=" + lista + "]";
	}
	
	public List<Cancion> findByGenero(String genero) {
		
		return lista.stream()
				.filter(cancion -> cancion.getGenero()
				.equalsIgnoreCase(genero)).toList();
	}
	
	public List<Cancion> findByMayorDuracion(double duracion) {
		
		return lista.stream()
				.filter(cancion -> cancion.getDuracion() >= duracion)
				.toList();
	}
	
	public long contarInterpretesDistintos() {
        return lista.stream()
                .map(Cancion::getAutor)
                .distinct()
                .count();
    }
	
	public List<Cancion> findByNombre(String nombre) {
		
		return lista.stream()
				.filter(cancion -> cancion.getNombre().equalsIgnoreCase(nombre))
				.toList();
	}
	
	public List<Cancion> findByAutor(String autor) {
		
		return lista.stream()
				.filter(cancion -> cancion.getAutor().equalsIgnoreCase(autor))
				.toList();
	}
	
	public long contarCancionesPorGenero(String genero) {
        return lista.stream()
                .filter(c -> c.getGenero().equalsIgnoreCase(genero))
                .count();
    }
	
	public void mostrarLista(List<Cancion> listado) {
		listado.stream().forEach(System.out::println);
	}

}
