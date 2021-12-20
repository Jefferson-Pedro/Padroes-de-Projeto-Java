package projetobancoemjava;

import java.util.Scanner;

public class Cadastro {
    private String nome;
    private int telefone;
    private String endereco;
    private String escolhaConta;

    public void novoCliente(){
       Scanner ler = new Scanner(System.in);

        System.out.print("Insira o nome do cliente: ");
        this.setNome(ler.nextLine()); 
        System.out.print("Insira o telefone: ");
        this.setTelefone(ler.nextInt());
        System.out.print("Insira o endereço: ");
        this.setEndereco(ler.nextLine());
        System.out.println("Qual tipo de conta?");
        System.out.print("CC - Conta corrente\n" + "CP - Conta Poupança\n "
                            + "Sua opção: ");
        this.setEscolhaConta(ler.nextLine());
    }
    
    
    //      GET E SET
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEscolhaConta() {
        return escolhaConta;
    }

    public void setEscolhaConta(String escolhaConta) {
        this.escolhaConta = escolhaConta;
    }

    @Override
    public String toString() {
        return "Cadastro realizado com sucesso: \n"
       + "Nome= \n" + nome + "Telefone= \n" + telefone 
       + "Endereco= \n" + endereco + "Tipo de Conta= " 
       + escolhaConta;
    }
    
    
}
