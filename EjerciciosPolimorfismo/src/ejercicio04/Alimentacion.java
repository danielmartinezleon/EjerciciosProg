package ejercicio04;

public class Alimentacion extends Producto{
	
	private int diasParaCaducar;

	public Alimentacion(double precioUnitario, String nombre, int identificador, int diasParaCaducar) {
		super(precioUnitario, nombre, identificador);
		this.diasParaCaducar = diasParaCaducar;
	}
	
	public int getDiasParaCaducar() {
		return diasParaCaducar;
	}

	public void setDiasParaCaducar(int diasParaCaducar) {
		this.diasParaCaducar = diasParaCaducar;
	}

	@Override
	public String toString() {
		return "Alimentacion [diasParaCaducar=" + diasParaCaducar + "]";
	}

	public boolean comprobarCaducidad(Producto p) {
		int tope = 2;
		boolean caducaEn2Dias = false;
		if(p instanceof Alimentacion) {
			if(((Alimentacion)p).diasParaCaducar < tope) {
				caducaEn2Dias = true;
			}
		}
		return caducaEn2Dias;
	}
	
	

}
