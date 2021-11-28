package Classes;

import java.util.ArrayList;

public class Estante extends Livro {
	protected ArrayList<Livro> prateleira;

	public Estante() {	
		prateleira = new ArrayList<Livro>();
	}

	@Override
	public void printnomeLivro() {
		for (Livro livro_aux : prateleira) {
			livro_aux.printnomeLivro();
		}
	}

	public void adicionar(Livro novoLivro) {
		this.prateleira.add(novoLivro);
	}

	public void remover(String nomeLivro) throws Exception {
		for (Livro livro_aux : prateleira) {
			if (livro_aux.getnomeLivro() == nomeLivro) {
				this.prateleira.remove(livro_aux);
				return;
			}
		}
		throw new Exception("Livro não encontrado");
	}

	public Livro getArquivo(String nomeLivro) throws Exception {
		for (Livro livro_aux : prateleira) {
			if (livro_aux.getnomeLivro() == nomeLivro) {
				return livro_aux;
			}
		}
		throw new Exception("Livro não encontrado");
	}
}