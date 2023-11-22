package ejemplo1;

public class Alumno {

	//Atributos
	private String nombre;
	private int edad;
	private double notaMedia;
	
	
	//Constructores
	public Alumno() {
		
	}
	
	public Alumno(String nombre, int edad, double notaMedia) {
		this.nombre = nombre;
		this.edad = edad;
		this.notaMedia = notaMedia;
		
	}

	public Alumno(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//Métodos
	
	public void mostrarDatos(String calle) {
		System.out.println("Los datos del alumno son: ");
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
		System.out.println("Nota Media: "+notaMedia);
	}
	
}
