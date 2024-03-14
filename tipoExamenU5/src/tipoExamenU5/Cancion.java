package tipoExamenU5;

import java.util.Comparator;

public class Cancion implements Comparator<Cancion>{

	private int id;
	private String titulo;
	private String interprete;
	private int vecesEscuchada;
	private boolean gratis;
	private double duracion;
	
	public Cancion(int id, String titulo, String interprete, int vecesEscuchada, boolean gratis, double duracion) {
		this.id = id;
		this.titulo = titulo;
		this.interprete = interprete;
		this.vecesEscuchada = vecesEscuchada;
		this.gratis = gratis;
		this.duracion = duracion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getInterprete() {
		return interprete;
	}

	public void setInterprete(String interprete) {
		this.interprete = interprete;
	}

	public int getVecesEscuchada() {
		return vecesEscuchada;
	}

	public void setVecesEscuchada(int vecesEscuchada) {
		this.vecesEscuchada = vecesEscuchada;
	}

	public boolean isGratis() {
		return gratis;
	}

	public void setGratis(boolean gratis) {
		this.gratis = gratis;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Cancion [id=" + id + ", titulo=" + titulo + ", interprete=" + interprete + ", vecesEscuchada="
				+ vecesEscuchada + ", gratis=" + gratis + ", duracion=" + duracion + "]";
	}

	@Override
	public int compare(Cancion o1, Cancion o2) {
		String nombre1 = o1.getInterprete();
		String nombre2 = o2.getInterprete();
		
		return (nombre1.toLowerCase().compareTo(nombre2.toLowerCase()));
	}

	
	
	
	
}
