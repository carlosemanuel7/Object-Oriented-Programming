import java.util.Scanner;

public class Exercise10 {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		float nota1 , nota2 , nota3;
		
		System.out.print("Digite a nota do trabalho:");
		nota1 = scan.nextFloat();
		
		System.out.print("Digite a nota da avaliação semestral:");
		nota2 = scan.nextFloat();
		
		System.out.print("Digite a nota do exame final:");
		nota3 = scan.nextFloat();
		
		nota1 = nota1 * 2;
		nota2 = nota2 * 3;
		nota3 = nota3 * 5;
		
	   float total = 0 ;
	   total = (nota1 + nota2 + nota3) / 10;
	   
		if (total >= 8 && total >= 10 ){
			
		   System.out.println("Nota final: A");
		}
		else if (total >= 7 && total < 8 ){
			
		   System.out.println("Nota final: B");
		}
		else if (total >= 6 && total < 7 )
		{
		   System.out.println("Nota final: C");
		}
		else if(total >= 5 && total < 6){
		   
		   System.out.println("Nota final: D");
		   
		}
		else 
			System.out.println("Nota final: E");
			
		
		
	}
}

