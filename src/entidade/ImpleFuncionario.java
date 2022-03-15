package entidade;

public class ImpleFuncionario {

	private Integer id;
	private String nome;
	private Double salario;

	public ImpleFuncionario(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public ImpleFuncionario() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public void incrementoSalario(double porcentage) {
		salario += salario * porcentage / 100.0;
	}

	public String toString() {
		return "id: "+ id + " | nome: " + nome + " | salário: " + String.format("%.2f ", salario) + "$";
	}
}
