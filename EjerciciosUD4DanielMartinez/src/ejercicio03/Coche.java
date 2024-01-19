package ejercicio03;

public class Coche extends Vehiculo{

	public Coche(double tipo, int cilindrada, int potencia) {
		super(tipo, cilindrada, potencia);
		
	}
	
	public double calcularImpuesto() {
        return tipo + (0.25 * getPotencia());
    }


}
