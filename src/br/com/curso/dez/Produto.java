package br.com.curso.dez;

public class Produto {

	/*Video 89 sobre vetores */
	private String nome;
	private double valor;
	
	public Produto(String nome, double valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", valor= R$" + valor + "]";
	}
	
	
}
