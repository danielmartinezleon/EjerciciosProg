package ejercicio09;

import java.util.Arrays;
import java.util.Random;

public class Loteria {

	private int[] cuponUsuario;
	private int[] cuponGanador;
	private boolean ganador;
	

	public Loteria() {
		
	}
	
	public Loteria(int[] cuponUsuario, int[] cuponGanador) {
		this.cuponUsuario = cuponUsuario;
		this.cuponGanador = cuponGanador;
	}
	
	public int[] getCuponUsuario() {
		return cuponUsuario;
	}

	public void setCuponUsuario(int[] cuponUsuario) {
		this.cuponUsuario = cuponUsuario;
	}

	public int[] getCuponGanador() {
		return cuponGanador;
	}

	public void setCuponGanador(int[] cuponGanador) {
		this.cuponGanador = cuponGanador;
	}

	public boolean isGanador() {
		return ganador;
	}

	public void setGanador(boolean ganador) {
		this.ganador = ganador;
	}

	@Override
	public String toString() {
		return "Loteria [cuponUsuario=" + Arrays.toString(cuponUsuario) + ", cuponGanador="
				+ Arrays.toString(cuponGanador) + ", ganador=" + ganador + "]";
	}

	public int[] crearCupon(int[] numeros) {
	    for (int i = 0; i < cuponUsuario.length; i++) {
	        cuponUsuario[i] = numeros[i];
	    }
	    return cuponUsuario;
	}


	public int[] generarCuponUsuario(int desde, int hasta) {
		Random rnd = new Random(System.nanoTime());
		for (int i = 0; i < cuponUsuario.length; i++) {
			cuponUsuario[i]=rnd.nextInt(hasta - desde + 1) + desde;
		}
		return cuponUsuario;
	}
	
	public int[] generarCuponGanador(int desde, int hasta) {
		Random rnd = new Random(System.nanoTime());
		for (int i = 0; i < cuponGanador.length; i++) {
			cuponGanador[i]=rnd.nextInt(hasta - desde + 1) + desde;
		}
		return cuponGanador;
	}
	
	public boolean comprobarGanador() {
		ganador = Arrays.equals(cuponUsuario, cuponGanador);
	    return ganador;
	}
	
	public void imprimirGanador() {
		System.out.println("Tu número es: ");
		for (int i = 0; i < cuponUsuario.length; i++) {
			System.out.print(cuponUsuario[i]);
		}
		System.out.println("\nEl número ganador es: ");
		for (int i = 0; i < cuponGanador.length; i++) {
			System.out.print(cuponGanador[i]);
		}
		if (ganador) {
			System.out.println("\n¡¡¡¡¡HAS GANADOOOOO!!!!!\n");
		}else {
			System.out.println("\nMás suerte la próxima vez\n");
		}
	}
	
}
