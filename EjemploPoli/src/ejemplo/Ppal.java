package ejemplo;

public class Ppal {

	public static void main(String[] args) {
		
		OperacionesFiguras op = new OperacionesFiguras();
		Cuadrado c = new Cuadrado("C1", "Negro", 2);
		Figura f = new Cuadrado("C2", "Rojo", 4);
		Figura f2 = new Circulo("Circ", "Blanco", 3);
		
		System.out.printf("El área es %.2f", op.calcularElAreaDeUnaFigura(c));
		System.out.printf("\nEl área es %.2f", op.calcularElAreaDeUnaFigura(f));
		System.out.printf("\nEl área es %.2f", op.calcularElAreaDeUnaFigura(f2));

	}

}
