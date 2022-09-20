package herancaEComposicao;

import java.util.Scanner;

public abstract class Pessoa {
	private String nome;
	private int idade;
	private String cpf;
	private String telefone;
	
	public void CadastroPessoa() {
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe o nome: ");
		this.nome = ler.nextLine();
		System.out.print("Informe a idade: ");
		this.idade = ler.nextInt();
		System.out.print("Informe o cpf: ");
		this.cpf = ler.next();
		System.out.print("Informe o telefone: ");
		this.telefone = ler.next();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	@Override
	public String toString() {
		return "Nome = " + nome + 
			"\nidade = " + idade + 
			"\ncpf = " + cpf + 
			"\ntelefone = " + telefone;
	}
	
	
	
}
