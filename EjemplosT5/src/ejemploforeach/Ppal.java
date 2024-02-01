package ejemploforeach;

public class Ppal {

	public static void main(String[] args) {
		
		int[] numeros = {1, 2, 7, 11, 13, 16, 20};
		int suma = 0;
		
		for (int i : numeros) {
			suma+=i;
			System.out.println(i);
		}
		
		System.out.println("Total: "+suma);

	}

}
