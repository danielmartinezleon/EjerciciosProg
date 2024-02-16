package ejemploordenar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ppal {

	public static void main(String[] args) {
		
		List<Corredor> corredores = new ArrayList<Corredor>();
		
		corredores.add(new Corredor(4, 1.43, "Jesse Owens"));
		corredores.add(new Corredor(8, 1.11, "Ángel Naranjo"));
		corredores.add(new Corredor(3, 2.23, "Abel Antón"));
		corredores.add(new Corredor(1, 1.12, "Luis Miguel López"));
		
		for (Corredor corredor : corredores) {
			System.out.println(corredor);
		}
		
		Collections.sort(corredores);
		
		System.out.println();
		
		for (Corredor con : corredores) {
			System.out.println(con);
		}
		
		Collections.sort(corredores, new ComparaPorMarca());
		System.out.println();
		for (Corredor corredor : corredores) {
			System.out.println(corredor);
		}
		
		System.out.println();
		
		Collections.sort(corredores, new ComparaPorNombre());
		
		for (Corredor corredor : corredores) {
			System.out.println(corredor);
		}

	}

}
