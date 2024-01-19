package ejercicio03;

public class Furgoneta extends Vehiculo{

	public Furgoneta(double tipo, int cilindrada, int potencia) {
		super(tipo, cilindrada, potencia);
		
	}
	
	  public double calcularImpuesto() {
	        return tipo + 100;
	    }

}
