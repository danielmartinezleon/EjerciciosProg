package ejercicio08;

public class Principal {

	public static void main(String[] args) {

		double radioCir1 = 3, radioCir2 = 5.2, longCir1 = 0, areaCir2 = 0;

		System.out.println("Bienvenido a los cálculos sobre circunferencias");
		System.out.println("/////////////////////////////////////////////////");
		System.out.printf("En primer lugar vamos a calcular la longitud de una circunferencia" 
		+ " de %.0f de radio\n", radioCir1);
		
		longCir1 = Math.PI * 2 * radioCir1;
		System.out.printf("\nLa fórmula sería 2*π*radio, en este caso 2*π*%.0f y daría "
				+ "%.2fcm", radioCir1, longCir1);
		System.out.println("\n__________________________________________________\n");
		System.out.printf("\nEn segundo lugar vamos a calcular el área de un circulo de %.1fcm"
				+ " de radio\n", radioCir2);
		areaCir2 = Math.PI * Math.pow(radioCir2, 2);
		System.out.printf("\nLa fórmula sería π*radio^2, en este caso π*%.1f^2 y daría %.2fcm\n", radioCir2, areaCir2);
		System.out.println("\nGracias y buen día");

	}

}
