
public class Funcionario {
	
	private String nome;
	private double salarioBase;
	private int tempoDeServido;
	
	public Funcionario(String nome , double salarioBase , int tempoDeServido){
		
		this.nome = nome;
		this.salarioBase = salarioBase;
		this.tempoDeServido = tempoDeServido;
		
	}
	public String getNome(){
		
		return this.nome;
	}
	public void setNome(String nome){
		
		this.nome = nome;
	}
	public double getSalarioBase(){
		
		return this.salarioBase;
	}
	public void setSalarioBase(double salarioBase){
		
		this.salarioBase = salarioBase;
	}
	public int getTempoDeServido(){
		
		return this.tempoDeServido;
	}
	public void setTempoDeServido(int tempoDeServido){
		
		this.tempoDeServido = tempoDeServido;
	}
	public double mostraSalario(){
		
		if (tempoDeServido <= 10)
		{
			return this.salarioBase + (salarioBase * 12 / 100);
		}
		else 
			return this.salarioBase + (salarioBase * 17 / 100);
		
	}

	public double mostraSalario(double totalVendas){
		
		if (tempoDeServido <= 10)
		{
			return this.salarioBase + (salarioBase * 5 / 100) + (totalVendas * 0.015);
		}
		else
			return this.salarioBase + (salarioBase * 5 / 100) + (totalVendas * 0.020);

	}
	
}


