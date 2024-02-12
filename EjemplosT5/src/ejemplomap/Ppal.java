package ejemplomap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ppal {

	public static void main(String[] args) {
		
		Map <String, String> lista = new HashMap <>();
		
		Set <String> lista2 = lista.keySet();
		
		Collection lista3 = lista.values();
		
		lista.put("One", "1st");
		lista.put("Two", "2nd");
		lista.put("Three", "3rd");
		lista.put("Three", "Treh");
		lista.put("3", "3rd");

		System.out.println(lista);
		System.out.println(lista2);
		System.out.println(lista3);
	}

}
