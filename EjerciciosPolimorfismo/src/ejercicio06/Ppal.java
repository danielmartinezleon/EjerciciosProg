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

        
        cuentaCorriente.ingresar(cuentaCorriente, 200);
        cuentaJoven.ingresar(cuentaJoven, 100);
        cuentaEmpresa.reintegrar(cuentaEmpresa, 300);
        
        Oficina ofi = new Oficina(cuentas);

       
        System.out.println("Total dinero en la oficina: " + ofi.calcularTotalOficina());
        System.out.println("Ganancias por comisiones de cuentas empresa: " + ofi.calcularGananciasEmpresas());
        System.out.println("Regalos por ingresos en cuentas joven: " + ofi.calcularTotalRegalado());

	}

}
