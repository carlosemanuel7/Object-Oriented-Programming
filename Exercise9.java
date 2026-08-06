import java.util.Scanner;


public class Exercise9 {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);

		float [] vet = new float[3];
		
		for (int i = 0; i < vet.length; i++){
			
			System.out.println("Digite seu salário:");
			vet[i] = scan.nextFloat();
			if (vet[i] < 5000 )
			{
				vet[i] = (vet[i] * 0.3f) + vet[i];
				System.out.print("Salário reajustado: " + vet[i] + "\n" );
			}
			
		}
		
	}
}

