
import java.util.Scanner;

public class Exercise7 {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int [] vet = new int [3];
		int maior = 0;
		for (int i = 0; i < vet.length ; i++){
			
			System.out.println("Digite um valor:");
			
			vet[i] = scan.nextInt();
		}
		if (vet[0] > vet[1] && vet[0] > vet[1])
		{
			maior = vet[0];
		}
		if (vet[1] > vet[0] && vet[1] > vet[2])
		{
			maior = vet[1];
		}
		if (vet[2] > vet[0] && vet[2] > vet[0])
		{
			maior = vet[2];
		}
		
		System.out.println("O maior valor é o: " +maior);
	}
}















