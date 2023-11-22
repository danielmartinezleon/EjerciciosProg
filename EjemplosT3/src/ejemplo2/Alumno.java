package ejemplo2;

public class Alumno {

	private String nombre;
	private double notaProg;
	private double notaBD;

	public Alumno(String nombre, double notaProg, double notaBD) {
		this.nombre = nombre;
		this.notaProg = notaProg;
		this.notaBD = notaBD;
	}

	public double calcularMedia() {
		double tot = 0, media = 0, dos = 2;
		tot = notaProg + notaBD;
		media = tot / dos;

		return media;

	}

	public void imprimirMedia(double media) {
		System.out.printf("La media de %s es: %.2f", nombre, media);
	}

}
