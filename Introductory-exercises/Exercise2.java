import java.util.Scanner;

public class Exercise2 {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor");
		int num = scan.nextInt();
		
		if (num >= 1 && num <= 9)
		{
			System.out.println("Valor na faixa permitida");
		}
		else
			System.out.println("O valor está fora da faixa permitida");
			
		
		
	}
}

