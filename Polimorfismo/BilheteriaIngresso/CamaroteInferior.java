
public class CamaroteInferior extends Vip {
	
	private String localizacao;
	
	public CamaroteInferior(Double valor ,Double adicional , String localizacao){
		
		super(valor , adicional);
		this.localizacao = localizacao;
		
	}
	public String getLocalizacao(){
		
		return this.localizacao;
	}
	public void setLocalizacao(String localizacao){
		
		this.localizacao = localizacao;
	}
	
	@Override
	public String mostraValor(){
		
		if (this.localizacao.equalsIgnoreCase("frontal")){
			return Double.toString (this.getAdicional() + this.getValor() + ((this.getAdicional() + this.getValor()) * 0.35));
		}
		else 
			return Double.toString (this.getAdicional() + this.getValor() + ((this.getAdicional() + this.getValor()) * 0.20));

	}
	
}

