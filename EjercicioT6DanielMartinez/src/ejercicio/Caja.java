package ejercicio;

public class Caja {

	private double totalRecaudado;
	
	public Caja(double totalRecaudado) {
		this.totalRecaudado = totalRecaudado;
	}

	public double getTotalRecaudado() {
		return totalRecaudado;
	}



	public void setTotalRecaudado(double totalRecaudado) {
		this.totalRecaudado = totalRecaudado;
	}
	
	
	@Override
	public String toString() {
		return "Caja [totalRecaudado=" + totalRecaudado +"]";
	}

	public boolean comprobarCodigo (String codigo) {
		boolean code = true;
		
		if(codigo.length() != 5) {
			code = false;
		}else if(!codigo.substring(0,1).matches("[A-Z]*")) {
			code = false;
		}else 	if(!codigo.substring(1,3).matches("[0-9]*")){
			code = false;
		}
		
		return code;
	}
	
	public void logearCodigo(String c) throws WorkerCodeException{
		
		if(!comprobarCodigo(c)) {
			throw new WorkerCodeException("Codigo con formato incorrecto");
		}else {
			System.out.println("Conectado de forma satisfactoria");
		}
	}
	
	public void comprobarRecaudacion(double recaudacion) throws CashException{
		if (recaudacion != totalRecaudado) {
			throw new CashException("El valor introducido no coincide con el total recaudado");
		}else {
			System.out.println("Recaudación correcta");
		}
	}
	
	public void comprobarOperaciones(int op) throws TotalOperationsException{
		
		if (op < 0) {
			throw new TotalOperationsException("No puede hacer menos de 0 operaciones");
		}else {
			System.out.println("Operaciones correctas");
		}
	}
}
