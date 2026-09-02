
public class Abastecimento {
	
	public static void main (String[] args) {
		
		Carro c1 = new Carro(125.3);
		Carro c2= new Carro(118.3);
		
		System.out.println(c1.autonomia("gasolina"));
		System.out.println(c1.autonomia("etanol"));
	}
}

