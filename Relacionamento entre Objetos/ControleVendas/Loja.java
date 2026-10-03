

public class Loja {
	
	public static void main(String[] args) {

    Cliente cliente = new Cliente("Carlos", "12345678900", 2000.0);

    Produto produto = new Produto(1, "Notebook", 1500.0);

    Venda venda = new Venda(1, cliente, produto, 2);

    System.out.println(venda.imprimir());
}
}

