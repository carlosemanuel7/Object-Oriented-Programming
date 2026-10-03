public class Principal {

    public static void main(String[] args) {

        Data hoje = new Data(3, 10, 2026);
        Data nascimento = new Data(15, 5, 2004);

        Pessoa p1 = new Pessoa("Carlos");
        Pessoa p2 = new Pessoa("Luis", "Masculino", nascimento);

        
        System.out.println(p1.mostraIdade(hoje));
        System.out.println(p2.mostraIdade(hoje));

      
        System.out.println(hoje.retornaData());
        System.out.println(nascimento.retornaData());

      
        System.out.println(hoje.calculaTempo(nascimento));
    }
}
