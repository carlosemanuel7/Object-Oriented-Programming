import java.util.Scanner;

public class Exercise8 {
	
	public static void main (String[] args) {
		
			Scanner scan = new Scanner(System.in);
		
		int [] vet = new int [3];
		int menor = 0;
		for (int i = 0; i < vet.length ; i++){
			
			System.out.println("Digite um valor:");
			
			vet[i] = scan.nextInt();
		}
		if (vet[0] < vet[1] && vet[0] < vet[1])
		{
			menor = vet[0];
		}
		if (vet[1] < vet[0] && vet[1] < vet[2])
		{
			menor = vet[1];
		}
		if (vet[2] < vet[0] && vet[2] < vet[0])
		{
			menor = vet[2];
		}
		
		System.out.println("O menor valor é o: " +menor);
	}
}

