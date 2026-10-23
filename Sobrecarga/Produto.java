
public class Produto {
	
	private String nome;
	private Double preco;
	private int estoque;
	private String categoria;
	
	public Produto(String nome , Double preco , int estoque , String categoria){
		
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
		this.categoria = categoria;
	}
	public String getNome(){
		
		return this.nome;
	}
	public void setNome(String nome){
		
		this.nome = nome;
	}
	public String getCategoria(){
		
		return this.categoria;
	}
	public void setCategoria(String categoria){
		
		this.categoria = categoria;
	}
	public Double getPreco(){
		
		return this.preco;
	}
	public void setPreco(Double preco){
		
		this.preco = preco;
	}
	public int getEstoque(){
		
		return this.estoque;
	}
	public void setEstoque(int estoque){
		
		this.estoque = estoque;
	}
	public Double vender(int quantidade){
		
		if (this.estoque >= quantidade)
		{
			this.estoque-=quantidade;
			return this.preco * quantidade;
		}
		return -1.0;
	}
	public Double vender(int quantidade , Double desconto){
		
		if (this.estoque >= quantidade)
		{
			this.estoque-=quantidade;
			return this.preco * quantidade - desconto;
		}
		return -1.0;
	}
	public Double comprar(int quantidade){
		
		this.estoque+=quantidade;
		return this.preco * quantidade;
		
	}
	public Double comprar(int quantidade , Double frete){
		
		this.estoque+=quantidade;
		return this.preco * quantidade + frete;
		
	}
	public Double calcularValorTotalEstoque(){
		
		return this.estoque * this.preco;
		
	}
	public Double calcularValorTotalEstoque(Double imposto){
		
		return (this.estoque * this.preco * (imposto / 100)) +this.estoque * this.preco;
	}
	public String exibirDetalhes(){
		
		return "Nome: " + "["+this.getNome()+"]" + " - Preço: " + "["+this.getPreco()+"]" +" - Categoria: " +
		"["+this.getCategoria()+"]";
	}
	public String exibirDetalhes(boolean mostrarEstoque){
		
		if(mostrarEstoque){
			
			return "Nome: " + "["+this.getNome()+"]" + " - Preço: " + "["+this.getPreco()+"]" +" - Categoria: " +
			"["+this.getCategoria()+"]" + " - Estoque: " + "["+this.getEstoque()+"]" ;
		}
		
		return "Nome: " + "["+this.getNome()+"]" + " - Preço: " + "["+this.getPreco()+"]" +" - Categoria: " +
		"["+this.getCategoria()+"]";
	}
}
