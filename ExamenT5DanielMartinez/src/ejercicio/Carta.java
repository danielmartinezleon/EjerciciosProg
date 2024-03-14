package ejercicio;

public class Carta implements Comparable<Carta>{

	private String nombre;
	private String palo;
	private int numeroCarta;
	
	public Carta(String nombre, String palo, int numeroCarta) {
		this.nombre = nombre;
		this.palo = palo;
		this.numeroCarta = numeroCarta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public int getNumeroCarta() {
		return numeroCarta;
	}

	public void setNumeroCarta(int numeroCarta) {
		this.numeroCarta = numeroCarta;
	}

	@Override
	public String toString() {
		return "Carta [nombre=" + nombre + ", palo=" + palo + ", numeroCarta=" + numeroCarta + "]";
	}
	
	public int devolverPuntuacion(Carta c) {
		int puntos = 0;
		if (c.getNumeroCarta() == 1) {
			puntos = 11;
		}else if (c.getNumeroCarta() == 3) {
			puntos = 10;
		}else if (c.getNumeroCarta() > 1 && c.getNumeroCarta() <= 9) {
			puntos = 0;
		}else if (c.getNumeroCarta() == 10) {
			puntos = 2;
		}else if (c.getNumeroCarta() == 11) {
			puntos = 3;
		}else if (c.getNumeroCarta() == 12) {
			puntos = 4;
		}
		return puntos;
	}

	@Override
	public int compareTo(Carta o) {
		
		if (this.getPalo().equals(o.getPalo())) {
			return 1;
		}else if (this.getPalo() != o.getPalo()){
			return -1;
		}else {
			return 0;
		}
	}
	
}
