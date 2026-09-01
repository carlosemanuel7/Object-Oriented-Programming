
public class Financeira  {
	
	public static void main (String[] args) {
		
		Emprestimo e1 = new Emprestimo("Carlos" , 100);
		
		System.out.println(e1.calculaEmprestimo());
		System.out.println(e1.calculaEmprestimo(10));
		System.out.println(e1.calculaEmprestimo(10.0));
		
	}
}

