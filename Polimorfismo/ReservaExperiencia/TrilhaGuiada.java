
public class TrilhaGuiada extends ReservaExperiencia {
	
	private String dificuldade;
	
	public TrilhaGuiada(String nomeCliente , double valorBasePorPessoa ,int quantidadeParticipantes , String dificuldade){
		
		super(nomeCliente,valorBasePorPessoa,quantidadeParticipantes);
		this.dificuldade = dificuldade;
	}
	@Override
	public double calcularValorTotal(){
		double aumento;
		if (dificuldade.equalsIgnoreCase("leve"))
		{
			aumento = this.getQuantidadeParticipantes() * 0.05;
			return this.getQuantidadeParticipantes() + this.getValorBasePorPessoa() + aumento; 
		}
		else if (dificuldade.equalsIgnoreCase("moderada"))
		{
			aumento = this.getQuantidadeParticipantes() * 0.10;
			return this.getQuantidadeParticipantes() + this.getValorBasePorPessoa() + aumento; 
		}
		else if (dificuldade.equalsIgnoreCase("desafiadora"))
		{
			aumento = this.getQuantidadeParticipantes() * 0.15;
			return this.getQuantidadeParticipantes() + this.getValorBasePorPessoa() + aumento; 
		}
		else 
			return -1.0;
	}
	public String getDificuldade(){
		
		return this.dificuldade;
	}
	public void setDificuldade(String dificuldade){
		
		this.dificuldade = dificuldade;
	}
}

