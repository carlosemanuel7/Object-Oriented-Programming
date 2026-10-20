public class Normal extends Ingresso{
	
	private boolean pista;
	
	public Normal(Double valor , boolean pista){
		
		super(valor);
		this.pista = pista;
	}
	public boolean getPista(){
		return this.pista;
		
	}
	public void setPista(boolean pista){
		
		this.pista = pista;
	}
	public String mostraValor(){
		
		if(pista)
			return Double.toString (this.getValor() + (this.getValor() * 0.10));
		
		else
			return Double.toString (this.getValor());
		
	}
	
}

