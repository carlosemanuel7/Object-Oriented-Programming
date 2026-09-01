
public class Luta {
	
	private Lutador desafiante;
	private Lutador desafiado;
	private int rounds;
	private boolean aprovada;
	
	public Luta(){
		
		this.rounds = 0;
		this.aprovada = false;
		
	}
	public void setDesafiante(Lutador desafiante){
		
		this.desafiante = desafiante;
	}
	public Lutador getDesafiante(){
		
		return this.desafiante;
	}
	public void setDesafiado(Lutador desafiado){
		
		this.desafiado = desafiado;
	}
	public void setRounds(int rounds){
		
		this.rounds = rounds;
	}
	public Lutador getDesafiado(){
		
		return this.desafiado;
	}
	public void setAprovar(boolean aprovada){
		
		this.aprovada = aprovada;
	}
	public boolean getAprovar(){
		
		return this.aprovada;
	}
	public void marcarLuta(Lutador desafiante , Lutador desafiado){
		
		this.setDesafiante(desafiante);
		this.setDesafiado(desafiado);
		 
		if (this.getDesafiante().equals(getDesafiado()))
		{
			System.out.println("Lutadores inválidos");
			return;
		}
		else if(!this.desafiante.getCategoria().equals(this.desafiado.getCategoria())){
			
			System.out.println("Lutadores de categorias diferentes");
			return;
		}	
		else 
			System.out.println("Luta aprovada");
			this.aprovada = true;
			luta();
	}
	public void luta(){
		
		if (this.aprovada == false)
		{
			System.out.println("Não tem nenhuma luta aprovada no momento");
			return;
		}
		System.out.println("O vencedor foi " +desafiante.getNome());
		this.desafiante.setVitorias(this.desafiante.getVitorias() + 1);
		this.desafiado.setDerrotas(this.desafiado.getDerrotas() + 1);
		
	}
}


