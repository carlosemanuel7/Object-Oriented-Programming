
public class Onibus {
	
	private int numero;
	private String linha;
	private int capacidade;
 	private int passageirosAtuais;
	private Double tarifa;

	
	public Onibus(int numero , String linha , int capacidade , Double tarifa){
		
		this.numero = numero;
		this.linha = linha;
		this.capacidade = capacidade;
		this.tarifa = tarifa;
		this.passageirosAtuais = 0;
		
	}
	public Onibus(int numero , String linha , int capacidade){
		
		this.numero = numero;
		this.linha = linha;
		this.capacidade = capacidade;
		this.tarifa = 4.50;
		this.passageirosAtuais = 0;
		
	}
	public int getNumero(){
		
		return this.numero;
	}
	public void settNumero(int numero){
		
		this.numero = numero;
	}
	public int getCapacidade(){
		
		return this.capacidade;
	}
	public void setCapacidade(int capacidade){
		
		this.capacidade = capacidade;
	}
	public int getPassageirosAtuais(){
		
		return this.passageirosAtuais;
	}
	public void setPassageirosAtuais(int passageirosAtuais){
		
		this.passageirosAtuais = passageirosAtuais;
	}
	public Double getTarifa(){
		
		return this.tarifa;
	}
	public void setTarifa(Double tarifa){
		
		this.tarifa = tarifa;
	}
	public String getLinha(){
		
		return this.linha;
	}
	public void setLinha(String linha){
		
		this.linha = linha;
	}
	public boolean embarcarPassageiro(){
		
		if (this.capacidade - this.passageirosAtuais >= 1){
			
			this.passageirosAtuais+=1;
			return true;
		
		}
		return false;
		
	}
	public boolean embarcarPassageiro(int quantidade ){
		
		if (this.capacidade - this.passageirosAtuais >= quantidade){
			
			this.passageirosAtuais+=quantidade;
			return true;

		}
		return false;
	}
	public boolean desembarcarPassageiro(){
		
		if (this.passageirosAtuais >= 1){
			
			this.passageirosAtuais-=1;
			return true;
		
		}
		return false;
		
	}
	public boolean desembarcarPassageiro(int quantidade ){
		
			if (this.passageirosAtuais >= quantidade){
			
			this.passageirosAtuais-=quantidade;
			return true;
		
		}
		return false;
	}
	public Double calcularRenda(String tipoTarifa){
		
		if (tipoTarifa.equalsIgnoreCase("SIMPLES")){
			
			return (passageirosAtuais * tarifa);
		}
		else if (tipoTarifa.equalsIgnoreCase("INTEGRADA")){
			
			return (passageirosAtuais * tarifa * 1.5);
		}
		return -1.0;
	
	}
	public String exibirInfo(){
		
		return "Onibus: " + "["+this.getNumero()+"]" + " - Linha: " + "["+this.getLinha()+"]" ;
	}
	public String exibirInfo(boolean detalhado){
		
		if (detalhado){
			
				return "Onibus: " + "["+this.getNumero()+"]" + " - Linha: " + "["+this.getLinha()+"]" +" - Passageiros: " +
				 "["+this.getPassageirosAtuais()+"]" + "["+this.getCapacidade()+"]"  + " - Tarifa: " + "["+this.getTarifa()+"]" ;
		}
		return "Onibus: " + "["+this.getNumero()+"]" + " - Linha: " + "["+this.getLinha()+"]" + " - Tarifa: " + "["+this.getTarifa()+"]" ;
	}
	
}

