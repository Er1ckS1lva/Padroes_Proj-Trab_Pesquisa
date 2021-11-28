package Classes;

public class Plantacao {
	
	
	private Planta planta;
	private Sementes semente;
	private Boolean acao;
	
	public Plantacao () {
		this.planta = new Planta();
		this.semente = new Sementes();
	}
	
	
	public void novaSemente() {
		this.semente.novaSemente();
	}
	
	public void plantar() {
		this.acao = false;
		if(this.planta.getEstado() == "sem plantas") {
			System.out.println("O campo est� pronto para uso");
			this.acao = true;
		}else {
			System.out.println("J� existem plantas no campo");
			this.acao = false;
		}
		
		if(this.semente.getEstado() == "com sementes" ) {
			System.out.println("As sementes est�o prontas para uso");
			this.acao = true;
		}else {
			System.out.println("N�o tem sementes para plantar");
			this.acao = false;
		}
		
		if(this.acao) {
			System.out.println("Foram plantadas as sementes no campo");
			this.planta.plantando();
			this.semente.plantando();
		}else {
			System.out.println("N�o foi realizado a plata��o");
		}
	}
	
	public void regar() {
		this.acao = false;
		if(this.planta.getEstado() == "sementes plantadas") {
			this.acao = true;
			System.out.println("As plantas foram regadas adequadamente");
			
		}else if(this.planta.getEstado() == "pronto colheita") { 
			System.out.println("As plantas foram regadas adequadamente");
			this.acao = true;
		}else {
			System.out.println("N�o h� o que regar");
			this.acao = false;
		}
		if(this.acao) {
			System.out.println("As plantas est�o prontas para colheita");
			this.planta.regando();
		}else {
			System.out.println("N�o foi regado");
		}
	}
	
	public void colher() {
		
		this.acao = false;
		if(this.planta.getEstado() == "pronto colheita") { 
			System.out.println("As plantas foram colhidas");
			this.acao = true;
		}else {
			System.out.println("N�o h� nada para colher ainda");
			this.acao = false;
		}
		
		if(this.acao) {
			System.out.println("Foi realizada a colheita");
			this.planta.colhendo();
		}else {
			System.out.println("Nada foi colhido");
		}
		
	}

}
