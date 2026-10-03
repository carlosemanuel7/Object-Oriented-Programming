
public class Pessoa {
	
	private String nome;
	private String sexo;
	private Data nascimento;
	
	public Pessoa(String nome){
		
		this.nome = nome;
		this.nascimento = new Data(1, 2, 2000);
		this.sexo = "Não declarado" ; 
		
	}
	public Pessoa(String nome , String sexo , Data nascimento){
		
		this.nome = nome;
		this.sexo = sexo;
		this.nascimento = nascimento;
	}
	public String getNome(){
		
		return this.nome;
	}
	public void setNome(String nome){
		
		this.nome = nome;
	}
	public String getSexo(){
		
		return this.sexo;
	}
	public void setSexo(String sexo){
		
		this.sexo = sexo;
	}
	public Data getNascimento(){
		
		return this.nascimento;
	}
	public void setNascimento(Data nascimento){
		
		this.nascimento = nascimento;
	}
	public String mostraIdade(Data hoje){
		
		if (nascimento.getAno() > hoje.getAno()){
			
			return "Inválido";
		}
		else if(hoje.getAno() == nascimento.getAno())
			return "0";
			
		int idade = hoje.getAno() - nascimento.getAno();
		
		if(hoje.getMes() < nascimento.getMes())
			idade--;
		else if(hoje.getDia() < nascimento.getDia())
			idade--;
		return Integer.toString(idade);
	
	}
}

