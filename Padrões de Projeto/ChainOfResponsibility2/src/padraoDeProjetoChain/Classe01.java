package padraoDeProjetoChain;

import java.util.Calendar;

public class Classe01 extends ClasseBase {
	
	Calendar c = Calendar.getInstance();
	int hora = c.get(Calendar.HOUR_OF_DAY);
	
	public Classe01(ClasseBase prox) {
		super(prox);
		System.out.println("Percorrendo a primeira classe..");
	}
	
	@Override
	public void chamarProx() {

		if (this.hora > 6 && this.hora < 12) {
			System.out.println("Classe devidamente tratada! Tenha uma Bom Dia");
		} else {
			super.chamarProx(); //Delegar
		}
	}
}
