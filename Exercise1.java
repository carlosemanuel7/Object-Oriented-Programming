
import java.util.Scanner;

public class Exercise1 {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Primeiro valor:");
		int x = scan.nextInt();
		System.out.println("Segundo valor:");
		int y = scan.nextInt(); 
		int diff;
		if (x > y)
		{
			diff = x - y; 
		}
		else{
			diff =  y - x;
		}
		if(x == y){
			diff = 0;
		}
		
		System.out.println(diff);
	}
}

