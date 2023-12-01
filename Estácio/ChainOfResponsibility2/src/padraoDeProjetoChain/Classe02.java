package padraoDeProjetoChain;

import java.util.Calendar;

public class Classe02 extends ClasseBase {
	
	Calendar c = Calendar.getInstance();
	int hora = c.get(Calendar.HOUR_OF_DAY);
	
	public Classe02(ClasseBase prox) {
		super(prox);
		System.out.println("Percorrendo a segunda classe..");
	}
	
	@Override
	public void chamarProx() {

		if (this.hora > 12 && this.hora < 18) {
			System.out.println("Classe devidamente tratada! Tenha uma Boa Tarde");
		} else {
			super.chamarProx(); //Delegar
		}
	}
}
