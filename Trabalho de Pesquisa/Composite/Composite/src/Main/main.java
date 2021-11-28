package Main;

import Classes.Estante;
import Classes.Livro_Maker;

public class main {

	public static void main(String[] args) {

		
		Estante estanteHarry = new Estante();
		
		Livro_Maker harry = new Livro_Maker("Harry Potter e a Pedra Filosofal");
		Livro_Maker harry2 = new Livro_Maker("Harry Potter e a Câmara Secreta");
		Livro_Maker harry3 = new Livro_Maker("Harry Potter e o Prisioneiro de Azkaban");
		Livro_Maker harry4 = new Livro_Maker("Harry Potter e o Cálice de Fogo");
		Livro_Maker harry5 = new Livro_Maker("Harry Potter e a Ordem da Fenix");
		Livro_Maker harry6 = new Livro_Maker("Harry Potter e o Enigma do Principe");
		Livro_Maker harry7 = new Livro_Maker("Harry Potter e as Relíquias da Morte Parte 1");
		Livro_Maker harry8 = new Livro_Maker("Harry Potter e as Relíquias da Morte Parte 2");
		
		estanteHarry.adicionar(harry);
		estanteHarry.adicionar(harry2);
		estanteHarry.adicionar(harry3);
		estanteHarry.adicionar(harry4);
		estanteHarry.adicionar(harry5);
		estanteHarry.adicionar(harry6);
		estanteHarry.adicionar(harry7);
		estanteHarry.adicionar(harry8);
		
		estanteHarry.printnomeLivro();
		
		try {
			estanteHarry.remover("Harry Potter e o Prisioneiro de Azkaban");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		estanteHarry.printnomeLivro();
		
	}
}



