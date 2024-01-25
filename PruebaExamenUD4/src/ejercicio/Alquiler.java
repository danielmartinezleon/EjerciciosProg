package ejercicio;

import java.util.Arrays;

public class Alquiler {

	Vehiculo[] listado;

	public Alquiler(Vehiculo[] listado) {
		this.listado = listado;
	}

	public Vehiculo[] getListado() {
		return listado;
	}

	public void setListado(Vehiculo[] listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "Alquiler [listado=" + Arrays.toString(listado) + "]";
	}

	public Vehiculo findByMatricula(String mat) {
		int i = 0;
		boolean encontrado = false;

		while (i < listado.length && !encontrado) {
			if (listado[i].getMatricula().equalsIgnoreCase(mat)) {
				encontrado = true;
			} else {
				i++;
			}
		}

		if (encontrado) {
			return listado[i];
		} else {
			return null;
		}
	}

	public double calcularAlquilerUnVehiculo(Vehiculo v) {
		return v.calcularPrecio();
	}

	public void mostrarListado() {

		for (int i = 0; i < listado.length; i++) {
			if (listado[i] instanceof PatineteVolador) {
				System.out.println(listado[i]);
				System.out.println("¡Cuidado que voy volando!");
			} else {
				System.out.println(listado[i]);
			}
		}
	}

	public double calcularTotalRecaudado() {
		double totalRecaudado = 0;

		for (int i = 0; i < listado.length; i++) {
			if (listado[i].isAlquilado()) {
				totalRecaudado += listado[i].calcularPrecio();
			}
		}

		return totalRecaudado;
	}

	public double calcularTotalBatmovil() {
		double totalBatmovil=0;
		
		for (int i = 0; i < listado.length; i++) {
			if (listado[i].isAlquilado() && listado[i] instanceof Batmovil) {
				totalBatmovil += listado[i].calcularPrecio();
			}
		}
		
		return totalBatmovil;
	}

}
