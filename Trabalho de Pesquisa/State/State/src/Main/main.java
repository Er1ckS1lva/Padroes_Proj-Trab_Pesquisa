package Main;

import Classes.Plantacao;

public class main {

	public static void main(String[] args) {
		
		
		Plantacao fazendinha = new Plantacao();
		
		fazendinha.plantar();
		fazendinha.regar();
		fazendinha.colher();
		System.out.println("\n\n");
		fazendinha.novaSemente();
		fazendinha.plantar();
		fazendinha.regar();
		fazendinha.colher();
		System.out.println("\n\n");
		fazendinha.plantar();
	}

}
