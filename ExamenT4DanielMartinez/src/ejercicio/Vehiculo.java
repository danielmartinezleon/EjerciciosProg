package ejercicio;

public class Vehiculo implements IAparcamiento{

	private String matricula;
	private int minsAparcado;
	private boolean aparcado;

	public Vehiculo(String matricula, int minsAparcado, boolean aparcado) {
		this.matricula = matricula;
		this.minsAparcado = minsAparcado;
		this.aparcado = aparcado;
	}

	public String getMatricula() {
		return matricula;
	}



	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}



	public int getMinsAparcado() {
		return minsAparcado;
	}



	public void setMinsAparcado(int minsAparcado) {
		this.minsAparcado = minsAparcado;
	}



	public boolean isAparcado() {
		return aparcado;
	}



	public void setAparcado(boolean aparcado) {
		this.aparcado = aparcado;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", minsAparcado=" + minsAparcado + ", aparcado=" + aparcado + "]";
	}

	@Override
	public double calcularPrecio(double precioMin) {
		double total = 0;
		total = minsAparcado * precioMin;
		
		return total;
	}
	
	
}
