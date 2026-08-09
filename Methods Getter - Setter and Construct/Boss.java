
import java.util.Random;

public class Boss {
	
	String name;
	String typePower;
	private int hp = 10000;
	int dano;
	
	Random random = new Random();
	
	public Boss(String n , String t){//Construct
		
		this.name = n;
		this.typePower = t;
		
	}
	
	int getHp(){
		
		if(this.hp > 0){
			
			return this.hp;  
		}
		else{
			
			System.out.print("Boss dead");
			return 0;
		}
	}
	void setHp(int hp){
		
		this.hp = hp;
	}
	
	public void status(){
		
		System.out.println("Boss stats");
		System.out.println("Name: " +this.name);
		System.out.println("Type of power: " +this.typePower);
		System.out.println("HP: " +this.hp);
		
	}
	void atacar(Player p){
		
		for (int i = 0; i < 1; i++){
			
			dano = random.nextInt (200);
			
		}
		
		System.out.println("O ataque de " +this.name+ " causou " +dano+ " de dano");
		p.setHp (p.getHp() - dano);
	}
	
	
}

