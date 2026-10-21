
public class Veiculo  {
	
	private int passageiros;
	private int combustivel;
	private Double rendimento;
	
	public Veiculo(int passageiros , int combustivel , Double rendimento){
		
		this.passageiros = passageiros;
		this.combustivel = combustivel;
		this.rendimento = rendimento;
	}
	public int getPassageiros(){
		
		return this.passageiros;
	}
	public void setPassageiros(int passageiros){
		
		this.passageiros = passageiros;
	}
	public int getCombustivel(){
		
		return this.combustivel;
	}
	public void setCombustivel(int combustivel){
		
		this.combustivel = combustivel;
	}
	public Double getRendimento(){
		
		return this.rendimento;
	}
	public void setRendimento(Double rendimento){
		
		this.rendimento = rendimento;
	}
	public Double autonomia(){
		
		return this.combustivel * this.rendimento;
	}
}

