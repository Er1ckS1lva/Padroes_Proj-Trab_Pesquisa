package Classes;

public class Proxy implements Base_de_Dados_Interface {
	
	private static Base_de_Dados_Implementacao objt;

	@Override
	public void lendoBase() {
		
		if(objt == null) {
			objt = new Base_de_Dados_Implementacao();
		}
		objt.lendoBase();
	}

}
