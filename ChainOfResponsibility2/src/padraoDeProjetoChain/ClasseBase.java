package padraoDeProjetoChain;

public abstract class ClasseBase {
	
	private ClasseBase prox;
	
	public ClasseBase(ClasseBase prox) {
		this.prox = prox;
	}
	
	public void chamarProx() {
		if (this.prox != null) {
			this.prox.chamarProx();
		}else {
			System.out.println("Não foi possivel tratar o evento!");
		}
	}
}
