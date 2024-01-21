package ejercicio06;

public class CuentaEmpresa extends Cuenta{
	
	private double impuesto;

	public CuentaEmpresa(int numCuenta, double saldo, double impuesto) {
		super(numCuenta, saldo);
		this.impuesto = impuesto;
	}

	public double getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}

	@Override
	public String toString() {
		return "CuentaEmpresa [impuesto=" + impuesto + "]";
	}
	
	

}
