package ejercicio11;

public class Principal {

	public static void main(String[] args) {
		
		double litroXSeg=8, horas=24, min=60, 
				seg=60, litroXmin=0, litroXHora=0,
				totalL=0, m3=0, conv=1000;
		
		System.out.println("Bienvenido, vamos a calcular cuantos m^3\n"
				+ "se llenan durante 24h con un caudal de 8L");
		System.out.println("---------------------------------------------------------------------");
		litroXmin=litroXSeg*seg;
		litroXHora=litroXmin*min;
		totalL=litroXHora*horas;
		m3=totalL/conv;
		System.out.printf("Si el caudal es de %.0fL por segundo, al minuto serán %.0fL\n"
				+ "y a la hora %.0fL, que serían %.0fL al día, o %.2fm^3\n", litroXSeg, litroXmin,
				litroXHora, totalL, m3);

	}

}
