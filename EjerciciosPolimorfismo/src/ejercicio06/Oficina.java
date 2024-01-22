package ejercicio06;

public class Oficina {

	private Cuenta[] cuentas;
	private int cantCuentas;

	public Oficina(Cuenta[] cuentas, int cantCuentas) {
		this.cuentas = cuentas;
		this.cantCuentas = cantCuentas;
	}
	
	public void add(Cuenta c) {
		cuentas[cantCuentas] = c;
		cantCuentas++;
	}
	
	public double calcularTotalOficina() {
		double totOficina = 0;
		
		for (int i = 0; i < cuentas.length; i++) {
			totOficina+=cuentas[i].getSaldo();
		}
		
		return totOficina;
	}

	public double calcularTotalRegalado() {
		double totRegalado = 0;
		for (int i = 0; i < cuentas.length; i++) {
			if (cuentas[i] instanceof CuentaJoven) {
				totRegalado+=1;
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
