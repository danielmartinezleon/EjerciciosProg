package ejercicio06;

public class Oficina {

	private Cuenta[] cuentas;
	private int cantCuentas;

	public Oficina(Cuenta[] cuentas) {
		this.cuentas = cuentas;
	}
	
	public void add(Cuenta c) {
		cuentas[cantCuentas] = c;
		cantCuentas++;
	}
	
	public double calcularTotalOficina() {
		double totOficina = 0;
		
		for (int i = 0; i < cuentas.length; i++) {
			if (cuentas[i] instanceof CuentaCorriente) {
				((CuentaCorriente)cuentas[i]).calcularTotal();
			}else if (cuentas[i] instanceof CuentaJoven) {
				((CuentaJoven)cuentas[i]).calcularTotal();
			}else if (cuentas[i] instanceof CuentaEmpresa) {
				((CuentaEmpresa)cuentas[i]).calcularTotal();
			}
			
			totOficina+=cuentas[i].getSaldo();
		}
		
		return totOficina;
	}

	public double calcularTotalRegalado() {
		double totRegalado = 0;
		for (int i = 0; i < cuentas.length; i++) {
			if (cuentas[i] instanceof CuentaJoven) {
				totRegalado+= ((CuentaJoven)cuentas[i]).getRegaloIngreso();
				}
			}
		
		return totRegalado;
	}
	
	 public double calcularGananciasEmpresas() {
	        double gananciasEmpresas = 0;
	        for (int i = 0; i < cuentas.length; i++) {
	            if (cuentas[i] instanceof CuentaEmpresa) {
	                gananciasEmpresas += ((CuentaEmpresa) cuentas[i]).getImpuesto();
	            }
	        }
	        return gananciasEmpresas;

}
}
