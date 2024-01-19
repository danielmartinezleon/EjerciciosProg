package crud;

import model.Carta;

public class CRUDCarta {

	private Carta [] lista;
	private int numCarta;
	
	public CRUDCarta(Carta[] lista) {
		this.lista = lista;
	}

	public Carta[] getLista() {
		return lista;
	}

	public void setLista(Carta[] lista) {
		this.lista = lista;
	}

	public int getNumCarta() {
		return numCarta;
	}

	public void setNumCarta(int numCarta) {
		this.numCarta = numCarta;
	}
	
	
	
}
