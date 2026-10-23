

public class ReservaExperiencia {
	
	private String nomeCliente; 
	private double valorBasePorPessoa;
	private int quantidadeParticipantes;
	
	public ReservaExperiencia(String nomeCliente ,  double valorBasePorPessoa ,int quantidadeParticipantes ){
		
		this.nomeCliente = nomeCliente;
		this.valorBasePorPessoa = valorBasePorPessoa;
		this.quantidadeParticipantes = quantidadeParticipantes;
	}
	
	public double calcularValorTotal(){
		
			return this.quantidadeParticipantes * valorBasePorPessoa;
		
	}
	
	public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public int getQuantidadeParticipantes() {
        return quantidadeParticipantes;
    }
    public void setQuantidadeParticipantes(int quantidadeParticipantes) {
        this.quantidadeParticipantes = quantidadeParticipantes;
    }
    public Double getValorBasePorPessoa() {
        return valorBasePorPessoa;
    }
    public void setValorBasePorPessoa(double valorBasePorPessoa) {
        this.valorBasePorPessoa = valorBasePorPessoa;
    }
}

