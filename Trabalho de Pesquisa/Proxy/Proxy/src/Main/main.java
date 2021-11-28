package Main;

import Classes.Base_de_Dados_Interface;
import Classes.Proxy;

public class main {

	public static void main(String[] args) {
		
		
		Base_de_Dados_Interface user = new Proxy();
		
		user.lendoBase();
		user.lendoBase();
		user.lendoBase();

	}

}
