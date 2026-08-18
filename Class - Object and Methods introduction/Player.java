import java.util.Random;

public class Player {
	
	String name; 
	private int hp = 1000;
	int power;
	String arma;
	private int dano;
	private int defesa;
	private int atack_boss;
	Random random = new Random();
	
	void atacar(){
		
		for (int i = 0; i < 1; i++){
			
			dano = random.nextInt (1000);
			
		}
		
		System.out.println("O ataque de " +this.name+ " com " +this.arma+ " causou " +dano+ " de dano");
	}
	
	void ataque_boss(){
		
		for (int i = 0; i < 1; i++){
			
			atack_boss = random.nextInt(1000);
			
		}
		
		System.out.println("O boss deu um ataque de " +atack_boss);
		
	}
	void defender(){
		
		
		for (int i = 0; i < 1; i++){
			
			defesa = random.nextInt(atack_boss);
			this.hp = 1000 - (atack_boss - defesa);
		}
		
		System.out.println(this.name+ " defendeu um total de " +this.defesa+ " do dano total");	
		System.out.println("o HP de "+this.name+" agora é de: " +this.hp);
	
	}

}

