import java.util.Scanner;

public class Cinema {
	
	public static void main (String[] args) {
		
		SessaoCinema s1 = new SessaoCinema(10 , "Rei leão" , 40 , 22.0);
		Scanner entrada = new Scanner(System.in);
		int opt = -1;
		do{
			System.out.println("1 - Comprar Ingresso");
			System.out.println("2 - Exibir bilheteria");
			System.out.println("3 - Exibir Sessão");
			System.out.println("4 - Encerrar Programa");
			opt = entrada.nextInt();
			
			int qtd = 0;
			double valorFinal = 0.0;
			
			switch (opt)
			{
				case 1:
						System.out.println("Digite a quantidade de ingressos:");
						qtd = entrada.nextInt();
						
						entrada.nextLine();
						
						System.out.println("Meia Entrada? S/N");
						boolean meiaEntrada = entrada.nextLine().equalsIgnoreCase("S");
						if (qtd == 1 && !meiaEntrada){
							
							valorFinal = s1.venderIngresso();
							
						}
						else if (qtd == 1 && meiaEntrada){
							
							valorFinal = s1.venderIngresso();
							
						}
						else if(qtd > 1 && !meiaEntrada){
							
							valorFinal = s1.venderIngresso(qtd);
						}
						else if(qtd > 1 && meiaEntrada){
							
							valorFinal = s1.venderIngresso(qtd , true);
						}
						else
							System.out.println("Valor inválido");
							
						if (valorFinal > 0)
						{
							System.out.println("Venda efetuada com sucesso");
							System.out.println("Valor total: " + valorFinal);
						}
					break;
					
				case 2: System.out.println("Bilheteria: " + s1.calcularBilheteria());
					break;
					
				case 3: System.out.println("Deseja exibir a lotação ? S/N" );
						entrada.nextLine();
						boolean mostrarLotacao = entrada.nextLine().equalsIgnoreCase("S");
						
						if (mostrarLotacao){
							
							System.out.println(s1.exibirSessao(true));
						}
						else
							System.out.println(s1.exibirSessao());
				
					break;
				case 4: System.out.println("Prog encerrado");
					break;
			}
			
			
		} while (opt != 4);
		
	}
}

