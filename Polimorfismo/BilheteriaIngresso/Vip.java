
public class Vip extends Ingresso {
	
	private Double adicional;
	
	public Vip(Double valor , Double adicional){
		
		super(valor);
		this.adicional = adicional;
		
	}
	public Double getAdicional(){
		
		return this.adicional;
	}
	public void setAdicional(Double adicional){
		
		this.adicional = adicional;
	}
	public String mostraValor(){
		
		return Double.toString(this.getValor() + adicional);
	}
	
}

