
public class Lutador implements Controlador   {
	
	private String nome;
	private String nacionalidade;
	private int idade;
	private int altura;
	private int peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	public Lutador(String nome , String nacionalidade , int idade , int altura,int peso
	 , int vitorias , int derrotas , int empates){
		
		this.setNome(nome);
		this.setNacionalidade(nacionalidade);
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
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
		this.setCategoria();
		
	}
	
	public int getPeso(){
		
		return this.peso;
	}
	private void setCategoria(){
		
		if (this.peso < 52.2)
		{
			this.categoria = "inválido";
		}
		else if (this.peso <= 70.3)
		{
			this.categoria = "leve";
		}
		else if (this.peso <= 83.9)
		{
			this.categoria = "médio";
		}
		else if (this.peso <= 120.2)
		{
			this.categoria = "pesado";
		}
		else 		
			this.categoria = "inválido";
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
		
		System.out.println("COM VOCÊSSSSSSSSSSSSS: " +getNome());
		System.out.println("Diretamente do(a) " +getNacionalidade());
		System.out.println("Com " +getIdade()+ " Anos e " +getAltura()+ " de altura" );
		System.out.println("Pesando " +getPeso()+ "Kg");
		System.out.println("Vitorias: " +getVitorias());
		System.out.println("Empates: " +getEmpates());
		System.out.println("Derrotas: " +getDerrotas());
		
	}
	public void status(){
		
		System.out.println(getNome()+ " é um peso: " +getCategoria());
		System.out.println("Vitorias: " +getVitorias());
		System.out.println("Empates: " +getEmpates());
		System.out.println("Derrotas: " +getDerrotas());
		
	}
	
}


	
	
