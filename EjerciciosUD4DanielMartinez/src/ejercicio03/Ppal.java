package ejercicio03;

public class Ppal {

	public static void main(String[] args) {
		Motocicleta moto = new Motocicleta("Motocicleta", 500, 30);
        Coche coche = new Coche("Coche", 1600, 120);
        Furgoneta furgoneta = new Furgoneta("Furgoneta", 2000, 80);

        System.out.println("Impuesto para la " + moto.getTipo() + ": €" + moto.calcularImpuesto());
        System.out.println("Impuesto para el " + coche.getTipo() + ": €" + coche.calcularImpuesto());
        System.out.println("Impuesto para la " + furgoneta.getTipo() + ": €" + furgoneta.calcularImpuesto());

	}

}
