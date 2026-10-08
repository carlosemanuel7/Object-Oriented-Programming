
public class Funcionario {
	
	private int matricula;
	private String nome;
	private int departamento;
	private Double salario;
	private String funcao;
	
	public String toString() {
	return "Matrícula: " + getMatricula() +
		   "\nDepartamento: " + getDepartamento() +
		   "\nNome: " + getNome() +
		   "\nSalário: " + getSalario() +
		   "\nFunção: " + getFuncao();
	}
	public Funcionario(int matricula , int departamento , String nome , Double salario , String funcao){
		
		this.matricula = matricula;
		this.departamento = departamento;
		this.nome = nome;
		this.funcao = funcao;
		this.salario = salario;
		
		
	}
	
	public int getMatricula(){
		
		return this.matricula;
	}
	public void setMatricula(int matricula){
		
		this.matricula = matricula;
	}
	public int getDepartamento(){
		
		return this.departamento;
	}
	public void setDepartamento(int departamento){
		
		this.departamento = departamento;
	}
	public Double getSalario(){
		
		return this.salario;
	}
	public void setSalario(Double salario){
		
		this.salario = salario;
	}
	public String getFuncao(){
		
		return this.funcao;
	}
	public void setFuncao(String funcao){
		
		this.funcao = funcao;
	}
	public String getNome(){
		
		return this.nome;
	}
	public void setNome(String nome){
		
		this.nome = nome;
	}
}

