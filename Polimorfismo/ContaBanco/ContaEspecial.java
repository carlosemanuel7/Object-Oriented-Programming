public class ContaEspecial extends ContaBancaria{

    private Double limite;

    public ContaEspecial(Pessoa cliente, int numeroDaConta, Double saldo, Double limite) {
        super(cliente, numeroDaConta, saldo);
        this.limite = limite;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }
    
    @Override
    public boolean sacar(Double valor){
        if (valor <= (this.getSaldo() + this.limite)){
            this.setSaldo(this.getSaldo() - valor);
            return true;
        } else {
            return false;
        }
    }
}
