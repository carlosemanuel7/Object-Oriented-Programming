
public class Data {
	
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia , int mes , int ano){
		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	public Data(){
	
	}
	
	public int getDia(){
		
		return this.dia;
	}
	public void setDia(int dia){
		
		this.dia = dia;
	}
	public int getMes(){
		
		return this.mes;
	}
	public void setMes(int mes){
		
		this.mes = mes;
	}
	public int getAno(){
		
		return this.ano;
	}
	public void setAno(int ano){
		
		this.ano = ano;
	}
	public String retornaData(){
		
		return this.getDia() + "/" + this.getMes() + "/" + this.getAno();
	}
	public String calculaTempo(Data data){
		
		int maior;
		int maior1;
		int maior2;
		int menor;
		int menor1;
		int menor2;
		if (this.ano > data.ano){
			
			maior = this.ano;
			menor = data.ano;
			
		}
		else{
			maior = data.ano;
			menor = this.ano;
		}
		if (this.mes > data.mes){
				
			maior1 = this.mes;
			menor1 = data.mes;
		}
		else{
			maior1 = data.mes;
			menor1 = this.mes;
		}
		if (this.dia > data.dia){
			
			maior2 = this.dia;
			menor2 = data.dia;
		}
		else{
			maior2 = data.dia;
			menor2 = this.dia;
		}
		
		return "A diferença é de: " + (maior - menor) + " Ano(s) " + (maior1 - menor1) + " Mes(es) " + "e " + (maior2 - menor2) + " Dia(s) ";
	}
}

