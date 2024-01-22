package ejercicio06;

public class Ppal {

	public static void main(String[] args) {
		int tam = 3;
		CuentaCorriente cuentaCorriente = new CuentaCorriente(122, 1000, 20, 0);
        CuentaJoven cuentaJoven = new CuentaJoven(234, 500, 0);
        CuentaEmpresa cuentaEmpresa = new CuentaEmpresa(567, 5000, 0);

        Cuenta [] cuentas = new Cuenta[tam];
        cuentas[0]= cuentaCorriente;
        cuentas[1]= cuentaJoven;
        cuentas[2]= cuentaEmpresa;
        
        Oficina ofi = new Oficina(cuentas);
        
        cuentaCorriente.ingresar(cuentaCorriente, 200);
        cuentaJoven.ingresar(cuentaJoven, 100);
        cuentaEmpresa.reintegrar(cuentaEmpresa, 300);
       
        System.out.println("Total dinero en la oficina: " + ofi.calcularTotalOficina());
        System.out.println("Impuestos pagados por sacar del cajero: " + ofi.calcularGananciasEmpresas());
        System.out.println("Regalos por ingresos en cuentas joven: " + ofi.calcularTotalRegalado());
        System.out.println("-".repeat(60));
        cuentaCorriente.calcularTotal(cuentaCorriente);
        cuentaJoven.calcularTotal(cuentaJoven);
        cuentaEmpresa.calcularTotal(cuentaEmpresa);
        System.out.println("Saldo cuenta corriente: "+cuentaCorriente.getSaldo());
        System.out.println("Saldo cuenta jove: "+cuentaJoven.getSaldo());
        System.out.println("Saldo cuenta empresa: "+cuentaEmpresa.getSaldo());

	}

}
