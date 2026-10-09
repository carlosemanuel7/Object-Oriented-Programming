public class Principal {

    public static void main(String[] args) {

        Agenda agenda = new Agenda("Agenda Pessoal", 5);

        Pessoa p1 = new Pessoa("Carlos", 15, 5, "99999-1111");
        Pessoa p2 = new Pessoa("Maria", 20, 5, "99999-2222");
        Pessoa p3 = new Pessoa("Joao", 10, 8, "99999-3333");
        Pessoa p4 = new Pessoa("Ana");
        Pessoa p5 = new Pessoa("Pedro", 25, 8, "99999-5555");

        System.out.println("=== CADASTRANDO CONTATOS ===");
        System.out.println(agenda.adicionaPessoa(p1));
        System.out.println(agenda.adicionaPessoa(p2));
        System.out.println(agenda.adicionaPessoa(p3));
        System.out.println(agenda.adicionaPessoa(p4));
        System.out.println(agenda.adicionaPessoa(p5));

		System.out.println("\n=== TODOS OS CONTATOS ===");
		Pessoa [] pessoas = agenda.buscaPessoa();
		
		 for (Pessoa pessoa : pessoas) {
            if (pessoa != null) {
                System.out.println(pessoa);
            }
        }
		
        System.out.println("\n=== BUSCAR CONTATO ===");
        System.out.println(agenda.buscaContato("Maria"));

        System.out.println("\n=== ALTERAR CONTATO ===");
        Pessoa p6 = new Pessoa("Maria", 20, 5, "88888-4444");
        System.out.println(agenda.alteraInformacoes(p6));
        System.out.println(agenda.buscaContato("Maria"));

        System.out.println("\n=== ANIVERSARIANTES DE MAIO ===");
        pessoas = agenda.buscaPessoa();

        for (Pessoa pessoa : pessoas) {
            if (pessoa != null && pessoa.getMesDeNascimento() == 5) {
                System.out.println(pessoa);
            }
        }

      System.out.println("\n=== TELEFONES CADASTRADOS ===");

		for (Pessoa pessoa : pessoas) {
			if (pessoa != null && !"Indefinido".equals(pessoa.getTelefone())) {
				System.out.println(pessoa.getNome() + ": " + pessoa.getTelefone());
			}
		}
	
        System.out.println("\n=== REMOVENDO CONTATO ===");
        System.out.println(agenda.removePessoa(p3));

        System.out.println("\n=== TODOS OS CONTATOS APÓS REMOÇÃO ===");
        pessoas = agenda.buscaPessoa();

        for (Pessoa pessoa : pessoas) {
            if (pessoa != null) {
                System.out.println(pessoa);
            }
        }

        System.out.println("\n=== REMOVENDO NOVAMENTE ===");
        System.out.println(agenda.removePessoa(p3));

        System.out.println("\n=== BUSCAR CONTATO INEXISTENTE ===");
        System.out.println(agenda.buscaContato("Lucas"));
    }
}

