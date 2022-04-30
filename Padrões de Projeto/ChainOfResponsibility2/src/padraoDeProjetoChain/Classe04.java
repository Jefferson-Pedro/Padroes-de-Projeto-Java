package padraoDeProjetoChain;

public class Classe04 extends ClasseBase {

	public Classe04(ClasseBase prox) {
		super(prox);
	}
	
	@Override
	public void chamarProx() {
		System.out.println("Final!");
		//super.chamarProx();
	}
}
