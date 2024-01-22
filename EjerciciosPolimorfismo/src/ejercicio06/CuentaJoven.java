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
	
	public double ingresar(Cuenta c, int cantidad) {
		if (c instanceof CuentaJoven) {
			c.setSaldo(c.getSaldo()+cantidad);
			regaloIngreso++;
		}
		return c.getSaldo();
	}
	
	public double reintegrar(Cuenta c, int cantidad) {
		if (c instanceof CuentaJoven) {
			c.setSaldo(c.getSaldo()-cantidad);
		}
		return c.getSaldo();
	}
	
	public double calcularTotal(Cuenta c) {
		double tot = 0;
		if (c instanceof CuentaJoven)
		tot = c.getSaldo()+regaloIngreso;
		
		return tot;
	}
	
	

}
