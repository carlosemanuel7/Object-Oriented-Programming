
public class Produto {
	
	private int codigo;
	private String descricao;
	private Double custo; 
	private Double preco;
	
	public Produto(int codigo , String descricao , Double custo){
		
		this.codigo = codigo;
		this.descricao = descricao;
		this.custo = custo;
		calculaPreco();
		
	}
	public int getCodigo(){
		
		return this.codigo;
	}
	public void setCodigo(int codigo){
		
		this.codigo = codigo;
	}
	public String getDescricao(){
		
		return this.descricao;
	}
	public void setDescricao(String codigo){
		
		this.descricao = descricao;
	}
	public Double getCusto(){
		
		return this.custo;
	}
	public void setCusto(Double custo){
		
		this.custo = custo;
	}
	public Double getPreco(){
		
		return this.preco;
	}
	public void calculaPreco(){
		
		this.preco = this.custo + (this.custo * 0.25);
	}
}

