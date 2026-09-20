import java.util.Scanner;

public class Hotel {
	
	public static void main (String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Reserva r1 = new Reserva(02 , "Carlos" , 10 , true);
		
		int opt = -1;
		do{
			
			System.out.println("--HARD ROCK HOTEL--");
			System.out.println("1 - Calcular diária");
			System.out.println("2 - Adicionar Passeio");
			System.out.println("3 - Exibir Reserva");
			System.out.println("4 - Encerrar Programa");
			opt = entrada.nextInt();
			entrada.nextLine();
			int qtd;
			Double valorFinal = -1.0;
			Double valor = -1.0;
			switch (opt)
			{
				case 1: 
						System.out.println("Teve taxa de limpeza? S/N");
						boolean taxa = entrada.nextLine().equalsIgnoreCase("S");
						
						if(taxa){
							System.out.println("Qual foi o valor?");
							valor = entrada.nextDouble();
							valorFinal = r1.calcularDiaria(valor);
							System.out.println("Valor das diárias:" + valorFinal);
							
						}
						else{
							
							valorFinal = r1.calcularDiaria();
							System.out.println("Valor das diárias:" + valorFinal);
							
						}
					break;
				
				case 2: Double valorPasseio = -1.0;
						System.out.println("Qual foi o passeio?");
						String passeio = entrada.nextLine();
						System.out.println("Qual foi a quantidade de passeios?");
						qtd = entrada.nextInt();
						
						if (passeio.equalsIgnoreCase("CAVALGADA")){
							
							valorPasseio = r1.adicionarPasseio("Cavalgada" , qtd);
							System.out.println("Valor dos Passeios: " + valorPasseio);
						}
						else if (passeio.equalsIgnoreCase("TRILHA")){
							
							valorPasseio = r1.adicionarPasseio("Cavalgada" , qtd);
							System.out.println("Valor dos Passeios: " + valorPasseio);
						}
						else if (passeio.equalsIgnoreCase("PESCA")){
							
							valorPasseio = r1.adicionarPasseio("Cavalgada" , qtd);
							System.out.println("Valor dos Passeios: " + valorPasseio);
						}
					break;
				case 3: System.out.println("Exibir Reserva com Refeiçoes? S/N");
						boolean comDetalhe = entrada.nextLine().equalsIgnoreCase("S");
						if (comDetalhe)
						{
							System.out.println(r1.exibirReserva(true));
						}
						else
							System.out.println(r1.exibirReserva());
					break;
					
				case 4: System.out.println("SAINDO");		
					break;
			}
			
			
		
		} while (opt != 4);
		
	}
}

