package projetobancoemjava;
public abstract class ContaAbstrata {
    private boolean statusConta;
    private int numConta;
    private float saldo;
    
    public void abrirConta(){}
    public void fecharConta(){}

    @Override
    public String toString() {
        return "ContaAbstrata{" + '}';
    }
    
}
