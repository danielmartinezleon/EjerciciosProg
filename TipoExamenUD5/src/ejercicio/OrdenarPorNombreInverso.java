package ejercicio;

import java.util.Comparator;

public class OrdenarPorNombreInverso implements Comparator<Palabra>{

	@Override
	public int compare(Palabra o1, Palabra o2) {
		
		String p1 = o1.getNombreIngles();
		String p2 = o2.getNombreIngles();
		
		return -(p1.toLowerCase().compareTo(p2.toLowerCase()));
	}

}
