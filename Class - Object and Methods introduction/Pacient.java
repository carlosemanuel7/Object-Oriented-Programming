

public class Pacient{
	
	String nome;
	String sexo;
	double peso;
	double altura;
	double imc;

	
	public  Pacient(String n , String s , double p , double a){
		
		this.nome = n;
		this.sexo = s;
		this.peso = p;
		this.altura = a;
	
		
	}
	
	public double calcularIMC(){
	
		return this.peso / (this.altura * this.altura);
		
	}
	
}
