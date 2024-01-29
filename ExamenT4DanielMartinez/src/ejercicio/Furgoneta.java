package ejercicio;

public class Furgoneta extends Vehiculo {

	private double longitudMetros;

	public Furgoneta(String matricula, int minsAparcado, boolean aparcado, double longitudMetros) {
		super(matricula, minsAparcado, aparcado);
		this.longitudMetros = longitudMetros;
	}

	public double getLongitudMetros() {
		return longitudMetros;
	}



	public void setLongitudMetros(double longitudMetros) {
		this.longitudMetros = longitudMetros;
	}
	
	@Override
	public String toString() {
		return super.toString()+" Furgoneta [longitudMetros=" + longitudMetros + "]";
	}

	public double calcularPrecio(double precioMin) {
		double maxLong = 4;
		double totFurgo = 0;
		double totExtra = 0;
		double metrosDeMas = 0;
		double extraPorMetro = 5;
		
		if(longitudMetros > maxLong) {
			metrosDeMas = longitudMetros - maxLong;
			totExtra = metrosDeMas * extraPorMetro;
			totFurgo = super.calcularPrecio(precioMin)+totExtra;
		}else {
			totFurgo = super.calcularPrecio(precioMin);
		}

		return totFurgo;
	}
}
