package ejemploordenar;

import java.util.Comparator;

public class ComparaPorMarca implements Comparator<Corredor>{

	@Override
	public int compare(Corredor o1, Corredor o2) {
		
		if (o1.getMarca() < o2.getMarca()) {
			return -1;
		}else {
			if(o1.getMarca() > o2.getMarca()) {
				return 1;
			}
		}
		return 0;
	}

}
