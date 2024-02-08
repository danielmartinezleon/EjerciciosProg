package ejemplolistobjetos;

import java.util.ArrayList;
import java.util.List;

public class Ppal {

	public static void main(String[] args) {

		List <Persona> listado = new ArrayList<Persona>();
		CrudPersona c = new CrudPersona(listado);
		Persona p1 = new Persona("Nuria", 24, 162, 70, "123456789A");
		Persona p2 = new Persona("Fran", 25, 170, 80, "987654321B");
		Persona p3 = new Persona("Daniel", 24, 170, 80, "53769410X");
		
		listado.add(p1);
		listado.add(p2);
		listado.add(p3);
		listado.add(p1);
		listado.add(p2);
		listado.add(p3);
		
		System.out.println(listado);
		
		System.out.println(listado.contains(p1));
		System.out.println(listado.size());
		System.out.println(listado);
		System.out.println(listado.get(1));
		System.out.println(listado.isEmpty());
		System.out.println(listado.equals(listado));

		c.mostrarLista();
	}

}
