

public class Empresa {
	
	public static void main (String[] args) {
		
		
		Funcionario f1 = new Funcionario("Carlos" , 10 , 20 );
		Funcionario f2 = new Funcionario("Luis jr" , 20 , 50 );
		Funcionario f3 = new Funcionario("Drumon" , 15 , 30);
		
		System.out.println(f1.salariofinal());
		System.out.println(f2.salariofinal());
		System.out.println(f3.salariofinal());
		
		
	}
}

