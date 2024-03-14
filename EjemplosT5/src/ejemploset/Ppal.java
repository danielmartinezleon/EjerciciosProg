package ejemploset;

import java.util.HashSet;
import java.util.Set;

public class Ppal {

	public static void main(String[] args) {
		
		Set <Persona> lista = new HashSet<>();
		CrudPersona c = new CrudPersona(lista);
		lista.add(new Persona("Daniel", "53769410X", 24));
		lista.add(new Persona("Fran", "123456789A", 25));
		lista.add(new Persona("Nydia", "987654321B", 23));
		
		c.imprimirLista();
		
		//c.imprimirPersona(c.findByDni("987654321B"));
		

	}

}
