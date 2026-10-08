public class Empresa {

	public static void main(String[] args) {
		
		SetorPessoal setor = new SetorPessoal(5);

		Funcionario f1 = new Funcionario(1, 10, "Carlos", 3000.0, "Desenvolvedor back-end");
		Funcionario f2 = new Funcionario(2, 10, "Rafa", 3500.0, "Desenvolvedor de Games");
		Funcionario f3 = new Funcionario(3, 20, "Melete", 6000.0, "Tech-Lead");
		Funcionario f4 = new Funcionario(4, 20, "Drod", 2500.0, "Desenvolvedor front-end");
		Funcionario f5 = new Funcionario(5, 30, "Lorenz", 2800.0, "Analista de Banco de dados");

		System.out.println("=== ADICIONANDO FUNCIONÁRIOS ===");

		System.out.println(setor.adicionarFuncionario(f1));
		System.out.println(setor.adicionarFuncionario(f2));
		System.out.println(setor.adicionarFuncionario(f3));
		System.out.println(setor.adicionarFuncionario(f4));
		System.out.println(setor.adicionarFuncionario(f5));

		System.out.println("\n=== BUSCAR POR MATRÍCULA ===");

		System.out.println(setor.buscarFuncionario(3));

		System.out.println("\n=== BUSCAR POR NOME ===");

		System.out.println(setor.buscarFuncionario("Carlos"));

		System.out.println("\n=== DEPARTAMENTO 10 ===");

		Funcionario[] lista = setor.listarFuncionario(10);

		for (Funcionario f : lista) {

			if (f != null) {
				System.out.println(f);
				System.out.println("");
			}
		}

		System.out.println("\n=== FUNÇÃO PROGRAMADOR ===");

		lista = setor.listarFuncionario("Tech-Lead");

		for (Funcionario f : lista) {

			if (f != null) {
				System.out.println(f);
				System.out.println("");
			}
		}

		System.out.println("\n=== TODOS OS FUNCIONÁRIOS ===");

		lista = setor.listarFuncionario();

		for (Funcionario f : lista) {

			if (f != null) {
				System.out.println(f);
				System.out.println("");
			}
		}

		System.out.println("\n=== REMOVENDO Rafa ===");

		System.out.println(setor.removerFuncionario(f2));

		System.out.println("\n=== TODOS APÓS REMOÇÃO ===");

		lista = setor.listarFuncionario();

		for (Funcionario f : lista) {

			if (f != null) {
				System.out.println(f);
				System.out.println("");
			}
		}

		System.out.println("\n=== REMOVENDO RAFA NOVAMENTE ===");

		System.out.println(setor.removerFuncionario(f2));


		System.out.println("\n=== BUSCAR MATRÍCULA INEXISTENTE ===");

		System.out.println(setor.buscarFuncionario(99));


		System.out.println("\n=== BUSCAR NOME INEXISTENTE ===");

		System.out.println(setor.buscarFuncionario("Lucas"));
	}
}
