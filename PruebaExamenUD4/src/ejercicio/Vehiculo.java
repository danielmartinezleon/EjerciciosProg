package ejercicio;

public class Vehiculo implements IAlquiler{
	
	private String matricula;
	private double tamanho;
	private int anioFabricacion;
	private boolean alquilado;
	
	public Vehiculo(String matricula, double tamanho, int anioFabricacion, boolean alquilado) {
		this.matricula = matricula;
		this.tamanho = tamanho;
		this.anioFabricacion = anioFabricacion;
		this.alquilado = alquilado;
	}

	public String getMatricula() {
		return matricula;
	}





	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}





	public double getTamanho() {
		return tamanho;
	}





	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}





	public int getAnioFabricacion() {
		return anioFabricacion;
	}





	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}





	public boolean isAlquilado() {
		return alquilado;
	}





	public void setAlquilado(boolean alquilado) {
		this.alquilado = alquilado;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", tamanho=" + tamanho + ", anioFabricacion=" + anioFabricacion
				+ ", alquilado=" + alquilado + "]";
	}

	@Override
	public double calcularPrecio() {
		return tamanho*anioFabricacion;
	}
	
	

}
