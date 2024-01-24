package ejercicio02;

public class Trabajador implements IImpuesto{
	
	private String nombre;
	private double salarioBruto;
	private double porcenRetencion;
	
	
	public Trabajador(String nombre, double salarioBruto, double porcenRetencion) {
		this.nombre = nombre;
		this.salarioBruto = salarioBruto;
		this.porcenRetencion = porcenRetencion;
	}


	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public double getSalarioBruto() {
		return salarioBruto;
	}



	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	
	public double getPorcenRetencion() {
		return porcenRetencion;
	}
	
	public void setPorcenRetencion(double porcenRetencion) {
		this.porcenRetencion = porcenRetencion;
	}
	
	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", salarioBruto=" + salarioBruto + ", porcenRetencion=" + porcenRetencion + "]";
	}



	public double calcularIva(double precio, int iva) {
		
		return 0;
	}
	
	public double calcularIrpf(double sueldo) {
		int cien = 100;
		double IRPF = 0;
		IRPF = (sueldo*porcenRetencion)/cien;
		return IRPF;
	}
	
	

}
