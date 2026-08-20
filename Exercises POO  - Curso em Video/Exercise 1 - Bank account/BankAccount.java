import java.util.Random;
import java.util.Scanner;

public class BankAccount{
	
	private static int cont = 0;
	private int numConta = 0;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	Random random = new Random();
	Scanner scan = new Scanner(System.in);
	
	public BankAccount(){
		
		this.saldo = 0;
		this.status = false;
	}
	
	public int getNumConta(){
		
		return this.numConta;
		
	}
	public void setTipo(String tipo){
		
		if ("Conta Salário".equals(tipo)){
			
			this.tipo = "Conta Salário";
		}
		else
			this.tipo = "Conta Corrente";
		
		
	}
	public String getTipo(){
		
		return this.tipo;
		
	}
	public void setDono(String dono){
		
		this.dono = dono;
		
	}
	public String getDono(){
		
		return this.dono;
		
	}
	
	public void setSaldo(double saldo){
		
		this.saldo = saldo;
		
	}
	public double getSaldo(){
		
		return this.saldo;
	}
	public void setStatus(boolean status){
		
		this.status = status;
		
	}
	public boolean getStatus(){
		
		return this.status;
		
	}
	public void abrirConta(String dono , String tipo){
		
		this.setDono(dono);
		this.setTipo(tipo);
		this.setStatus(true);
		this.numConta = cont;
		cont++;
		
		if ("Conta Salário".equals(this.tipo))
		{
			this.setSaldo(30);
		}
		else
			this.setSaldo(50);
	}
	
	public void contaStatus(){
		
		System.out.println("Bem vindo ao BB , Sr(a)" +this.getDono());
		System.out.println("Número da conta: " +this.getNumConta());
		System.out.println("Saldo: R$" +this.getSaldo());
		System.out.println("Tipo de conta: " +this.getTipo());
		if (status == true)
		{
			System.out.println("Status da conta: aberta");
		}
		else 
			System.out.println("Status da conta: fechada");


		System.out.println("");
		
	}
	
	public void efetuarDeposito(){
		
		int n;
		System.out.println("Digite o valor que vc quer depositar");
		n = scan.nextInt();
		
		this.setSaldo(this.saldo + n);
		
		
	}
	public void efetuarSaque(){
	
		int n;
		System.out.println("Digite o valor que vc quer sacar");
		n = scan.nextInt();
		
		if (this.getSaldo() >= n){
			
			this.setSaldo(this.saldo - n);
			
		}
		else 
			System.out.println("Valor indisponível pra saque");
		
	}
	
	public void fecharConta(){
		
		if (this.getSaldo() > 0)
		{
			System.out.println("Não é possivel fechar uma conta com saldo,faça o saque!!");
			
		}
		else
			this.setStatus(false);
			
	
	}
	public void pagarMensal(){
		
		if (this.getTipo() == "Conta Salário")
		{
			this.setSaldo(this.getSaldo() - 20);
		}
		
		else
			this.setSaldo(this.getSaldo() - 30);


	}
	
}
