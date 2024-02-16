package ejercicio03;

public class Alumno {
	
	private String nombre;
	private String apellidos;
	private int id;
	private double notaMedia;
	
	public Alumno(String nombre, String apellidos, int id, double notaMedia) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.id = id;
		this.notaMedia = notaMedia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", id=" + id + ", notaMedia=" + notaMedia
				+ "]";
	}
	
	

}
