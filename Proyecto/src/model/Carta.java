package model;

public class Carta {

	private int numCarta;
	private String palo;
	private boolean disponible;
	
	public Carta(int numCarta, String palo, boolean disponible) {
		this.numCarta = numCarta;
		this.palo = palo;
		this.disponible = disponible;
	}

	public int getNumCarta() {
		return numCarta;
	}

	public void setNumCarta(int numCarta) {
		this.numCarta = numCarta;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	@Override
	public String toString() {
		return "Carta [numCarta=" + numCarta + ", palo=" + palo + ", disponible=" + disponible + "]";
	}
	
	
	
}
