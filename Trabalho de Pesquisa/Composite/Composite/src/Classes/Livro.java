package Classes;

public abstract class Livro {
	String nomeLivro;

	public String getnomeLivro() {
		return this.nomeLivro;
	}

	public void printnomeLivro() {
		System.out.println(this.nomeLivro);
	}
}