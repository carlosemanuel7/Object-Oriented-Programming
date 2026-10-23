
public class Paciente {
	
	private String nome;
	private boolean convenio;
	
	public Paciente(String nome , boolean convenio){
		
		this.nome = nome;
		this.convenio = convenio;
	}
	
	public String getNome(){
		
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public boolean isConvenio(){
		
		return this.convenio;
	}
	public void setConvenio(boolean convenio){
		
		this.convenio = convenio;
	}
	
}
	



