
public class Carro extends Veiculo {
	
	private boolean cambioAutomatico;
	
	public Carro(int passageiros , int combustivel , Double rendimento , boolean cambioAutomatico){
		
		super(passageiros , combustivel , rendimento);
		this.cambioAutomatico = cambioAutomatico;
	}
	public boolean getCarro(){
		
		return this.cambioAutomatico;
	}
	public void setCarro(boolean cambioAutomatico){
		
		this.cambioAutomatico = cambioAutomatico;
	}
	
	@Override
	public Double autonomia(){
		
		if (this.cambioAutomatico){
			
			return super.autonomia() - (super.autonomia() * 0.10);
		}
		else
			return super.autonomia();
	}

}

