package padraoDeProjetoChain;

import java.util.Calendar;

public class Classe03 extends ClasseBase {
	
	Calendar c = Calendar.getInstance();
	int hora = c.get(Calendar.HOUR_OF_DAY);
	
	public Classe03(ClasseBase prox) {
		super(prox);
		System.out.println("Percorrendo a terceira e ultima classe..!");	
	}
	
	@Override
	public void chamarProx() {

		if (this.hora > 18 && this.hora <= 23) {
			System.out.println("Classe devidamente tratada! Tenha uma Boa Noite");
		} else {
			System.out.println("A Classe não pode ser tratada. Programa Encerrado!");
			//super.chamarProx(); //Delegar
		}
	}
}
