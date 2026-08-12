
public class Bank {
	
	public static void main (String[] args) {
		
		
		BankAccount c1 = new BankAccount("cc" , "Carlos");
		BankAccount c2 = new BankAccount("cs" , "Luis");
		
		c1.contaStatus();
		System.out.print("\n");
		c2.contaStatus();
		System.out.print("\n");
		c1.abrirConta();
		c1.contaStatus();
		System.out.print("\n");
		c1.efetuarSaque();
		System.out.print("\n");
		c1.contaStatus();
		System.out.print("\n");
		c1.efetuarDeposito();
		c1.contaStatus();
		
		

		
	}
}

