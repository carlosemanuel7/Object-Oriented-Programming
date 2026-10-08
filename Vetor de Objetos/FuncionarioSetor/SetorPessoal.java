

public class SetorPessoal {
	
	private Funcionario [] funcionarios;
	
	public SetorPessoal(int tamanho){
		
		this.funcionarios = new Funcionario[tamanho];
	}
	
	public boolean adicionarFuncionario(Funcionario funcionario){
		
		for (int i = 0; i < funcionarios.length; i++){
			
			if (funcionarios[i] == null)
			{
				funcionarios[i] = funcionario;
				return true;
			}
			
		}
		return false;
	}
	public boolean removerFuncionario(Funcionario funcionario){
		
		for (int i = 0; i < funcionarios.length; i++){
			
			if (funcionarios[i] == funcionario)
			{
				funcionarios[i] = null;
				return true;
			}
		}
		return false;
	}
	public Funcionario buscarFuncionario(int matricula) {

    for (int i = 0; i < funcionarios.length; i++) {

        if (funcionarios[i] != null) {

            if (funcionarios[i].getMatricula() == matricula) {
                return funcionarios[i];
            }
        }
    }
    return null;
	}
	public Funcionario buscarFuncionario(String nome){
			
		for (int i = 0; i < funcionarios.length; i++) {

			if (funcionarios[i] != null) {

				if (funcionarios[i].getNome().equalsIgnoreCase(nome)){
					return funcionarios[i];
				}
			}
		}
    return null;
	}
	
	public Funcionario[] listarFuncionario(int departamento){
		
		Funcionario [] lista = new Funcionario[funcionarios.length];
		
		for (int i = 0; i < funcionarios.length; i++){
			
			if (funcionarios[i] != null) {
				
				if (funcionarios[i].getDepartamento() == departamento){
					
					lista[i] = funcionarios[i];
				}
			
			}
				
		}
		
		for (int i = 0; i < lista.length - 1; i++) {	

			for (int j = 0; j < lista.length - i - 1; j++) {

				if (lista[j] != null && lista[j + 1] != null) {

					if (lista[j].getMatricula() > lista[j + 1].getMatricula()) {

						Funcionario temp = lista[j];
						lista[j] = lista[j + 1];
						lista[j + 1] = temp;
					}
				}		
			}	
		}
		return lista;
	}
	public Funcionario[] listarFuncionario(String funcao){
		
	Funcionario [] lista = new Funcionario[funcionarios.length];
		
		for (int i = 0; i < funcionarios.length; i++){
			
			if (funcionarios[i] != null){
				
				if (funcionarios[i].getFuncao() == funcao){
				
					lista[i] = funcionarios[i];
				}
			}	
		}
		
		for (int i = 0; i < lista.length - 1; i++) {	

			for (int j = 0; j < lista.length - i - 1; j++) {

				if (lista[j] != null && lista[j + 1] != null) {

					if (lista[j].getMatricula() > lista[j + 1].getMatricula()) {

						Funcionario temp = lista[j];
						lista[j] = lista[j + 1];
						lista[j + 1] = temp;
					}
				}		
			}	
		}
		return lista;
	
	}
	public Funcionario[] listarFuncionario(){
		
		Funcionario[] lista = new Funcionario[funcionarios.length];

		for (int i = 0; i < funcionarios.length; i++) {

			if (funcionarios[i] != null) {
				lista[i] = funcionarios[i];
			}
		}
		return lista;
		
	}
	
}

