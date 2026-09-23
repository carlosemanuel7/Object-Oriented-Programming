import java.util.Scanner;

public class Loja {
	
	public static void main (String[] args) {
		
		Produto p1 = new Produto("Milho" , 2.50 , 50 ,"Milho kibom");
		Produto p2 = new Produto("Açai 1kg" , 34.5 , 50 ,"Açai frutelly");
		Produto p3 = new Produto("Massa pizza" , 12.0 , 50 ,"Massa italiana");
		Scanner entrada = new Scanner(System.in);
		int opt = -1;
		do{
			
			
			System.out.println("MartMais");
			System.out.println("1 - Vender Produto (Com ou seu desconto)");
			System.out.println("2 - Comprar um Produto (Com ou sem frete)");
			System.out.println("3 - Calcular o Valor do estoque (Com ou sem imposto)");
			System.out.println("4 - Exibir detalhes de um produto (Com ou sem estoque)");
			System.out.println("5 - Encerrarr Programa");
			opt = entrada.nextInt();
			entrada.nextLine();
	
			if (opt >= 1 && opt <= 4)
			{
				System.out.println("Qual produto deseja manipular?");
				System.out.println("1 - Milho");
				System.out.println("2 - Açai");
				System.out.println("3 - Massa pizza");
				int indiceP = entrada.nextInt();
				Produto produtoEscolhido = null;
				entrada.nextLine();
				
				switch (indiceP)
				{
					case 1: produtoEscolhido = p1;
						break;
					case 2: produtoEscolhido = p2;
						break;
					case 3: produtoEscolhido = p3;
						break;
					default:
                        System.out.println("Produto inválido!");
                        continue; 
					
				}
				
				int qtd = 0;
				Double valorVenda = 0.0;
				switch (opt)
				{
					case 1: System.out.println("Digite a quantidade de produtos que deseja vender:");
							qtd = entrada.nextInt();
							entrada.nextLine();
							System.out.println("Com desconto? S/N");
							boolean temDesconto = entrada.nextLine().equalsIgnoreCase("S");
							if (temDesconto){
								
								System.out.println("Digite o valor do desconto:");
								Double desconto = entrada.nextDouble();
								valorVenda = produtoEscolhido.vender(qtd , desconto);
								
							}
							else
							
								valorVenda = produtoEscolhido.vender(qtd);
									
							if (valorVenda > 0)
							{
								System.out.println("Venda Realizada , total: " + valorVenda);
							}
							else
								System.out.println("Venda n Realizada");
						break;
						
					case 2: System.out.println("Digite a quantidade de produtos que deseja comprar: ");
							qtd = entrada.nextInt();
							entrada.nextLine();
							System.out.println("Com frete? S/N");
							boolean temFrete = entrada.nextLine().equalsIgnoreCase("S");
							if (temFrete){
								
								System.out.println("Digite o valor do frete:");
								Double frete = entrada.nextDouble();
								valorVenda = produtoEscolhido.comprar(qtd , frete);
								
							}
							else
							
								valorVenda = produtoEscolhido.comprar(qtd);
									
							if (valorVenda > 0)
							{
								System.out.println("Compra Realizada , total: " + valorVenda);
							}
							else
								System.out.println("Compra n Realizada");
						break;
						
					case 3: System.out.println("Exibir com Imposto? S/N");
							boolean mostrarImposto = entrada.nextLine().equalsIgnoreCase("S");
							if (mostrarImposto){
								
								System.out.println("Digite a % do imposto:");
								Double imp = entrada.nextDouble();
								System.out.println(produtoEscolhido.calcularValorTotalEstoque(imp));
								
							}
							else
								System.out.println(produtoEscolhido.calcularValorTotalEstoque());
						break;
						
					case 4: System.out.println("Exibir produto com estoque? S/N");
							boolean mostrarDetalhado = entrada.nextLine().equalsIgnoreCase("S");
							if (mostrarDetalhado){
								
								System.out.println(produtoEscolhido.exibirDetalhes(true));
								
							}
							else
								System.out.println(produtoEscolhido.exibirDetalhes());
						
						break;
					
				}
			}
			else 
				System.out.println("Encerrando");
			
		} while (opt != 5);
		
	}
}

