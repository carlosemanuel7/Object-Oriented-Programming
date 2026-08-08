

public class Game {
	
	public static void main (String[] args) {
		
		Player p1 = new Player();
		
		p1.name = "Carlos";
		p1.power = 1000;
		p1.arma = "Katana";
		p1.atacar();
		p1.ataque_boss();
		p1.defender();
		
	}
}


