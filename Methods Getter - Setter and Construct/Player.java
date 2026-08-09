import java.util.Random;

public class Player {
	
	String name; 
	String role; 
	String arma;
	private int hp = 1000;
	private int dano;
	private int defesa;
	Random random = new Random();
	
	public Player(String n ,String r ,String a ){ //Construct
		
		this.name = n;
		this.role = r;
		this.arma = a;
		
	}
	
	void status(){
		
		System.out.println("Player stats");
		System.out.println("Name: " +this.name);
		System.out.println("Classe: " +this.role);
		System.out.println("Arma: " +this.arma);
		System.out.println("Hp:"  +this.hp);
		
	}
	
	void setHp(int hp){
		
		this.hp = hp;
		
	}
	
	int getHp(){
		
		if(this.hp > 0){
				
			return this.hp;
			
			
		}
		else{
			 System.out.print("Player dead");
			 return 0;
		}
	}
	void setDano(int dano){
		
		this.dano = dano;
	}
	int getDano(){
		
		return this.dano;
		
	}
	void atacar(Boss b){
		
		for (int i = 0; i < 1; i++){
			
			dano = random.nextInt (3000);
			
		}
		
		System.out.println("O ataque de " +this.name+ " com " +this.arma+ " causou " +dano+ " de dano");
		b.setHp(b.getHp() - this.dano);
	}
	void defender(){
		
		
		for (int i = 0; i < 1; i++){
			
			defesa = random.nextInt(10);
			
		}
		
		System.out.println(this.name+ " defendeu um total de " +this.defesa+ " do dano total");	
		System.out.println("o HP de "+this.name+" agora é de: " +this.hp);
	
	}

}

