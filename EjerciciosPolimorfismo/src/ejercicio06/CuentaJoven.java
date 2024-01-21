package ejercicio06;

public class CuentaJoven extends Cuenta{
	
	private double regaloIngreso;

	public CuentaJoven(int numCuenta, double saldo, double regaloIngreso) {
		super(numCuenta, saldo);
		this.regaloIngreso = regaloIngreso;
	}

	public double getRegaloIngreso() {
		return regaloIngreso;
	}

	public void setRegaloIngreso(double regaloIngreso) {
		this.regaloIngreso = regaloIngreso;
	}

	@Override
	public String toString() {
		return "CuentaJoven [regaloIngreso=" + regaloIngreso + "]";
	}
	
	

}
