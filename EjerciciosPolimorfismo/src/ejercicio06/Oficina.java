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
			
			if(cuentas[i] != null) {
				totOficina+=cuentas[i].getSaldo();
			}
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
	
	 public double calcularImpuestosEmpresas() {
	        double gananciasEmpresas = 0;
	        for (int i = 0; i < cuentas.length; i++) {
	            if (cuentas[i] instanceof CuentaEmpresa) {
	                gananciasEmpresas += ((CuentaEmpresa) cuentas[i]).getImpuesto();
	            }
	        }
	        return gananciasEmpresas;

}
	 public void imprimirSaldo() {
		 for (int i = 0; i < cuentas.length; i++) {
				if(cuentas[i] != null) {
					System.out.println("nº de cuenta: "+((Cuenta)cuentas[i]).getNumCuenta()+"\n"
							+ "saldo: "+((Cuenta)cuentas[i]).getSaldo());
				}
			}
	 }
	 public void imprimirCuentas() {
		 for (int i = 0; i < cuentas.length; i++) {
				if(cuentas[i] != null)
				System.out.println(i+1+". "+cuentas[i]);
			}
	 }
}
