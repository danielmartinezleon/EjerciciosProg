package ejemplomapobj;

import java.util.HashMap;
import java.util.Map;

public class Ppal {

	public static void main(String[] args) {
		
		Alumno a = new Alumno("Angel", 2, 3.2);
		
		Map <Integer, Alumno> listado = new HashMap<>();
		
		listado.put(6, new Alumno("Daniel", 1, 6.8));
		listado.put(7, a);
		System.out.println(listado);
		a.setNombre("Luismi");
		System.out.println(listado);
		

	}

}
