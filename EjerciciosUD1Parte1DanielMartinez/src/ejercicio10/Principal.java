package ejercicio10;

public class Principal {

	public static void main(String[] args) {
		
		String nomProd="Pasta térmica";
		int cant = 4;
		double prod = 12.99, subTotal = 0, desc = 3, totDesc = 0,
				total = 0, conv = 100;
		
		System.out.println("Bienvenido a PcComponentes\n");
		System.out.println("\nTICKET DE COMPRA");
		System.out.println("----------------------------\n");
		System.out.println("CANTIDAD |   PRODUCTO   | P. UNIDAD | SUBTOTAL");
		System.out.println("------------------------------------------------");
		subTotal = prod * cant;
		totDesc = (subTotal * desc) / conv;
		total = subTotal - totDesc;
		System.out.printf("    %d    | %s|   %.2f€  | %.2f€\n", cant, nomProd, prod, subTotal);
		System.out.println("------------------------------------------------");
		System.out.printf("DESCUENTO APLICADO: %.0f%%\n"
				+ "TOTAL: %.2f€\n", desc, total);
		System.out.println("\nGRACIAS POR SU COMPRA");

	}

}
