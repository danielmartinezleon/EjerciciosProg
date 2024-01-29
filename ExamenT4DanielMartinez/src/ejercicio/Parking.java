package ejercicio;

import java.util.Arrays;

public class Parking {
	
	private String direccion;
	private Vehiculo[] listado;
	
	public Parking(String direccion, Vehiculo[] listado) {
		this.direccion = direccion;
		this.listado = listado;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Vehiculo[] getListado() {
		return listado;
	}

	public void setListado(Vehiculo[] listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "Parking [direccion=" + direccion + ", listado=" + Arrays.toString(listado) + "]";
	}
	
	public Vehiculo findByMatricula(String mat) {
		int i = 0;
		boolean encontrado = false;
		
		while(i < listado.length && !encontrado) {
			Vehiculo deLista = listado[i];
			if (deLista.getMatricula().equalsIgnoreCase(mat)) {
				encontrado = true;
			}else {
				i++;
			}
		}
		
		if (encontrado) {
			return listado[i];
		}else {
			return null;
		}
	}
	
	public double calcularPrecioUnVehiculo (Vehiculo v, double precioMin) {
		return v.calcularPrecio(precioMin);
	}
	
	public void mostrarListado() {
		double zonaEspecial = 8;
		for (int i = 0; i < listado.length; i++) {
			if (listado[i] instanceof Furgoneta) {
				if(((Furgoneta)listado[i]).getLongitudMetros() > zonaEspecial) {
					System.out.println(listado[i]);
					System.out.println("¡ATENCIÓN, ESTE VEHÍCULO DEBE APARCARSE EN ZONA ESPECIAL!");
				}else {
					System.out.println(listado[i]);
				}
			}else {
				System.out.println(listado[i]);
			}
		}
	}
	
	public double calcularSoloMotos(double precioMin) {
		double totalMotos = 0;
		
		for (int i = 0; i < listado.length; i++) {
			if(listado[i] instanceof Moto) {
				totalMotos += ((Moto)listado[i]).calcularPrecio(precioMin);
			}
		}
		
		return totalMotos;
	}
	
	public double calcularPrecioNavidad(Vehiculo v, boolean navidad, double precioMin) {
		double precioNavidad = 0;
		double extraNavidad = 10;
		
		if(navidad) {
			precioNavidad = calcularPrecioUnVehiculo(v, precioMin) + extraNavidad;
		}
		
		return precioNavidad;
	}

}
