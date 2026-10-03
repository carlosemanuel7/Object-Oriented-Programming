public class Contas {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        ContaBancaria c1 = new ContaBancaria();

        p1.setNome("Carlos");
        p1.setCpf("123.456.789-00");
        p1.setEndereco("Rua Bh");
        p1.setTelefone("4002-8922");
        p1.setRenda(2500.0);

        c1.setCliente(p1);
        c1.setNumeroDaConta(1234);
        c1.setSaldo(1000.0);

        System.out.println(c1.depositar(500.f));

        System.out.println(c1.sacar(200.f));

        System.out.println(p1.informacoes());

        System.out.println("Número da conta: " + c1.getNumeroDaConta());
        System.out.println("Saldo: " + c1.getSaldo());

    }
}
