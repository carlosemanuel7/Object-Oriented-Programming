
public class Reserva {

		private int codigo;
		private String nomeHospede;
		private int diarias;
		private boolean incluiRefeicoes;
		
		public Reserva(int codigo , String nomeHospede , int diarias){
			
			this.codigo = codigo;
			this.nomeHospede = nomeHospede;
			this.diarias = diarias;
			this.incluiRefeicoes = false;
		}
		public Reserva(int codigo , String nomeHospede , int diarias , boolean incluiRefeicoes){
			
			this.codigo = codigo;
			this.nomeHospede = nomeHospede;
			this.diarias = diarias;
			this.incluiRefeicoes = true;
		}
		public int getCodigo(){
			
			return this.codigo;
		}
		public void setCodigo(int codigo){
			
			this.codigo = codigo;
		}
		public String getNomeHospede(){
			
			return this.nomeHospede;
		}
		public void setNomeHospede(String nomeHospede){
			
			this.nomeHospede = nomeHospede;
		}
		public int getDiarias(){
			
			return this.diarias;
		}
		public void setDiarias(int diarias){
			
			this.diarias = diarias;
		}
		public boolean getIncluiRefeicoes(){
			
			return this.incluiRefeicoes;
		}
		public void setIncluiRefeicoes(boolean incluiRefeicoes){
			
			this.incluiRefeicoes = incluiRefeicoes;
		}
		public Double calcularDiaria(){
			
			if (incluiRefeicoes){
				
				return (this.diarias * 200.0) + this.diarias * 50;
			}
			return this.diarias * 200.0;
			
		}
		public Double calcularDiaria(Double taxaLimpeza){
			
			if (incluiRefeicoes){
				
				return ((this.diarias * 200.0) + this.diarias * 50) + taxaLimpeza;
			}
			return (this.diarias * 200.0) + taxaLimpeza;
			
		}
		public Double adicionarPasseio(String tipo){
			
			if (tipo.equalsIgnoreCase("CAVALGADA")){
				
				return 80.0;
				
			}
			else if(tipo.equalsIgnoreCase("TRILHA")){
				
				return 60.0;
			}
			else if(tipo.equalsIgnoreCase("PESCA")){
				
				return 70.0;
			}
			return -1.0;
			
		}
		public Double adicionarPasseio(String tipo , int quantidade){
			
			if (tipo.equalsIgnoreCase("CAVALGADA")){
				
				return 80.0 * quantidade;
				
			}
			else if(tipo.equalsIgnoreCase("TRILHA")){
				
				return 60.0 * quantidade;
			}
			else if(tipo.equalsIgnoreCase("PESCA")){
				
				return 70.0 * quantidade;
			}
			return -1.0;
		}
		public String exibirReserva(){
			
			return "Reserva " + this.codigo + " – Hospede:" + this.nomeHospede + " – Diárias " + this.diarias;
			
		}
		public String exibirReserva(boolean comDetalhe){
			
			if (comDetalhe)
			{
				return "Reserva " + this.codigo + " – Hospede:" + this.nomeHospede + " – Diárias " + this.diarias + " - Refeiçoes inclusas: Sim" ;
			}
			
			return "Reserva " + this.codigo + " – Hospede:" + this.nomeHospede + " – Diárias " + this.diarias + " - Refeiçoes inclusas: Não" ;
			
		}
		
	
}

