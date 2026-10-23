
public class PasseioDeBarco extends ReservaExperiencia{
	
	private boolean rotaEstendida;
	
	public PasseioDeBarco(String nomeCliente , double valorBasePorPessoa ,int quantidadeParticipantes , boolean rotaEstendida){
		
		super(nomeCliente,valorBasePorPessoa,quantidadeParticipantes);
		this.rotaEstendida = rotaEstendida;
	}
	@Override
	public double calcularValorTotal(){
		double aumento;
		if (rotaEstendida)
		{
			aumento = this.getQuantidadeParticipantes() * 0.20;
			return this.getQuantidadeParticipantes() + this.getValorBasePorPessoa() + aumento; 
		}
		return this.getQuantidadeParticipantes() * this.getValorBasePorPessoa();
	
	}
	public boolean getRotaEstendida(){
		return this.rotaEstendida;
	}
	public void setRotaEstendida(){
		this.rotaEstendida = rotaEstendida;
	}
}

