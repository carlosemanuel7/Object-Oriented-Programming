
public class Agenda {
	
	private String nomeDaAgenda;
	private int totalContatos;
	Pessoa [] contatos;
	
	public Agenda(String nomeDaAgenda , int tamanho){
		
		contatos = new Pessoa[tamanho];
		this.nomeDaAgenda = nomeDaAgenda;
	}
	public String getNomeDaAgenda(){
		
		return nomeDaAgenda;
	}
	public void getNomeDaAgenda(String nomeDaAgenda){
		
		this.nomeDaAgenda = nomeDaAgenda;
	}
	public int getTotalContatos(){
		
		return totalContatos;
	}
	public void setTotalContatos(int totalContatos){
		
		this.totalContatos = totalContatos;
	}
	public boolean adicionaPessoa(Pessoa pessoa){
		
		for (int i = 0; i < contatos.length; i++){
			
			if (contatos[i] == null){
				
				contatos[i] = pessoa;
				return true;
			}
		}
		return false;
		
	}
	public boolean removePessoa(Pessoa pessoa){
		
		for (int i = 0; i < contatos.length; i++){
			
			if(contatos[i] != null){
				
				if (contatos[i] == pessoa){
				
					contatos[i] = null;
					return true;
				}
			}	
		}
		return false;
		
	}
	public boolean alteraInformacoes(Pessoa pessoa) {

		for (int i = 0; i < contatos.length; i++) {

			if (contatos[i] != null) {

				if (contatos[i].getNome().equals(pessoa.getNome())) {

					contatos[i] = pessoa;
					return true;
				}
			}
		}
    return false;
	}
	public Pessoa buscaContato(String nome){
		
		for (int i = 0; i < contatos.length; i++){
			
			if(contatos[i] != null){
				
				if (contatos[i].getNome() == nome){
				
					return contatos[i];
				}
			}	
		}
		return null;
		
	}
	public Pessoa[] buscaPessoa(){
		
		Pessoa [] lista = new Pessoa[contatos.length];
		int posicao = 0;
		for (int i = 0; i < contatos.length; i++){
			
			if(contatos[i] != null){
				
				lista[posicao] = contatos[i];
				posicao++;
			}	
		}
		for (int i = 0; i < lista.length - 1; i++){
			
			for (int j = 0; j < lista.length - i - 1; j++)
			{
				if (lista[j] != null && lista[j+1] != null){
					
					if (lista[j].getDiaDeNascimento() > lista[j + 1].getDiaDeNascimento() )
					{
						Pessoa temp = lista[j];
						lista[j] = lista[j + 1];
						lista[j + 1] = temp;
					}
				}
			}
			
		}
		return lista;
	}
}

