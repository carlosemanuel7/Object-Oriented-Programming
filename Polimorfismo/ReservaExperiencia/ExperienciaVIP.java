
public class ExperienciaVIP extends ReservaExperiencia {
	
	private double adicionalPorPessoa;
	public ExperienciaVIP(String nomeCliente , double valorBasePorPessoa ,int quantidadeParticipantes , Double adicionalPorPessoa){
		
		super(nomeCliente,valorBasePorPessoa,quantidadeParticipantes);
		this.adicionalPorPessoa = adicionalPorPessoa;
	}
	@Override
	public double calcularValorTotal(){
		
		double aumento;
		aumento = this.getQuantidadeParticipantes() * adicionalPorPessoa;
		return this.getQuantidadeParticipantes() + this.getValorBasePorPessoa() + aumento; 
		
		
	
	}
	public double getAdicionalPorPessoa(){
		
		return adicionalPorPessoa;
	}
	public void setAdicionalPorPessoa(){
		
		adicionalPorPessoa = adicionalPorPessoa;
	}
}

