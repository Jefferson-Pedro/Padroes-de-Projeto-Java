package herancaEComposicao;

import java.util.Scanner;

public class Endereco implements Metodos {
	private String rua;
	private String bairro;
	private String cidade;
	private String cep;
	
	
	public void CadastroEndereco() {
		
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe a rua: ");
		this.rua = ler.nextLine();
		System.out.print("Informe o bairro: ");
		this.bairro = ler.nextLine();
		System.out.print("Informe a cidade: ");
		this.cidade = ler.nextLine(); 
		System.out.print("Informe o cep: ");
		this.cep = ler.nextLine();
		
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	@Override
	public void status() {
		System.out.println("========== Endereço ========");
		System.out.println("rua: " + rua +
							"\nbairro: " + bairro +
							"\ncidade: " + cidade + 
							"\ncep: " + cep );
		
	}
	
	
	
}
