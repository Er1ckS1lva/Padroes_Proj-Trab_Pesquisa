package Classes;

public class Planta {
	
	private String estado;
	
	public Planta() {
		this.estado = "sem plantas";
	}
	
	public void plantando() {
		this.estado = "sementes plantadas";
	}
	
	public void regando() {
		this.estado = "pronto colheita";
	}
	
	public void colhendo() {
		this.estado = "sem plantas";
	}
	
	public String getEstado() {
		return this.estado;
	}

}
