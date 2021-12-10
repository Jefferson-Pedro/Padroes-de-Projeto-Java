package aula09exercicios;

/**
 *
 * @author jpedro
 */
public class Pessoa {
    private String nome;
    private char sexo;
    private int idade;
    
    public void fazerAniversario(){
        this.idade++;
    }

    //                  CONSTRUTOR
    public Pessoa(String nome, char sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }
    
    
   //               METODOS ESPECIAIS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}