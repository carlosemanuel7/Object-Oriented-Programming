
public class UltimateEmojiCombat {
	
	public static void main (String[] args) {
		
		Lutador l[] = new Lutador[4];
		l[0] = new Lutador("Carlos" , "Suiça" , 21 , 180 , 104 , 10 , 2 ,1);
		l[1] = new Lutador("Drumon" , "Londres" , 35 , 185 , 120 , 10 , 3 ,5);
		l[2] = new Lutador("Luis jr" , "Itac" , 35 , 186 , 70 , 7 , 4 ,2);
		l[3] = new Lutador("Jotave" , "Candial" , 35 , 186 , 80 , 9 , 3 ,2);
		Luta l1 = new Luta();
		
		for (int i = 0; i < l.length; i++)
		{
			l[i].status();
			System.out.println("");
			
		}
		
		l1.marcarLuta(l[0], l[1]);
	}
}

