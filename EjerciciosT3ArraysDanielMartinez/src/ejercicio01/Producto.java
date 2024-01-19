package ejercicio01;

public class Producto {

	private double pBase;
	private String nombre;
	private boolean fragil;
	private double pvp;
	private int id;
	
	public Producto(double pBase, String nombre, boolean fragil, double pvp, int id) {
		this.pBase = pBase;
		this.nombre = nombre;
		this.fragil = fragil;
		this.pvp = pvp;
		this.id = id;
	}

	public double getpBase() {
		return pBase;
	}

	public void setpBase(double pBase) {
		this.pBase = pBase;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isFragil() {
		return fragil;
	}

	public void setFragil(boolean fragil) {
		this.fragil = fragil;
	}

	public double getPvp() {
		return pvp;
	}

	public void setPvp(double pvp) {
		this.pvp = pvp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Producto [pBase=" + pBase + ", nombre=" + nombre + ", fragil=" + fragil + ", pvp=" + pvp + ", id=" + id
				+ "]";
	}

	
	
	
	
}
