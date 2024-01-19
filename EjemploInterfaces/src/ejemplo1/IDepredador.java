package ejemplo1;

public interface IDepredador {
	
	/* NOTAS
	 * ---------------
	 * 1. No hace falta permisos, por defecto son public
	 * 2. Todos los atributos son public y final (constantes), 
	 * se les da valor inicial
	 * 3. Una interfaz SI tiene herencia, pero solo entre interfaces*/
	
	public void localizar (Animal presa);
	public void cazar (Animal presa);
	

}
