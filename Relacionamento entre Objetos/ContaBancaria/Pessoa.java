
public class Pessoa {
	
	private String nome;
	private String cpf;
	private String endereco;
	private String telefone;
	private Double renda;
	
	public String getNome(){
		
		return this.nome;
	}
	public void setNome (String nome){
		
		this.nome = nome;
	}
	public String getCpf(){
		
		return this.cpf;
	}
	public void setCpf (String cpf){
		
		this.cpf = cpf;
	}
	public String getEndereco(){
		
		return this.endereco;
	}
	public void setEndereco (String endereco){
		
		this.endereco = endereco;
	}
	public String getTelefone(){
		
		return this.telefone;
	}
	public void setTelefone (String telefone){
		
		this.telefone = telefone;
	}
	public Double getRenda(){
		
		return this.renda;
	}
	public void setRenda(Double renda){
		
		this.renda = renda;
	}
	
	public String informacoes(){
		
		return "Nome " + getNome() + " - Cpf: " + getCpf() + " - Endereço: " + getEndereco() +
		" - Telefone: " + getTelefone() + " - Renda: " + getRenda();
	}
}

