import java.util.Scanner;

public class Transporte {
	
	public static void main (String[] args) {
		
		Onibus o1 = new Onibus(10 , "Lontra > Itac" , 40 , 40.0);
		Scanner entrada = new Scanner(System.in);
		int opt = -1;
		do{
		
			System.out.println("Bem vindo a transNorte");
			System.out.println("1 - Embarcar Passageiro");
			System.out.println("2 - Desembarcar Passageiro");
			System.out.println("3 - Calcular Renda");
			System.out.println("4 - Exibir Info");
			System.out.println("5 - Encerrar Programa");
			opt = entrada.nextInt();
			entrada.nextLine();
			int qtd = 0;
			boolean emb = false;
			switch (opt)
			{
				case 1: System.out.println("Quantos passageiros deseja embarcar?");
						qtd = entrada.nextInt();
						if (qtd == 1){
							
							emb = o1.embarcarPassageiro();
						}
						else if (qtd > 1){
							
							emb = o1.embarcarPassageiro(qtd);
						}
						if (emb){
							System.out.println("Passageiro(s) embarcado");
						}
						else
							System.out.println("Não foi possível embarcar");
						
					
					break;
				case 2: System.out.println("Quantos passageiros deseja desembarcar?");
						qtd = entrada.nextInt();
						if (qtd == 1){
							
							emb = o1.desembarcarPassageiro();
						}
						else if (qtd > 1){
							
							emb = o1.desembarcarPassageiro(qtd);
						}
						if (emb){
							System.out.println("Passageiro(s) desembarcado");
						}
						else
							System.out.println("Não foi possível desembarcar");
					break;
				case 3: System.out.println(o1.calcularRenda("INTEGRADA"));
					break;
				case 4: System.out.println("Com detalhes? S/N");
						boolean comDetalhe = entrada.nextLine().equalsIgnoreCase("S");
						if (comDetalhe){
							
							System.out.println(o1.exibirInfo(true));
						}
						else{
							System.out.println("Exibir tarifa? S/N");
							boolean t = entrada.nextLine().equalsIgnoreCase("S");
							if(t)
							{
								System.out.println(o1.exibirInfo(false));
							}
							else
								System.out.println(o1.exibirInfo());
						}
					break;
				case 5: System.out.println("Programa Encerrando..."); 
					break;
				
			}
	
		} while (opt != 5);
		
		
	}
}

