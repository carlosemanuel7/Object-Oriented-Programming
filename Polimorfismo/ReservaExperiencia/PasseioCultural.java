
public class PasseioCultural extends ReservaExperiencia {
	
	private boolean incluiOficina;
	
	public PasseioCultural(String nomeCliente ,  double valorBasePorPessoa ,int quantidadeParticipantes , boolean incluiOficina){
		
		super(nomeCliente,valorBasePorPessoa,quantidadeParticipantes);
		this.incluiOficina = incluiOficina;
	}
	@Override
	public double calcularValorTotal(){
		
		if(incluiOficina){
			
			return this.getQuantidadeParticipantes() * 25 + (getQuantidadeParticipantes() * getValorBasePorPessoa() );
		}
		else 
			return this.getQuantidadeParticipantes() * getValorBasePorPessoa();
	}
	public boolean getIncluiOficina(){
		return this.incluiOficina;
	}
	public void setIncluiOficina(boolean incluiOficina){
		this.incluiOficina = incluiOficina;
	}
}

