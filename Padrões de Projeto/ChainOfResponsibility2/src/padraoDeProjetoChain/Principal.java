package padraoDeProjetoChain;

import java.util.Calendar;

public class Principal {

	public static void main(String[] args) {
			
		Classe04 finish = new Classe04(null);
		Classe03 noite = new Classe03(finish);
		Classe02 tarde = new Classe02(noite);
		Classe01 dia = new Classe01(tarde);
	
		dia.chamarProx();
	}
}

