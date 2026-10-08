
public class TestaEstoque {
	
	public static void main (String[] args) {
		
		Estoque estoque = new Estoque();
		
		Produto produto;
		for (int i = 0; i < 10; i++){
			
			produto = new Produto();
			produto.setCodigo(i * 10);
			produto.setPreco(i * 25.0f);
			produto.setQuantidade(i * 2);
			produto.setDescricao("Produto "+i+"00");
			estoque.adicionaProduto(produto);
		}
		
		for(int i=0; i<10; i++){
			produto = estoque.buscaProduto(i*10);
			System.out.printf("Código: %d - Descrição: %s - Preço: R$ %.2f - Quantidade: %d\n", 
			produto.getCodigo(), produto.getDescricao(), produto.getPreco(), produto.getQuantidade());
		}
		
		estoque.excluiProduto(estoque.buscaProduto(50));
		System.out.printf("\n\n");		
		
		for(int i=0; i<10; i++){
			produto = estoque.buscaProduto(i*10);
			if(produto == null){
				continue;
			}
			System.out.printf("Código: %d - Descrição: %s - Preço: R$ %.2f - Quantidade: %d\n", 
			produto.getCodigo(), produto.getDescricao(), produto.getPreco(), produto.getQuantidade());
		
		
		}
	}
}

