package ejercicio03;

public class Operaciones {

	public Operaciones() {

	}

	public void comprobarPositivo(int num) {
		int cero = 0;
		if (num >= cero) {
			System.out.println(num + " es positivo");
		} else {
			System.out.println(num + " es negativo");
		}
	}

	public void comprobarPar(int num) {
		int par = 2;
		int cero = 0;
		if (num % par == cero) {
			System.out.println(num + " es par");
		} else {
			System.out.println(num + " es impar");
		}
	}

}
