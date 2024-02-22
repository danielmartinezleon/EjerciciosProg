package ejercicio;

public class Cancion {
	
	private String artista;
	private String titulo;
	private double duracion;
	
	public Cancion(String artista, String titulo, double duracion) {
		this.artista = artista;
		this.titulo = titulo;
		this.duracion = duracion;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Cancion [artista=" + artista + ", titulo=" + titulo + ", duracion=" + duracion + "]";
	}
	
	

}
