package herancaEComposicao;

public class Aluno extends Pessoa implements Metodos{
	
	private String curso;
	private int id;
	private boolean ativo;
	private Endereco endereco;
	
	public Aluno(int id, String curso) {
		this.id = id;
		this.curso = curso;
		this.ativo = true;	
	}
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void preencheEndereço() {
		this.endereco = new Endereco();
		endereco.CadastroEndereco();
	}
	public void mostraEndereço() {
		endereco.status();
	}

	@Override
	public void status() {
		if(this.ativo == true) {
			System.out.println("\n======== Aluno criado com sucesso! ========\n");
			System.out.println(super.toString() + 
					"\nMatricula: " + id + 
					"\nCurso Matriculado: " + curso );
			System.out.println();
		}else {
			System.out.println("Aluno não está criado!");
		}
		
	}
	
}
