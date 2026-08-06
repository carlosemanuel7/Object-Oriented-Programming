import java.util.Scanner;

public class Exercise4 {
	
	public static void main (String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor A:");
		int a = scan.nextInt();
		System.out.println("Digite o valor B:");
		int b = scan.nextInt();
		System.out.println("Digite o valor C:");
		int c = scan.nextInt();
		
		int triangulo = a + b;
		
		if (triangulo > c)
		{
			System.out.println("Esses lados formam um triangulo");
		}
		else 
			System.out.println ("Esses lados não formam um triangulo");
	}
}

