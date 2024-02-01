package ejemplolist;

import java.util.ArrayList;
import java.util.List;

public class Ppal {

	public static void main(String[] args) {
		
		List <String> listado = new ArrayList<String>();
		listado.add("Daniel");
		listado.add("Pepe");
		listado.add("Nuria");
		
		System.out.println(listado.contains("Nuria"));
		System.out.println(listado);
		
		System.out.println(listado.size());
		listado.remove(1);
		System.out.println(listado);
		System.out.println(listado.size());
		
		// Para esta tarde: Hacer esto con un objeto.

	}

}
