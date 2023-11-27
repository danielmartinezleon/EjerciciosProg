package ejercicio;

public class Vehiculo {

	private String modelo;
	private int potencia;
	
	public Vehiculo(String modelo, int potencia) {
		this.modelo = modelo;
		this.potencia = potencia;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "Vehiculo [modelo=" + modelo + ", potencia=" + potencia + "]";
	}
	
	
	
}
