package ejemplolistobjetos;

import java.util.ArrayList;
import java.util.List;

public class Ppal {

	public static void main(String[] args) {

		List <Persona> listado = new ArrayList<Persona>();
		Persona p1 = new Persona("Nuria", 24, 162, 70);
		Persona p2 = new Persona("Fran", 25, 170, 80);
		Persona p3 = new Persona("Daniel", 24, 170, 80);
		
		listado.add(p1);
		listado.add(p2);
		listado.add(p3);
		
		System.out.println(listado);
		
		System.out.println(listado.contains(p1));
		System.out.println(listado.size());
		listado.remove(2);
		System.out.println(listado);
		System.out.println(listado.get(1));
		System.out.println(listado.isEmpty());
		System.out.println(listado.equals(listado));

	}

}
