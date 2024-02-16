package ejemploordenar;

import java.util.Comparator;

public class ComparaPorNombre implements Comparator<Corredor>{

	@Override
	public int compare(Corredor o1, Corredor o2) {
		
		return (o1.getNombre().toLowerCase().compareTo(o2.getNombre().toLowerCase()));
	}

}
