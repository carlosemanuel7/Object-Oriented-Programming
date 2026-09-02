
public class  Carro {
	
	private double combustivel;
	
	public Carro(){
		
		this.combustivel = 0;
	}
	public Carro(double comb){
		
		this.combustivel = comb;
	}
	public void setCombustivel(double comb){
		
		this.combustivel = comb;
	}
	public double getCombustivel(){
		
		return this.combustivel;
	}
	public double autonomia(){
		
		return this.getCombustivel() * 12;
	}
	public double autonomia(String tipoComb){
		
		if (tipoComb.equals("gasolina"))
		{
			return this.getCombustivel()* 12;
		}
		else 
			return this.getCombustivel() * 8;
	}
	public double autonomia(String tipoComb , int abastecimento){
		
		this.setCombustivel(abastecimento);	
		if (tipoComb.equals("gasolina"))
		{
			return this.getCombustivel() * 12;
		}
		else 
			return this.getCombustivel() * 8;
	}
	public double autonomia(String tipoComb , boolean carga ){
		
		
		if (tipoComb.equals("gasolina") && carga == true)
		{
			return this.getCombustivel() * 12  - (getCombustivel() * 12 * 0.30);
		}
		else if(carga == false) {
			
			return this.getCombustivel() * 12;
		}		
			
		else if(tipoComb.equals("etanol") && carga == true){
			
			return this.getCombustivel() * 8  - (getCombustivel() * 8 * 0.30);
		}
		else{
			return this.getCombustivel() * 8;
		}
	}	
}
