
public class Estoque {
	
	private Produto [] produtos = new Produto[10];
	
	public void adicionaProduto(Produto produto){
		
		for (int i = 0; i < produtos.length; i++){
			
			if (produtos[i] == null){
				
				produtos[i] = produto;
				break;
			}
		}
		
	}
	public void excluiProduto(Produto produto){
		
		for (int i = 0; i < produtos.length; i++){
			
			if (produtos[i].getCodigo() == produto.getCodigo()){
				
				produtos[i] = null;
				break;
				
			}
			
		}
	
	}
	public Produto buscaProduto(int codigo){
		
		for(Produto temp : produtos){
			
			if (temp == null)
				continue;
			
			else if(temp.getCodigo() == codigo)
				return temp;
				
			
		}
		return null;
		
	}
	public Produto buscaProduto(String descricao){
		
		for(Produto temp : produtos){
			
			if (temp == null)
				continue;
				
			else if(temp.getDescricao() == descricao)
				return temp;
			
		}
		return null;
		
	}
}

