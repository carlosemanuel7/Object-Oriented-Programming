
public class Carro {
	
	private double combustivel;
	private double quilometragem;
	
	public Carro(double combustivel){
		
		this.setCombustivel(combustivel);
		this.setQuilometragem(0);
	}
	
	public void setCombustivel(double combustivel){
		
		this.combustivel = combustivel;
	}
	
	public double getCombustivel(){
		
		return this.combustivel;
		
	}
	public void setQuilometragem(double quilometragem){
		
		this.quilometragem = quilometragem;
	}
	
	public double getQuilometrageml(){
		
		return this.quilometragem;
		
	}
	public void abastecer(double litros){
		
		this.setCombustivel(this.getCombustivel() + litros);
		System.out.println("------POSTO VIP------");
		System.out.println("Carro Abastecido com sucesso");
		System.out.println("");
	}
	public double autonomia(){
		
		return this.getCombustivel() / 12;
	}	
	public void percorrerDistancia(int distancia){
		
		
		if(this.getCombustivel() * 12 > distancia){
			
			this.setQuilometragem(this.getQuilometrageml() + distancia);
			this.setCombustivel(getCombustivel() - (distancia / 12));
			System.out.println("Kilometros rodados: " +this.getQuilometrageml());
			System.out.println("Combustivel no tanque: " +this.getCombustivel()+" Litros");
		}
		else
			System.out.println("gasolina não dá pra percorrer essa distancia");
		
		
		 
	}
	
}


