

public class ContaBancaria {
	
	private Pessoa cliente;
	private int numeroDaConta;
	private Double saldo;
	
	public Pessoa getCliente(){
		
		return this.cliente;
	}
	public void setCliente(Pessoa cliente){
		
		this.cliente = cliente;
	}
	public int getNumeroDaConta(){
		
		return this.numeroDaConta;
	}
	public void setNumeroDaConta(int numeroDaConta){
		
		this.numeroDaConta = numeroDaConta;
	}
	public Double getSaldo(){
		
		return this.saldo;
	}
	public void setSaldo(Double saldo){
		
		this.saldo = saldo;
	}
	public boolean sacar(Float saque){
		
		if (this.saldo >= saque)
		{
			this.saldo-=saque;
			return true;
		}
		return false;
	}
	public boolean depositar(Float deposito){
		
		if(deposito > 0){
			
			this.saldo+=deposito;
			return true;
		}
		return false;
	}
}

