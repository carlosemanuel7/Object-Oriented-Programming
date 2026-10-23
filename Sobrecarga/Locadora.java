import java.util.Scanner;

public class Locadora {
	
	public static void main (String[] args) {
		
		Veiculo v1 = new Veiculo("ABC-123" , "Jetta" , "Luxo" , 12500);
		Veiculo v2 = new Veiculo("DEF-456" , "Jeep" , "SUV" , 40000);
		Veiculo v3 = new Veiculo("GHI-789" , "Uno" , "Economico" , 32500);
		
		Scanner entrada = new Scanner(System.in);
		int opt = -1;
		do{
		
			System.out.println("CRL Locadora");
			System.out.println("1 - Calcular locação");
			System.out.println("2 - Exibir detalhes");
			System.out.println("3 - Encerrar");
			opt = entrada.nextInt();
			entrada.nextLine();
			
			if (opt >= 1 && opt <= 2)
			{
			
				Veiculo veiculoEscolhido = null;
				int indice = -1;
				System.out.println("1 - " +v1.getModelo());
				System.out.println("2 - " +v2.getModelo());
				System.out.println("3 - " +v3.getModelo());
				indice = entrada.nextInt();
				
				switch (indice)
				{
					case 1: veiculoEscolhido = v1;
						break;
					case 2: veiculoEscolhido = v2;
						break;
					case 3: veiculoEscolhido = v3;
						break;
						
					default: System.out.println("Opção invalida");		
						continue;
				}
				Double valorFinal = 0.0;
				int qtdKm = 0;
				switch (opt)
				{
					case 1: System.out.print("Qual foi a quantidade de dias?");
							int dias = entrada.nextInt();
							entrada.nextLine();
							System.out.print("Deseja informar quilometragem? S/N ");
							boolean informarKm = entrada.nextLine().equalsIgnoreCase("S");
							System.out.print("Seguro foi ativado? S/N ");
							boolean seguro = entrada.nextLine().equalsIgnoreCase("S");
							if (!informarKm && !seguro){
								
								valorFinal = veiculoEscolhido.calcularLocacao(dias);
							}
							else if (informarKm && !seguro){
								
								System.out.print("Qual foi a quantidade KMs?");
								qtdKm = entrada.nextInt();
								valorFinal = veiculoEscolhido.calcularLocacao(dias , qtdKm);
							}
							else if (!informarKm && seguro){
								
								qtdKm = 100 * dias;
								valorFinal = veiculoEscolhido.calcularLocacao(dias , qtdKm , true);
							}
							else if (informarKm && seguro){
								
								System.out.print("Qual foi a quantidade KMs?");
								qtdKm = entrada.nextInt();
								valorFinal = veiculoEscolhido.calcularLocacao(dias , qtdKm , true);
							}
							if (valorFinal > 0)
							{
								System.out.println("O total foi de: R$" + valorFinal);
							}
						break;
					case 2: System.out.println(veiculoEscolhido.exibirDetalhes());
						break;
				}
			}
			else{ 
				opt = 3;
				System.out.println("Encerrando...");
			}
		} while (opt != 3);
		
	}
}

