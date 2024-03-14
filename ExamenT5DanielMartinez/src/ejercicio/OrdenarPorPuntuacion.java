package ejercicio;

import java.util.Comparator;

public class OrdenarPorPuntuacion implements Comparator<Carta>{

	@Override
	public int compare(Carta o1, Carta o2) {
		
		if (o1.devolverPuntuacion(o1) > o2.devolverPuntuacion(o2)) {
			return -1;
		}else if (o1.devolverPuntuacion(o1) < o2.devolverPuntuacion(o2)) {
			return 1;
		}
		
		return 0;
	}

}
