package ejercicio12;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre="Daniel", empleado="John Snow", nomc="Coca Cola", nomp="Pipas", nomg="Espada 'Garra'";
		double prod1=4.0;
		double pProd1=0.70;
		double tProd1=0.0;
		double prod2=1.0;
		double pProd2=0.40;
		double tProd2=0.0;
		double prod3=1.0;
		double pProd3=150.0;
		double tProd3=0.0;
		double total=0.0;
		
		System.out.println("Hola, estimado cliente, mi nombre es "+empleado+", aquí está su ticket\n");
		
		System.out.println("Atendido por: "+empleado);
		System.out.println("Cantidad | Producto | Precio");
		System.out.println("----------------------------------");
		tProd1=prod1*pProd1;
		System.out.printf("%.0f x %s \t\t %.2f €"+'\n',prod1,nomc,tProd1);
		tProd2=prod2*pProd2;
		System.out.printf("%.0f x %s \t\t %.2f €"+'\n',prod2,nomp,tProd2);
		tProd3=prod3*pProd3;
		System.out.printf("%.0f x %s \t %.2f €"+'\n',prod3,nomg,tProd3);
		System.out.println("----------------------------------");
		total=tProd1+tProd2+tProd3;
		System.out.printf("Total: %.2f €"+'\n',total);

	}

}