
public class Venda {
	
	private int numero;
	private Cliente comprador;
	private Produto produto;
	private int quantidade;
	
	public Venda(int numero , Cliente comprador , Produto produto , int quantidade){
		
		this.numero = numero;
		this.comprador = comprador;
		this.produto = produto;
		this.quantidade = quantidade;
		
	}
	
	public int getNumero(){
		
		return numero;
	}
	public void setNumero(int numero){
		
		this.numero = numero;
	}

	public Cliente getComprador(){
		
		return comprador;
	}

	public void setComprador(Cliente comprador){
		
		this.comprador = comprador;
	}

	public Produto getProduto(){
		
		return produto;
	}

	public void setProduto(Produto produto){
		
		this.produto = produto;
	}

	public int getQuantidade(){
		
		return quantidade;
	}

	public void setQuantidade(int quantidade){
		
		this.quantidade = quantidade;
	}
	public String imprimir(){
		
		 Double valorTotal = produto.getPreco() * quantidade;
		 
		if (comprador.getLimiteDeCredito() > valorTotal)
		{
			return "Nome do comprador: " +	comprador.getNome() + " - Descrição: " + produto.getDescricao() + " - Quantidade: " + getQuantidade()
			+ " Valor da compra: " + valorTotal + " - Dentro do limite de crédito";
		}
		return "Nome do comprador: " +	comprador.getNome() + " - Descrição: " + produto.getDescricao() + " - Quantidade: " + getQuantidade()
		+ " Valor da compra: " + valorTotal + " - Fora do limite de crédito";
	}
}

