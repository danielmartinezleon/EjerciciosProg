package ejercicio02;

public class Circulo {
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularAreaCm2(double radio) {
        double area = 0;
        area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    public double convertirCm2aM2(double areaCm2) {
        double areaM2 = areaCm2 / 10000;
        return areaM2;
    }

    public void imprimirCm2(double areaCm2) {
        System.out.printf("El área es de %.2f cm^2\n", areaCm2);
    }

    public void imprimirM2(double areaM2) {
        System.out.printf("El área es de %.3f m^2\n", areaM2);
    }
}
