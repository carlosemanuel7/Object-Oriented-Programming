
public class Game {
	
	public static void main (String[] args) {
		
		Player p1 = new Player("Carlos" , "Mage" , "Cajado");
		Boss b1 = new Boss ("Dragon" , "Fire");
		p1.status();
		System.out.printf("%n");
		b1.status();
		System.out.printf("%n");
		
			
		System.out.println("Player HP:" +p1.getHp());
		System.out.println("Boss HP:" +b1.getHp());
		
		
		while (b1.getHp() > 0 && p1.getHp() > 0)
		{
			p1.atacar(b1);
			b1.atacar(p1);
		}
		
	}
}


