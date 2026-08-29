
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
		
		this.setNome(nome);
		this.setNacionalidade(nacionalidade);
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
		
	}
	public void setNome(String nome){
		
		this.nome = nome;
	}
	public String getNome(){
		
		return this.nome;
	}
	public void setNacionalidade(String nacionalidade){
		
		this.nacionalidade = nacionalidade;
	}
	public String getNacionalidade(){
		
		return this.nacionalidade;
	}
	public void setIdade(int idade){
		
		this.idade = idade;
	}
	public int getIdade(){
		
		return this.idade;
	}
	public void setAltura(int altura){
		
		this.altura = altura;
	}
	public int getAltura(){
		
		return this.altura;
	}
	public void setPeso(int peso){
		
		this.peso = peso;
		if (this.peso <= 80)
		{
			setCategoria("Peso leve");
		}
		else if (this.peso > 80 && this.peso < 100)
		{
			setCategoria("Peso medio");
		}
		else if (this.peso > 100)
		{
			setCategoria("Peso Pesado");
		}
		else 		
			System.out.println("Peso invalido");
			
	}
	
	public int getPeso(){
		
		return this.peso;
	}
	private void setCategoria(String categoria){
		
		this.categoria = categoria;
	}
	public String getCategoria(){
		
		return this.categoria;
	}
	public void setVitorias(int vitorias){
		
		this.vitorias = vitorias;
	}
	public int getVitorias(){
		
		return this.vitorias;
	}
	public void setDerrotas(int derrotas){
	 
		this.derrotas = derrotas;
	}
	public int getDerrotas(){
		
		return this.derrotas;
	}
	public void setEmpates(int empates){
	 
		this.empates = empates;
	}
	public int getEmpates(){
		
		return this.empates;
	}
	public void ganharLuta(){
		
		this.setVitorias(this.getVitorias() + 1);
		
	}
	public void perderLuta(){
		
		this.setDerrotas(this.getDerrotas() + 1);
		
	}
	public void empatarLuta(){
		
		this.setEmpates(this.getEmpates() + 1);
		
	}
	public void apresentar(){
		
		System.out.println("Nome: " +getNome());
		System.out.println("Nacionalidade: " +getNacionalidade());
		System.out.println("Idade: " +getIdade());
		System.out.println("Altura: " +getAltura());
		System.out.println("Peso: " +getPeso());
		System.out.println("Vitorias: " +getVitorias());
		System.out.println("Empates: " +getEmpates());
		System.out.println("Derrotas: " +getDerrotas());
		
	}
	public void status(){
		
		System.out.println(getNome());
		System.out.println("Vitorias: " +getVitorias());
		System.out.println("Empates: " +getEmpates());
		System.out.println("Derrotas: " +getDerrotas());
		
	}
	
}


	
	
