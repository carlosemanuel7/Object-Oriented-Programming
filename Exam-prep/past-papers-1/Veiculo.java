
public class Veiculo {
	
	private String placa;
	private String modelo;
	private String tipo;
	private int quilometragem;
	
	public Veiculo(String placa , String modelo , String tipo){
		
		this.placa = placa;
		this.modelo = modelo;
		this.tipo = tipo;
		this.quilometragem = 0;
		
	}
	public Veiculo(String placa , String modelo , String tipo , int quilometragem){
		
		this.placa = placa;
		this.modelo = modelo;
		this.tipo = tipo;
		this.quilometragem = quilometragem;
		
	}
	public void setPlaca(String placa){
		
		this.placa = placa;
	}
	
	public String getPlaca(){
		
		return this.placa;
	}
	public void setQuilometragem(int quilometragem){
		
		this.quilometragem = quilometragem;
	}
	
	public int getQuilometragem(){
		
		return this.quilometragem;
	}
	public void setModelo(String modelo){
		
		this.modelo = modelo;
	}
	public String getModelo(){
		
		return this.modelo;
	}
	public void setTipo(String tipo){
		
		this.tipo = tipo;
	}
	public String getTipo(){
		
		return this.tipo;
	}
	public Double calcularLocacao(int dias){
		
		if (this.getTipo().equalsIgnoreCase("ECONOMICO")){
			
			this.quilometragem+=dias*100;
			return (dias * 100) + dias * 100 * 0.10;
			
		}
		else if (this.getTipo().equalsIgnoreCase("SUV")){
			
			this.quilometragem+=dias*100;
			return (dias * 150) + dias * 100 * 0.10;
			
		}
		else if (this.getTipo().equalsIgnoreCase("LUXO")){
			
			this.quilometragem+=dias*100;
			return (dias * 250) + dias * 100 * 0.10;
			
		}
		else 
			return -1.0;
		
	}
	public Double calcularLocacao(int dias , int kmRodados){
		
		if (this.getTipo().equalsIgnoreCase("ECONOMICO")){
			
			this.quilometragem+=dias*kmRodados;
			return (dias * 100) + dias * kmRodados * 0.10;
			
		}
		else if (this.getTipo().equalsIgnoreCase("SUV")){
			
			this.quilometragem+=dias*kmRodados;
			return (dias * 150) + dias * kmRodados * 0.10;
			
		}
		else if (this.getTipo().equalsIgnoreCase("LUXO")){
			
			this.quilometragem+=dias*kmRodados;
			return (dias * 250) + dias * kmRodados * 0.10;
			
		}
		else 
			return -1.0;
	}
	public Double calcularLocacao(int dias, int kmRodados , boolean seguro){
		
		if (this.getTipo().equalsIgnoreCase("ECONOMICO") && seguro){
			
			this.quilometragem+=dias*kmRodados;
			return ((dias * 100) + dias * kmRodados * 0.10) + 50 * dias;
			
		}
		else if (this.getTipo().equalsIgnoreCase("SUV") && seguro){
			
			this.quilometragem+=dias*kmRodados;
			return ((dias * 150) + dias * kmRodados * 0.10) + 50 * dias;
			
		}
		else if (this.getTipo().equalsIgnoreCase("LUXO") && seguro){
			
			this.quilometragem+=dias*kmRodados;
			return ((dias * 250) + dias * kmRodados * 0.10) + 50 * dias;
			
		}
		else 
			return -1.0;
	}
	public String exibirDetalhes(){
		
		return "Modelo: " + "["+this.getModelo()+"]" + " - Placa: " + "["+this.getPlaca()+"]" +" - Tipo: " +
		"["+this.getTipo()+"]" + "Quilometragem: " + "["+this.getQuilometragem()+"]";
	}
}

