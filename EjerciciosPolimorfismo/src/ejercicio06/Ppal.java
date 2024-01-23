package ejercicio06;

public class Ppal {

	public static void main(String[] args) {
		int tam = 3;
		Cuenta cuentaCorriente = new CuentaCorriente(122, 1000, 20, 0);
        Cuenta cuentaJoven = new CuentaJoven(234, 500, 0);
        Cuenta cuentaEmpresa = new CuentaEmpresa(567, 5000, 0);

        Cuenta [] cuentas = new Cuenta[tam];
        cuentas[0]= cuentaCorriente;
        cuentas[1]= cuentaJoven;
        cuentas[2]= cuentaEmpresa;
        
        Oficina ofi = new Oficina(cuentas);
        
        ((CuentaCorriente)cuentaCorriente).ingresar(cuentaCorriente, 200);
        ((CuentaJoven)cuentaJoven).ingresar(cuentaJoven, 100);
        ((CuentaEmpresa)cuentaEmpresa).reintegrar(cuentaEmpresa, 300);
       
        
        System.out.println("Impuestos pagados por sacar del cajero: " + ofi.calcularImpuestosEmpresas());
        System.out.println("Regalos por ingresos en cuentas joven: " + ofi.calcularTotalRegalado());
        System.out.println("-".repeat(60));
        ((CuentaCorriente)cuentaCorriente).calcularTotal(cuentaCorriente);
        ((CuentaJoven)cuentaJoven).calcularTotal(cuentaJoven);
        ((CuentaEmpresa)cuentaEmpresa).calcularTotal(cuentaEmpresa);
        System.out.println("Saldo cuenta corriente: "+cuentaCorriente.getSaldo());
        System.out.println("Saldo cuenta joven: "+cuentaJoven.getSaldo());
        System.out.println("Saldo cuenta empresa: "+cuentaEmpresa.getSaldo());
        System.out.println("Total dinero en la oficina: " + ofi.calcularTotalOficina());

	}

}
