
public class Bank {
	
	public static void main (String[] args) {
		
		
		BankAccount c1 = new BankAccount();
		BankAccount c2 = new BankAccount();
		BankAccount c3 = new BankAccount();
		
		c1.abrirConta("Carlos" , "Conta Corrente");
		c1.contaStatus();
		System.out.print("\n");
		c2.abrirConta("Luis" , "Conta Salário");
		c2.contaStatus();
		System.out.print("\n");
		c3.abrirConta("Caseiro" , "Conta Corrente");
		c3.contaStatus();
		c1.pagarMensal();
		System.out.print("\n");
		c1.contaStatus();
	
		
		

		
	}
}

