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
		return "CuentaCorriente [mantenimiento=" + mantenimiento + ", puntos=" + puntos + "]";
	}
	
	public double ingresar(Cuenta c, int cantidad) {
		c.setSaldo(c.getSaldo()+cantidad);
		puntos++;
		return c.getSaldo();
	}
	
	public double reintegrar(Cuenta c, int cantidad) {
		c.setSaldo(c.getSaldo()-cantidad);
		return c.getSaldo();
	}
	
	public double calcularTotal(Cuenta c) {
		return c.getSaldo()-mantenimiento;
	}


}
