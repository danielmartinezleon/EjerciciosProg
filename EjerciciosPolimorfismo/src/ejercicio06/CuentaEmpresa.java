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
		return "CuentaEmpresa ["+super.toString()+ "]";
	}
	
	public double ingresar(Cuenta c, double cantidad) {
		c.setSaldo(c.getSaldo()+cantidad);
		return c.getSaldo();
	}
	
	public double reintegrar(Cuenta c, double cantidad) {
		c.setSaldo(c.getSaldo()-cantidad-impuesto);
		return c.getSaldo();
	}

	public double calcularTotal(Cuenta c) {
		double tot = 0;
		if (c instanceof CuentaEmpresa)
		c.setSaldo(c.getSaldo());
		
		tot = c.getSaldo();
		
		return tot;
	}

}
