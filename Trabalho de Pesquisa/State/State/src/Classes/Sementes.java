package Classes;

public class Sementes {
	
	private String estado;
	
	public Sementes() {
		this.estado = "sem sementes";
	}
	
	public void novaSemente() {
		this.estado = "com sementes";
	}
	
	public void plantando() {
		this.estado = "sem sementes";
	}
	
	public String getEstado() {
		return this.estado;
	}
}
