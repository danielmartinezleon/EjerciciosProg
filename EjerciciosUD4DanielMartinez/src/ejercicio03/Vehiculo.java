package ejercicio03;

public class Vehiculo {
    protected double tipo;
    private int cilindrada;
    private int potencia;

    public Vehiculo(double tipo, int cilindrada, int potencia) {
        this.tipo = tipo;
        this.cilindrada = cilindrada;
        this.potencia = potencia;
    }

    public double calcularImpuesto() {
        return tipo;
    }
    
	public double getTipo() {
		return tipo;
	}

	public void setTipo(double tipo) {
		this.tipo = tipo;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "Vehiculo [tipo=" + tipo + ", cilindrada=" + cilindrada + ", potencia=" + potencia + "]";
	}
    
    
}