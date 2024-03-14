package ejercicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Mazo {
	
	private List<Carta> baraja;

	public Mazo(List<Carta> baraja) {
		this.baraja = baraja;
	}

	public List<Carta> getBaraja() {
		return baraja;
	}

	public void setBaraja(List<Carta> baraja) {
		this.baraja = baraja;
	}

	@Override
	public String toString() {
		return "Mazo [baraja=" + baraja + "]";
	}
	
	public Carta findByNumYPalo(int num, String palo) {
		
		for (Carta carta : baraja) {
			if (carta.getPalo().equalsIgnoreCase(palo) && carta.getNumeroCarta() == num) {
				return carta;
			}
		}
		return null;
	}
	
	public List<Carta> buscarValorCero() {
		List<Carta> valorCero = new ArrayList<Carta>();
		Carta c = null;
		Iterator<Carta> it = baraja.iterator();
		
		while(it.hasNext()) {
			c = it.next();
			
			if (c.devolverPuntuacion(c) == 0) {
				valorCero.add(c);
			}
		}
		
		return valorCero;
	}
	
	public int calcularValorTotal() {
		int total = 0;
		
		for (Carta carta : baraja) {
			total += carta.devolverPuntuacion(carta);
		}
		
		return total;
	}
	
	public void modificarNombre(int num, String palo, String nuevoNombre) {
		findByNumYPalo(num, palo).setNombre(nuevoNombre);
	}
	
	public void mostrarLista() {
		Iterator<Carta> it = baraja.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public void mostrarValorCero() {
		
		for (Carta carta : buscarValorCero()) {
			System.out.println(carta);
		}
		
	}

}
