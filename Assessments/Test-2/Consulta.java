

public class Consulta {
	
	private Paciente paciente;
	private Double valorConsulta;
	
	public Consulta(Paciente paciente , Double valorConsulta){
		
		this.paciente = paciente;
		this.valorConsulta = valorConsulta;
	}
	
	public Double calculaPrecoFinal(){
		
		if(this.paciente.isConvenio()){
			return this.valorConsulta * 0.50;
		}
		else
			return this.valorConsulta;
		
	}
	
	public Paciente getPaciente(){

		return this.paciente;
	}
	public void setPaciente(Paciente paciente){
		
		this.paciente = paciente;
	}
	public Double getValorConsulta(){
		
		return this.valorConsulta;
	}
	public void setValorConsulta(Double valorConsulta){
		
		this.valorConsulta = valorConsulta;
	}

}
