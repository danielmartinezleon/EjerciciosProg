package ejercicio02;

public class Ppal {

	public static void main(String[] args) {
		Producto p1= new Producto("iPhone 15", 0);
		Trabajador t1 = new Trabajador("Daniel Martínez", 1100, 5);
		
		System.out.println("IVA de "+p1.getNombre()+"= "+p1.calcularIva(1200, 21));
		System.out.println("IRPF de "+t1.getNombre()+"= "+t1.calcularIrpf(t1.getSalarioBruto()));

	}

}
