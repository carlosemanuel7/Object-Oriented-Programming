

public class ConsultaEspecialista extends Consulta {
	
	private boolean retornoIncluso;
	
	public ConsultaEspecialista(Paciente paciente , Double valorConsulta , boolean retornoIncluso){
		
		super(paciente,valorConsulta);
		this.retornoIncluso = retornoIncluso;

	}
	
	@Override
	public Double calculaPrecoFinal(){
		
		if (this.retornoIncluso){
			
			return super.calculaPrecoFinal() + (super.calculaPrecoFinal() * 0.20 );
		}
		else
			return super.calculaPrecoFinal();
		
	}
	
	public boolean isRetornoIncluso(){
		
		return this.retornoIncluso;
	}
	public void setRetornoIncluso(boolean retornoIncluso){
	
		this.retornoIncluso = retornoIncluso;
	}
	
	
}

