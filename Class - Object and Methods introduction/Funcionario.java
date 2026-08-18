public class Funcionario{
	
	String name;
	double horasTrabalhadas;
	double valorDaHora;
	
	public Funcionario(String n , double h , double v){
		
		this.name = n;
		this.horasTrabalhadas = h;
		this.valorDaHora = v;
		
	}
	
	public double salariofinal(){
		
		return (this.horasTrabalhadas * this.valorDaHora) * 0.89;
		
	}
	
}
