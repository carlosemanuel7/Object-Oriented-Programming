
public class Pickup extends Carro {
	
	private int capacidadeCarga;
	private int pesoCarga;
	
	public Pickup(int passageiros , int combustivel , Double rendimento , boolean cambioAutomatico , int capacidadeCarga , int pesoCarga){
		
		super(passageiros , combustivel , rendimento , cambioAutomatico);
		this.capacidadeCarga = capacidadeCarga;
		if (pesoCarga > capacidadeCarga)
		{
			throw new IllegalArgumentException("Capacidade Máxima atingida");
		}
		else
			this.pesoCarga = pesoCarga;
	}
	
	@Override
	public Double autonomia(){
		
		if (this.capacidadeCarga == pesoCarga)
		{
			return super.autonomia() - (super.autonomia() * 0.50);
		}
		else if(this.pesoCarga < this.capacidadeCarga){
			
			return super.autonomia() - (super.autonomia() * 0.25);
		}
		else
			return super.autonomia();
	}
	
	public int getCapacidadeCarga(){
		
		return this.capacidadeCarga;
	}
	public void setCapacidadeCarga(int capacidadeCarga){
		
		this.capacidadeCarga = capacidadeCarga;
	}
	public int getPesoCarga(){
		
		return this.pesoCarga;
	}
	public void setPesoCarga(int pesoCarga){
		if (this.pesoCarga > this.capacidadeCarga)
		{
			throw new IllegalArgumentException("Capacidade Maxima atingida");
		}
		else
			this.pesoCarga = pesoCarga;
	}
}

