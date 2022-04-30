package methodFactory;

public class Main {

	public static void main(String[] args) {
		
		FactoryPessoa factory = new FactoryPessoa();
		String nome = "Jasmin";
		String sexo = "F";
		factory.getPessoa(nome, sexo);
	}

}
