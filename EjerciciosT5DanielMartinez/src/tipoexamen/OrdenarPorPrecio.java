package tipoexamen;

import java.util.Comparator;

public class OrdenarPorPrecio implements Comparator<Trastero>{

	@Override
	public int compare(Trastero o1, Trastero o2) {
		double precio1 = o1.getPrecio();
		double precio2 = o2.getPrecio();
		
		if(precio1 < precio2) {
			return 1;
		}else if(precio1 > precio2) {
			return -1;
		}
		return 0;
	}
	
	

}
