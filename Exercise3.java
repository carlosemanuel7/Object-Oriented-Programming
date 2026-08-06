import java.util.Scanner;

public class Exercise3 {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Valor A:");
		int a = scan.nextInt();
		System.out.println("Valor B:");
		int b = scan.nextInt();
		System.out.println("Valor C:");
		int c = scan.nextInt();
		
		int delta = b*b - 4 * a * c;
		
		if (delta > 0){
			
			System.out.println("Essa equação possui 2 raizes reais");
		}
		else if (delta < 0) {
			
			System.out.println("Essa equação não possui raizes reais");
		}
		else
			System.out.println("Essa equação possui 1 raiz real");
		
	}
}

