package ejercicio05;

import java.util.Iterator;

public class Copiado {

	private String frase;

	public Copiado(String frase) {
		this.frase = frase;
	}

	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}
	
	public void imprimirFraseXVeces(int cant) {
		for (int i = 0; i < cant; i++) {
			System.out.println(frase);
		}
	}
	
}
