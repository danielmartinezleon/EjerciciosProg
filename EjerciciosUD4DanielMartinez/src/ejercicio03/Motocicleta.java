package ejercicio03;

public class Motocicleta extends Vehiculo{

	public Motocicleta(double tipo, int cilindrada, int potencia) {
		super(tipo, cilindrada, potencia);
	}

	public double calcularImpuesto() {
        return tipo + (0.6 * getCilindrada());
    }
	
	
}
