
public class Hatch extends Carro {
	
	private int bagageiro;
	
	public Hatch(int passageiros , int combustivel , Double rendimento , boolean cambioAutomatico , int bagageiro){
		
		super(passageiros , combustivel , rendimento , cambioAutomatico);
		this.bagageiro = bagageiro;
	}
	public Double calculaVolume(int passageiros){
		
		if (passageiros < 3)
		{
			return this.bagageiro * 2.0;
		}
		if (passageiros == 3)
		{
			return this.bagageiro + (this.bagageiro * 0.50);
		}
		else 
			return this.bagageiro * 1.0;
		
		
		
	}
	public int getBagageiro(){
		
		return this.bagageiro;
	}
	public void setBagageiro(int bagageiro){
		
		this.bagageiro = bagageiro;
	}
	
}

