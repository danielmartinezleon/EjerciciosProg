package ejemplo1;

public class Ppal {

	public static void main(String[] args) {

		Animal a= new Animal("programador", 2);
		Persona p= new Persona("Luismi", 34);
		a.cazar(a);
		p.localizar(a);
		
		a.huir();

	}

}
