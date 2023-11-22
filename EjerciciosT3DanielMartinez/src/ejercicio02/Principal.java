package ejercicio02;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		String aux;
    	double radio = 0;
        Circulo cir1;
        System.out.println("Bienvenido al programa");
        System.out.println("------------------------");
        System.out.println("Dime el radio del círculo en centímetros:");
        aux=sc.nextLine();
        radio = Double.parseDouble(aux);

        cir1 = new Circulo(radio);

        double areaCm2 = cir1.calcularAreaCm2(radio);
        double areaM2 = cir1.convertirCm2aM2(areaCm2);

        cir1.imprimirCm2(areaCm2);
        cir1.imprimirM2(areaM2);
    }
}
