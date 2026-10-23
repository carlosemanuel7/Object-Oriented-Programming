
public class ConsultaExame extends Consulta {
	
	private int quantidadeExames;
	
	public ConsultaExame(Paciente paciente , Double valorConsulta , int quantidadeExames){
		
		super(paciente,valorConsulta);
		this.quantidadeExames = quantidadeExames;
		
	}
	
	@Override
	public Double calculaPrecoFinal(){
		
		return super.calculaPrecoFinal() + (this.quantidadeExames * 50);
		
	}
	
	public int getQuantidadeExames(){
		
		return this.quantidadeExames;
	}
	public void setQuantidadeExames(){
		
		this.quantidadeExames = quantidadeExames;
	}
		
		
	
	
}

