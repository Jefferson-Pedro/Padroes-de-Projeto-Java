package herancaEComposicao;

public class Professor extends Pessoa implements Metodos {
	
	private String nomeCurso;
	private double salario;
	private boolean ativo;
	private Endereco end;
	
	
	public Professor(String Nc) {
		this.ativo = true;
		this.nomeCurso = Nc;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void calcularSalario(double salario) {
		this.salario = salario - (salario * 0.11);
		
	}
	public void preencheEndereço() {
		this.end = new Endereco();
		end.CadastroEndereco();
	}
	public void mostraEndereço() {
		end.status();
	}

	@Override
	public void status() {
		if(this.ativo == true) {
			System.out.println("======== Professor criado com sucesso! ========");
			System.out.println(super.toString() + 
								"\nSalario: " + salario + 
								"\nCurso Ministrado: " + nomeCurso); 
		}else {
			System.out.println("Professor não está criado!");
		}
	}
	
	}
