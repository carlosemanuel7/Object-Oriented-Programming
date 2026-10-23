

public class ConsultaCirurgica extends ConsultaEspecialista {
	
	private boolean taxaAnestesia;
	
	public ConsultaCirurgica(Paciente paciente , Double valorConsulta , boolean retornoIncluso , boolean taxaAnestesia){
		
		super(paciente,valorConsulta,retornoIncluso);
		this.taxaAnestesia = taxaAnestesia;

	}
	
	@Override
	public Double calculaPrecoFinal(){
		
		if (this.taxaAnestesia){
			
			return super.calculaPrecoFinal() + 500;
		}
		else
			return super.calculaPrecoFinal();
		
	}
	
	public boolean isTaxaAnestesia(){
		
		return this.taxaAnestesia;
	}
	public void setTaxaAnestesia(boolean taxaAnestesia){
		
		this.taxaAnestesia = taxaAnestesia;
	}
}

