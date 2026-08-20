
public class Bank {
	
	public static void main (String[] args) {
		
		
		BankAccount c1 = new BankAccount();
		BankAccount c2 = new BankAccount();
		BankAccount c3 = new BankAccount();
		BankAccount [] contas = new BankAccount[3];
		contas[0] = c1;
		contas[1] = c2;
		contas[2] = c3;
		c1.abrirConta("Carlos" , "Conta Corrente");
		c2.abrirConta("Luis" , "Conta Salário");
		c3.abrirConta("Caseiro" , "Conta Corrente");
		for (int i = 0; i < contas.length; i++)
		{
			contas[i].contaStatus();

		}
		
	}
}

