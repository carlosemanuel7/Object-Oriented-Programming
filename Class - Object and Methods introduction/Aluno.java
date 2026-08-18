
public class Aluno{
	
	String nome;
	double nota1;
	double nota2;
	
	
	public Aluno(String n , double n1 , double n2){
		
		this.nome = n;
		this.nota1 = n1;
		this.nota2 = n2;
		
	}
	
	public void resultado(){
		
		double media = (nota1 + nota2) / 2;
		if (media >= 6){
			
			System.out.println("Aprovado");
		
		}
		else 
			System.out.println("Reprovado");
		
	} 

}

