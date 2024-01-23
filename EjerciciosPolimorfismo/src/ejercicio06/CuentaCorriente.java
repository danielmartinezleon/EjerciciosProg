package ejercicio06;

public class CuentaCorriente extends Cuenta{
	
	private double mantenimiento;
	private int puntos;
	
	public CuentaCorriente(int numCuenta, double saldo, double mantenimiento, int puntos) {
		super(numCuenta, saldo);
		this.mantenimiento = mantenimiento;
		this.puntos = puntos;
	}

	public double getMantenimiento() {
		return mantenimiento;
	}

	public void setMantenimiento(double mantenimiento) {
		this.mantenimiento = mantenimiento;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	@Override
	public String toString() {
		return "CuentaCorriente ["+super.toString()+" puntos=" + puntos + "]";
	}
	
	public double ingresar(Cuenta c, double cantidad) {
		c.setSaldo(c.getSaldo()+cantidad);
		puntos++;
		return c.getSaldo();
	}
	
	public double reintegrar(Cuenta c, double cantidad) {
		c.setSaldo(c.getSaldo()-cantidad);
		return c.getSaldo();
	}
	
	public double calcularTotal(Cuenta c) {
		double tot = 0;
		if (c instanceof CuentaCorriente)
		c.setSaldo(c.getSaldo()-mantenimiento);
		
		tot = c.getSaldo();
		
		return tot;
	}


}
