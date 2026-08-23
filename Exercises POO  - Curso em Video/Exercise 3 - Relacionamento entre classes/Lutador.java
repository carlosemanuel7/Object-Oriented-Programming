
public class Lutador   {
	
	private String nome;
	private String nacionalidade;
	private int idade;
	private int altura;
	private int peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	public Lutador(String nome , String nacionalidade , int idade , int altura,int peso,
	String categoria , int vitorias , int derrotas , int empates){
		
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.categoria = categoria;
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
		
	}
	private void setNome(String nome){
		
		this.nome = nome;
	}
	private String getNome(){
		
		return this.nome;
	}
	private void setNacionalidade(String nacionalidade){
		
		this.nacionalidade = nacionalidade;
	}
	private String getNacionalidade(){
		
		return this.nacionalidade;
	}
	private void setIdade(int idade){
		
		this.idade = idade;
	}
	private int getIdade(){
		
		return this.idade;
	}
	private void setAltura(int altura){
		
		this.altura = altura;
	}
	private int getAltura(){
		
		return this.altura;
	}
	private void setPeso(int peso){
		
		this.peso = peso;
	}
	private int getPeso(){
		
		return this.peso;
	}
	private void setCategori(String categoria){
		
		this.categoria = categoria;
	}
	private String getCategoria(){
		
		return this.categoria;
	}
	private void setVitorias(int vitorias){
		
		this.vitorias = vitorias;
	}
	private int getVitorias(){
		
		return this.vitorias;
	}
	private void setDerrotas(int derrotas){
	 
		this.derrotas = derrotas;
	}
	private int getDerrotas(){
		
		return this.derrotas;
	}
	private void setEmpates(int empates){
	 
		this.empates = empates;
	}
	private int getEmpates(){
		
		return this.empates;
	}
	
}


	
	
