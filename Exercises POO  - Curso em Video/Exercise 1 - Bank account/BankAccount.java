import java.util.Random;
import java.util.Scanner;

public class BankAccount{
	
	
	private int numConta = 0;
	private int nextid = 1;
	protected String tipo;
	private String dono;
	private int saldo;
	private boolean status;
	Random random = new Random();
	Scanner scan = new Scanner(System.in);
	
	public BankAccount(String t , String d){
		
		this.numConta = nextid + 1;
		this.tipo = t;
		this.dono = d;
		this.saldo = 0;
		this.status = false;
	}
	
	public void setNumConta(int n){
		
		this.numConta = n;
		
	}
	public int getNumConta(){
		
		return this.numConta;
		
	}
	public void setTipo(String t){
		
		this.tipo = t;
		
	}
	public String getTipo(){
		
		return this.tipo;
		
	}public void setDono(String t){
		
		this.dono = t;
		
	}
	public String getDono(String d){
		
		return this.dono;
		
	}
	
	public void contaStatus(){
		
		System.out.println("Bem vindo ao BB , Sr(a)" +this.dono);
		System.out.println("Número da conta: " +this.numConta);
		System.out.println("Saldo: R$" +this.saldo);
		System.out.println("Tipo de conta:" +this.tipo);
		if (status == true)
		{
			System.out.println("Status da conta: aberta");
		}
		else 
			System.out.println("Status da conta: fechada");

		
	}
	public void abrirConta(){
		
		
		this.status = true;
		
		if (this.tipo == "cc")
		{
			this.saldo = 30;
		}
		else
			this.saldo = 50;
	}
	
	public void efetuarDeposito(){
		
		int n;
		System.out.println("Digite o valor que vc quer depositar");
		n = scan.nextInt();
		
		this.saldo = this.saldo + n;
		
		
	}
	public void efetuarSaque(){
	
		int n;
		System.out.println("Digite o valor que vc quer sacar");
		n = scan.nextInt();
		
		if (this.saldo >= n){
			
			this.saldo = this.saldo - n;
			
		}
		else 
			System.out.println("Valor indisponível pra saque");
		
	}
	
	public void fecharConta(){
		
		if (this.saldo > 0)
		{
			System.out.println("Não é possivel fechar uma conta com saldo,faça o saque!!");
			
		}
		else
			this.status = false;
			
	
	}
	public void pagarMensal(){
		
		if (this.tipo == "cs")
		{
			this.saldo -= 20;
		}
		
		else
			this.saldo -= 30;

	
	
	}
	
}
