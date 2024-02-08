package ejercicio01;

public class Nota {
	
	private String titulo;
	private int id;
	private String cuerpo;
	
	public Nota(String titulo, int id, String cuerpo) {
		this.titulo = titulo;
		this.id = id;
		this.cuerpo = cuerpo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

	@Override
	public String toString() {
		return "Nota [titulo=" + titulo + ", id=" + id + ", cuerpo=" + cuerpo + "]";
	}
	
	

}
