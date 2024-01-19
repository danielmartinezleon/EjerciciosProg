package ejemplo;

public class OperacionesFiguras {

	public double calcularElAreaDeUnaFigura (Figura f){
		return f.calcularArea();
	}
	
	public double sumarAreas (Figura [] listado){
		double resultado=0;
		for (int i=0; i<listado.length;i++){
		resultado=resultado+calcularElAreaDeUnaFigura(listado[i]);
		if(listado[i] instanceof Circulo) {
			((Circulo)listado[i]).mostrarRadianes();
		}
		}
		return resultado;
		}
	
}
