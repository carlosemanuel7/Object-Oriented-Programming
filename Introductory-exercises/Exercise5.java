import java.util.Scanner;

public class Exercise5 {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor:");
		int a = scan.nextInt();
		System.out.println("Digite o segundo valor:");
		int b = scan.nextInt();
		System.out.println("Digite o terceiro valor:");
		int c = scan.nextInt();
		System.out.println("Digite o quarto valor:");
		int d = scan.nextInt();
		
		if (a%2==0 && a%3==0 ){
			
			System.out.print(a+ " É divisivel por 2 e por 3\n");
			
		}
			
		if (b%2==0 && b%3==0 ){
		
			System.out.print(b+ " É divisivel por 2 e por 3\n");
			
		}
			
		if (c%2==0 && c%3==0 ){
			
			System.out.print(c+ " É divisivel por 2 e por 3\n");
			
		}
			
		if (d%2==0 && d%3==0 ){
			
			System.out.print(d+ " É divisivel por 2 e por 3\n");
			
		}
		
	}
}

