package ejercicio;

public class Alimentacion extends Producto{
	
	private double porcenDescuento;
	private boolean caducaEn2Dias;
	
	public Alimentacion(String nombre, int identificador, double pUnitario, double porcenDescuento,
			boolean caducaEn2Dias) {
		super(nombre, identificador, pUnitario);
		this.porcenDescuento = porcenDescuento;
		this.caducaEn2Dias = caducaEn2Dias;
	}

	public double getPorcenDescuento() {
		return porcenDescuento;
	}

	public void setPorcenDescuento(double porcenDescuento) {
		this.porcenDescuento = porcenDescuento;
	}

	public boolean isCaducaEn2Dias() {
		return caducaEn2Dias;
	}

	public void setCaducaEn2Dias(boolean caducaEn2Dias) {
		this.caducaEn2Dias = caducaEn2Dias;
	}

	@Override
	public String toString() {
		return super.toString()+" Alimentacion [porcenDescuento=" + porcenDescuento + ", caducaEn2Dias=" + caducaEn2Dias + "]";
	}

	@Override
	public double calcularPVP() {
		double cien = 100;
		if(caducaEn2Dias) {
			return super.getpUnitario()-((super.getpUnitario()*porcenDescuento)/cien);
		}else {
			return super.getpUnitario();
		}
	}
	
	public void mostrarCaducaEn2Dias() {
		if(caducaEn2Dias) {
			System.out.println("Este producto caduca en menos de 2 días");
		}
	}
	
	

}
