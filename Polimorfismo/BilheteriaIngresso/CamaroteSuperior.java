
public class CamaroteSuperior extends Vip{
	
	private char classe;
	
	public CamaroteSuperior(Double valor , Double adicional , char classe){
		
		super(valor , adicional);
		this.classe = classe;
		
	}
	public char getClasse(){
		
		return this.classe;
	}
	public void setClasse(char classe){
		
		this.classe = classe;
	}
	@Override 
	public String mostraValor(){
		
		if (this.classe == 'A'){
			return Double.toString (this.getAdicional() + this.getValor() + ((this.getAdicional() + this.getValor()) * 0.75));
		}
		else
			return Double.toString (this.getAdicional() + this.getValor() + ((this.getAdicional() + this.getValor()) * 0.50));

	}
}

