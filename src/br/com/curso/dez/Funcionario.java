package br.com.curso.dez;

public class Funcionario {
	private Integer Id;
	private String nome;
	private Double salario;

	public Funcionario() {
		
	}
	public Funcionario(Integer id, String nome, Double salario) {
		super();
		Id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Integer getId() {
		return Id;
	}

	public String getNome() {
		return nome;
	}

	public void aumentarSalario(double porcentagemAumento) {
		double aumento = 100 + porcentagemAumento;
		double total = salario * aumento / 100;
		salario = total;
	}

	@Override
	public String toString() {
		return "Funcionario [Id=" + Id + ", nome=" + nome + ", salario=" + salario + "]";
	}

}
