package ejercicio06;

public abstract class Cuenta {
	
	private int numCuenta;
	private double saldo;
	
	public Cuenta(int numCuenta, double saldo) {
		this.numCuenta = numCuenta;
		this.saldo = saldo;
	}

	public int getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "numCuenta=" + numCuenta + ", saldo=" + saldo;
	}
	
	public double ingresar() {
		return 0;
	}
	
	public double reintegrar() {
		return 0;
	}
	
	public double calcularTotal() {
		return 0;
	}

}
