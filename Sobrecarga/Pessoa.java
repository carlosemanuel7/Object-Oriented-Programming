
public class Pessoa {
	
	private String nome;
	private String sexo;
	private int mesDeNascimento;
	private int anoDeNascimento;
	
	public Pessoa(String nome){
		
		this.nome = nome;
		this.mesDeNascimento = mesDeNascimento;
		this.anoDeNascimento = anoDeNascimento;
	}
	public Pessoa(String nome , String sexo , int mesDeNascimento , int anoDeNascimento){
		
		this.nome = nome;
		this.sexo = sexo;
		this.mesDeNascimento = mesDeNascimento;
		this.anoDeNascimento = anoDeNascimento;
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
	public int getMesDeNascimento(){
		
		return this.mesDeNascimento;
	}
	public void setMesDeNascimento(int mesDeNascimento){
		
		this.mesDeNascimento = mesDeNascimento;
	}
	public int getAnoDeNascimento(){
		
		return this.mesDeNascimento;
	}
	public void setAnoDeNascimento(int anoDeNascimento){
		
		this.anoDeNascimento = anoDeNascimento;
	}
	public int mostraIdade(){
		
		int i;
		i = this.anoDeNascimento - 2018;
		if(this.mesDeNascimento < 10 ){
		
			return i - 1;
		}
		else
			return i;
	}
	public int mostraIdade(int ano , int mes){
		
		if (ano > this.anoDeNascimento){
			
			System.out.println("Inválido");
			return 0;
		}
		else if(this.mesDeNascimento < mes){
			
			return anoDeNascimento - ano - 1;
		} 
			
		
		
		
	}
}

