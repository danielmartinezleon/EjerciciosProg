package ejercicio;

import java.util.LinkedList;
import java.util.List;

public class Playlist {

	private LinkedList<Cancion> lista;

	public Playlist(LinkedList<Cancion> lista) {
		this.lista = lista;
	}

	public LinkedList<Cancion> getLista() {
		return lista;
	}

	public void setLista(LinkedList<Cancion> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Playlist [lista=" + lista + "]";
	}

	public LinkedList<Cancion> findByArtista(String artista) {
		LinkedList<Cancion> aux = new LinkedList<Cancion>();
		for (Cancion cancion : lista) {
			if (cancion.getArtista().equalsIgnoreCase(artista)) {
				aux.add(cancion);
			}
		}
		return aux;
	}

	public int findByTitulo(String titulo) {
		boolean encontrado = false;
		int i = 0;

		while (i < lista.size() && !encontrado) {
			Cancion deLista = lista.get(i);
			if (deLista.getTitulo().equalsIgnoreCase(titulo)) {
				encontrado = true;
			} else {
				i++;
			}
		}

		if (encontrado) {
			return i;
		} else {
			return -1;
		}
	}

	public void mostrarLista() {
		int i = 1;
		for (Cancion cancion : lista) {
			System.out.println(i+"- "+cancion);
			i++;
		}
	}
	
	public void mostrarDeUnArtista(String nombre) {
		int i = 1;
		for (Cancion cancion : findByArtista(nombre)) {
			System.out.println(i+"- "+cancion);
			i++;
		}
	}

	public void agregarCancion(Cancion c) {
		lista.add(c);
	}

	public void agregarConPosicion(int p, Cancion c) {
		lista.add(p-1, c);
	}

	public void agregarAlPrincipio(Cancion c) {
		lista.addFirst(c);
	}

	public void agregarAlFinal(Cancion c) {
		lista.addLast(c);
	}

	public void eliminar(String nombre) {
		lista.remove(findByTitulo(nombre));
	}

	public void eliminarPrimera() {
		lista.removeFirst();
	}

	public void eliminarUltima() {
		lista.removeLast();
	}

	public void escuchar(int pos) {
		System.out.println("Estas escuchando: " + lista.get(pos-1));
	}

	public void escucharPrimera() {
		System.out.println("Estas escuchando: " + lista.peekFirst());
	}

	public void escucharUltima() {
		System.out.println("Estas escuchando: " + lista.peekLast());
	}

	public void escucharPrimeraYBorrar() {
		System.out.println("Estas escuchando: " + lista.pollFirst());
	}

	public void escucharUltimaYBorrar() {
		System.out.println("Estas escuchando: " + lista.pollLast());
	}

}
