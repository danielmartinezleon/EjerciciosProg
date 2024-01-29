package ejercicio;

public class Moto extends Vehiculo{
	
	private int cc;

	public Moto(String matricula, int minsAparcado, boolean aparcado, int cc) {
		super(matricula, minsAparcado, aparcado);
		this.cc = cc;
	}
	
	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	@Override
	public String toString() {
		return super.toString()+" Moto [cc=" + cc + "]";
	}

	public double calcularPrecio(double precioMin) {
		double totMoto = 0;
		int mitad = 2;
		int tope = 250;
		
		if (cc < tope) {
			totMoto = super.calcularPrecio(precioMin)/mitad;
		}else {
			totMoto = super.calcularPrecio(precioMin);
		}
		
		
		return totMoto;
	}

}
