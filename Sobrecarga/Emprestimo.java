

public class Emprestimo {

	String nomeCliente;
	int renda;
	
	public Emprestimo(){
		
		this.renda = 0;
	}
	public Emprestimo(String nomeCliente , int renda){
		
		nomeCliente = nomeCliente;
		this.renda = renda;
	}
	
	public String getNomeCliente(){
		
		return this.nomeCliente;
	}
	public void setNomeCliente(String nomeCliente){
		
		this.nomeCliente = nomeCliente;
	}
	public int getRenda(){
		
		return this.renda;
	}
	
	public void setRenda(int renda){
		
		this.renda = renda;
	}
	
	public int calculaEmprestimo(){
		
		return this.renda * 4;
		
	}
	public int calculaEmprestimo(int p){
		
		return this.renda * p;
	}
	public double calculaEmprestimo(double p){
		
		return this.renda * 5 - (renda * p / 100);
	}
}
