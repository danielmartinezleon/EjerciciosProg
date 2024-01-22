package ejercicio06;

public class Ppal {

	public static void main(String[] args) {
		int tam = 3;
		CuentaCorriente cuentaCorriente = new CuentaCorriente(122, 1000, 20, 0);
        CuentaJoven cuentaJoven = new CuentaJoven(234, 500, 0);
        CuentaEmpresa cuentaEmpresa = new CuentaEmpresa(567, 5000, 0);

        Oficina[] oficina = new Oficina[tam];
        oficina[0].add(cuentaCorriente);
        oficina[1].add(cuentaJoven);
        oficina[2].add(cuentaEmpresa);

        
        cuentaCorriente.ingresar(cuentaCorriente, 200);
        cuentaJoven.ingresar(cuentaJoven, 100);
        cuentaEmpresa.reintegrar(cuentaEmpresa, 300);

       
        System.out.println("Total dinero en la oficina: " + oficina[0].calcularTotalOficina());
        System.out.println("Ganancias por comisiones de cuentas empresa: " + oficina[1].calcularGananciasEmpresas());
        System.out.println("Regalos por ingresos en cuentas joven: " + oficina[2].calcularTotalRegalado());

	}

}
