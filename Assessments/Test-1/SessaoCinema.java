
public class SessaoCinema {
	
	private int numeroDaSala;
	private String filme;
	private int capacidade;
	private int ingressosVendidos;
	private Double precoIngresso;
	
	public SessaoCinema(int numeroDaSala , String filme , int capacidade){
		
		this.numeroDaSala = numeroDaSala;
		this.filme = filme;
		this.capacidade = capacidade;
		this.ingressosVendidos = 0;
		this.precoIngresso = 25.0;
	}
	public SessaoCinema(int numeroDaSala , String filme , int capacidade , Double precoIngresso){
		
		this.numeroDaSala = numeroDaSala;
		this.filme = filme;
		this.capacidade = capacidade;
		this.precoIngresso = precoIngresso;
		this.ingressosVendidos = 0;
		
	}
	public int getNumeroDaSala(){
		
		return this.numeroDaSala;
	}
	public void setNumeroDaSala(int numeroDaSala){
		
		this.numeroDaSala = numeroDaSala;
	}
	public String getFilme(){
		
		return this.filme;
	}
	public void setFilme(String filme){
		
		this.filme = filme;
	}
	public int getCapacidade(){
		
		return this.capacidade;
	}
	public void setCapacidade(){
		
		this.capacidade = capacidade;
	}
	public int getIngressosVendidos(){
		
		return this.ingressosVendidos;
	}
	public void setIngressosVendidos(){
		
		this.ingressosVendidos = ingressosVendidos;
	}
	public Double getPrecoIngresso(){
		
		return this.precoIngresso;
	}
	public void setPrecoIngresso(){
		
		this.precoIngresso = precoIngresso;
	}
	public Double venderIngresso(){
		
		if(this.capacidade - ingressosVendidos >= 1){
			
			this.ingressosVendidos+=1;
			return precoIngresso * 1;
			
		}
		return -1.0;
		
	}
	public Double venderIngresso(int quantidade){
		
		if (this.capacidade - this.ingressosVendidos >= quantidade)
		{
			this.ingressosVendidos+=quantidade;
			return precoIngresso * quantidade;
		}
		return -1.0;
		
	}
	public Double venderIngresso(int quantidade, boolean meiaEntrada){
		
		if (this.capacidade - this.ingressosVendidos >= quantidade && meiaEntrada)
		{
			this.ingressosVendidos+=quantidade;
			return (precoIngresso * quantidade) * 0.50 ;
		}
		else if (this.capacidade - this.ingressosVendidos >= quantidade)
		{
			this.ingressosVendidos+=quantidade;
			return (precoIngresso * quantidade);
		}
		return - 1.0;
		
	}
	public Double calcularBilheteria(){
		
		return this.ingressosVendidos * this.precoIngresso;
		
	}
	public String exibirSessao(){
		
		return "Sala " + this.numeroDaSala + " - Filme: " + this.filme + " - Ingresso R$" + this.precoIngresso;
		
	}
	public String exibirSessao(boolean mostrarLotacao){
		
		if(mostrarLotacao){
			
			return "Sala " + this.numeroDaSala + " - Filme: " + this.filme + " - Ingresso R$ "
			 + this.precoIngresso + " - Lotação " + this.ingressosVendidos+"/"+this.capacidade;
		}
		return "Sala " + this.numeroDaSala + " - Filme: " + this.filme + " - Ingresso R$ " + this.precoIngresso;
	}
}

