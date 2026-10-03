public class Cliente {

    private String nome;
    private String cpf;
    private Double renda;
    private Double limiteDeCredito;

	public Cliente(String nome , String cpf , Double renda){
		
		this.nome = nome;
		this.cpf = cpf;
		this.renda = renda;
		calculaLimite();
		
	}
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getRenda() {
        return renda;
    }

    public void setRenda(Double renda) {
        this.renda = renda;
        calculaLimite();
    }

    public Double getLimiteDeCredito() {
        return this.limiteDeCredito;
    }
    
     public void calculaLimite() {
        this.limiteDeCredito = this.renda * 2.5;
    }
}
