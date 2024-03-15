package ejemplo1;

public class Ppal {

	public static void main(String[] args) {
		
		int num = 10, den = 0;
		double res = 0;
		
		try {
			res = num/den;
			
			System.out.println("El resultado es: "+res);
			
		} catch (RuntimeException e) {
			
			System.out.println("Estas dividiendo entre 0");
		}

	}

}
