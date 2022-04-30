package relatorio.dados;

import java.time.LocalDate;
import java.util.Scanner;

public class DadosClientes {
	private LocalDate data;
	private String nome;
	private String sexo;
	private String endereco;
	private int tel;
	private int numProntuario;
	private String observacoes;
	
	
	
	public DadosClientes() {
		this.setData(LocalDate.now());
		Scanner ler = new Scanner(System.in);
		System.out.print("Insira o nome do cliente: ");
		this.nome = ler.nextLine();
		System.out.print("Insira o sexo do cliente: ");
		this.sexo = ler.nextLine();
		System.out.print("Insira o endereço do cliente: ");
		this.endereco = ler.nextLine();
		System.out.print("Insira o telefone do cliente: ");
		this.tel = ler.nextInt();
		System.out.print("Insira o número do prontuário do cliente: ");
		this.numProntuario = ler.nextInt();
		System.out.print("Escreva as observações sobre o cliente: \n");
		this.observacoes = ler.nextLine();
		this.observacoes = ler.nextLine();
		
	}
	

	@Override
	public String toString() {
		return "Cliente: " + nome + "         " + "Sexo: " + sexo + 
				"\nEndereco: " + endereco + "         " + "Tel: " + tel
				+ "\nNúmero de Prontuario: " + numProntuario;
	}

	public String observCliente() {
		return "Observações: " + observacoes;
	}
	
		
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	
}
