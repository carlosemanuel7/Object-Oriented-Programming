public class ControleRemoto implements Controlador{
	
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	public ControleRemoto(){
		
		this.volume = 50;
		this.ligado = true;
		this.tocando = false;
		
	}
	private int getVolume(){
		
		return this.volume;
	}
	private void setVolume(int volume){
		
		this.volume = volume;
	}
	private boolean getLigado(){
		
		return this.ligado;
	}
	private void setLigado(boolean ligado){
		
		this.ligado = ligado;
	}
	private boolean getTocando(){
		
		return this.tocando;
	}
	private void setTocando(boolean tocando){
		
		this.tocando = tocando;
	}
	public void ligar(){
		
		this.setLigado(true);
		
	}
	public void desligar(){
		
		this.setLigado(false);
		
	}
	public void abrirMenu(){
		
		System.out.println("Está ligado? " +this.getLigado());
		System.out.print("Volume: " +this.getVolume());
		for (int i = 0; i < this.getVolume(); i+=5){
			
			System.out.print(" |");
			
		}
		System.out.println("");
		System.out.println("Está Tocando? " +this.getTocando());
		
	}
	public void fecharMenu(){
		
		System.out.println("Fechando Menu...");
		
	}
	public void aumentarVol(){
		
		if (getLigado())
		{
			this.setVolume(this.getVolume() + 5);
		}
		else 
			System.out.print("Tv desligada");

		
	}
	public void abaixarVol(){
		
		if (getLigado())
		{
			this.setVolume(this.getVolume() - 5);
		}
		else 
			System.out.print("Tv desligada");	
	}
	public void ligarMudo(){
		
		if (this.getLigado() && this.getVolume() > 0)
		{
			this.setVolume(0);
		}
		
	}
	public void desligarMudo(){
		
		if (this.getLigado() && this.getVolume() == 0)
		{
			this.setVolume(50);
		}
		
	}
	public void play(){
		
		if (this.getLigado() && getTocando() == false)
		{
			this.setTocando(true);
		}
		
	}
	public void pause(){
		
		if (this.getLigado() && getTocando() == true)
		{
			this.setTocando(false);
		}
		
	}
	
}
