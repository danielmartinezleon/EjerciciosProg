package ejercicio01;

public class Cabecera {

	private String asignatura;
	private String fecha;
	private int aula;
	
	public Cabecera(String asignatura, String fecha, int aula) {
		this.asignatura = asignatura;
		this.fecha = fecha;
		this.aula = aula;
	}
	
	public void imprimirCabecera() {
		System.out.println("\tSALESIANOS TRIANA");
		System.out.println("-------------------------------------");
		System.out.println("Asignatura: "+asignatura);
		System.out.println("Fecha: "+fecha);
		System.out.println("Nº Aula: "+aula);
		System.out.println("-------------------------------------");
	}
	
	
}
