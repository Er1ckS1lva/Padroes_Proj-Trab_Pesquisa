package Classes;

import java.util.ArrayList;

public class Iterator_Musicas {
	
	ArrayList<Musicas> musicas;
	int quantidade;

	protected Iterator_Musicas(ArrayList<Musicas> musicas) {
		this.musicas = musicas;
		quantidade = 0;
	}

	public void proximaMusica() {
		quantidade++;
		if (isDone()) {
			quantidade = 0;
		}
	}

	public void voltarMusica() {
		quantidade--;
		if (quantidade < 0) {
			quantidade = musicas.size()-1;
		}
	}

	public boolean isDone() {
		return quantidade == musicas.size();
	}

	private Musicas currentItem() {
		return musicas.get(quantidade);
	}

	public String getMusica() {
		return currentItem().nome;
	}
}
