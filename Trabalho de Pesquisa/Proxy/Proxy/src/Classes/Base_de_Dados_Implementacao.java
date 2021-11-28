package Classes;

public class Base_de_Dados_Implementacao implements Base_de_Dados_Interface{
	
	
	public Base_de_Dados_Implementacao() {
		iniciandoConexao();
	}
	
	@Override
	public void lendoBase() {
		System.out.println("Informa��es obtidas com sucesso!");
	}
	
	private void iniciandoConexao() {
		System.out.println("Iniciando conexao com a base ...");
	}

}
