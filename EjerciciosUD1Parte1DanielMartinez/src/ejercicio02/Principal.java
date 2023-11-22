package ejercicio02;

public class Principal {

	public static void main(String[] args) {
		double area1 = 0.0, largo = 50.0, ancho = 21, radio = 12;
		double prof1 = 2.5, prof2 = 1.8, volumenM1 = 0.0, volumenM2 = 0.0, volumenL1 = 0.0, volumenL2 = 0.0;
		double conv1 = 1000;
		double precioL = 1.8, precioFinal1 = 0.0, precioFinal2 = 0.0;

		System.out.println("Bienvenido a la calculadora de llenado de piscinas");
		System.out.println("****************************************************");
		System.out.println("Piscina olímpica (50m de largo, 21m de ancho y 2,5m de profundidad)");
		System.out.println("--------------------------------------------------------------------");
		area1 = largo * ancho;
		System.out.printf("El área es de %.0f metros \n", area1);

		System.out.println("\nAhora el volumen");
		System.out.println("--------------------------------------------------------------------");
		volumenM1 = area1 * prof1;
		volumenL1 = volumenM1 * conv1;
		System.out.printf("El volumen es de %.0f m^3, o %.0f litros \n", volumenM1, volumenL1);

		System.out.println("--------------------------------------------------------------------");
		precioFinal1 = precioL * volumenM1;
		System.out.println("*********************************************************************");
		System.out.println("Piscina circular (12m de radio y 1,8m de profundidad)");
		System.out.println("--------------------------------------------------------------------");
		volumenM2 = Math.PI*Math.pow(radio, 2)*prof2;
		
		volumenL2 = volumenM2 * conv1;
		precioFinal2 = precioL * volumenM2;
		System.out.printf(
				"\nEl volumen es %.2f m^3, o %.2f litros",
				volumenM2, volumenL2);
		System.out.println("\n--------------------------------------------------------------------");
		System.out.printf("Precio de llenado (1,80€ el m^3 de agua): \n-Piscina olímpica: %.2f€ \n-Piscina circular: %.2f€", precioFinal1, precioFinal2);
		System.out.println("\nGracias y buen día");

	}

}
