package ejemplo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Ppal {

	public static void main(String[] args) {

		int z = 0;
		String mensaje = "Hola Mundo";
		List<String> lista = new ArrayList<String>();
		
		lista.add("Daniel");
		lista.add("Nuria");
		lista.add("Nydia");
		lista.add("Andy");
		
		IBienvenida bienvenida = (x) -> System.out.println(x);
		
		bienvenida.mostrarBienvenida(mensaje);
		
		Supplier<Double> s1 = () -> Math.random();
		Consumer<String> c1 = (m) -> System.out.println(m);
		
		System.out.println(s1.get());
		
		for (String string : lista) {
			c1.accept(string);
		}

	}

}
