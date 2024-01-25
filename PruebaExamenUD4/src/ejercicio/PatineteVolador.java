package ejercicio;

public class PatineteVolador extends Vehiculo {

	private int potenciaCv;

	
	public PatineteVolador(String matricula, double tamanho, int anioFabricacion, boolean alquilado, int potenciaCv) {
		super(matricula, tamanho, anioFabricacion, alquilado);
		this.potenciaCv = potenciaCv;
	}


	public int getPotenciaCv() {
		return potenciaCv;
	}


	public void setPotenciaCv(int potenciaCv) {
		this.potenciaCv = potenciaCv;
	}


	@Override
	public String toString() {
		return "PatineteVolador [potenciaCv=" + potenciaCv + "]";
	}


	@Override
	public double calcularPrecio() {
		double totCv = 0;
		double tot = 0;
		
		totCv = potenciaCv * 1;
		tot = super.calcularPrecio()+totCv;

		return tot;
	}
}
