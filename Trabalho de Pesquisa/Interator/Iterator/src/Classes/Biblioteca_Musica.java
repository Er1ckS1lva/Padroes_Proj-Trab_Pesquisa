package Classes;

import java.util.ArrayList;

public abstract class Biblioteca_Musica {
	
	protected ArrayList<Musicas> musicas;

	public Biblioteca_Musica() {
		musicas = new ArrayList<Musicas>();
	}

	public int count() {
		return musicas.size();
	}

	public Iterator_Musicas novaBib() {
		return new Iterator_Musicas(musicas);
	}

}
