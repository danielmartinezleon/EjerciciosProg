package ejercicio;

public class Batmovil extends Vehiculo {

	private int numRuedas;

	public Batmovil(String matricula, double tamanho, int anioFabricacion, boolean alquilado, int numRuedas) {
		super(matricula, tamanho, anioFabricacion, alquilado);
		this.numRuedas = numRuedas;
	}

	public int getNumRuedas() {
		return numRuedas;
	}



	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}

	@Override
	public String toString() {
		return "Batmovil [numRuedas=" + numRuedas + "]";
	}

	@Override
	public double calcularPrecio() {
		double totRuedas = 0;
		double total = 0;
		totRuedas = numRuedas * 2;
		total = super.calcularPrecio() + totRuedas;
		return total;
	}

}
